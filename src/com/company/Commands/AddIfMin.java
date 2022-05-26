package com.company.Commands;

import com.company.Org.Product;
import com.company.Org.ProductCollection;

import java.util.Comparator;
import java.util.Iterator;

public class AddIfMin implements Command {

    @Override
    public String execute(Object arg) {
        ProductCollection productCollection = new ProductCollection();
        ProductCreator productCreator = new ProductCreator();

        Product product = new Product();
        product = productCreator.create((String) arg);

        for(Iterator<Product> it = (Iterator<Product>) ProductCollection.getCollection().iterator(); it.hasNext();)
        {
            Product productIt = (Product) it.next();
            if (product.compareTo(productIt) >= 0) {
                System.out.println("Значение элемента не меньше чем у меньшего элемента в этой коллекции");
                return null;
            }
        }
        ProductCollection.add(product);
        System.out.println("Был добавлен продукт");

        return null;
    }

    @Override
    public String getName() {
        return "add_if_min";
    }

    @Override
    public String getDescription() {
        return "добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции";
    }
}
