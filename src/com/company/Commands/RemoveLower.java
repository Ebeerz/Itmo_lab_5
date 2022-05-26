package com.company.Commands;

import com.company.Org.Product;
import com.company.Org.ProductCollection;

import java.util.Iterator;

public class RemoveLower implements Command {

    @Override
    public String execute(Object arg) {
        ProductCollection productCollection = new ProductCollection();
        ProductCreator productCreator = new ProductCreator();

        Product product = new Product();
        product = productCreator.create((String) arg);
        int count = 0;

        for(Iterator<Product> it = (Iterator<Product>) ProductCollection.getCollection().iterator(); it.hasNext();)
        {
            Product productIt = (Product) it.next();
            if (product.compareTo(productIt) >= 0) {
                it.remove();
                System.out.println("Был удален элемент");
                count++;
            }
        }
        if (count == 0) System.out.println("Не обнаружено элементов меньших чем созданный");
        return null;
    }

    @Override
    public String getName() {
        return "remove_lower";
    }

    @Override
    public String getDescription() {
        return "удалить из коллекции все элементы, меньшие, чем заданный";
    }
}
