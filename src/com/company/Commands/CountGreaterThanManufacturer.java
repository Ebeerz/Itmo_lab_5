package com.company.Commands;

import com.company.Org.Product;
import com.company.Org.ProductCollection;

import java.util.Iterator;

public class CountGreaterThanManufacturer implements Command{
    @Override
    public String execute(Object arg) {
        ProductCollection productCollection = new ProductCollection();
        ProductCreator productCreator = new ProductCreator();
        int count = 0;

        for(Iterator<Product> it = (Iterator<Product>) ProductCollection.getCollection().iterator(); it.hasNext();)
        {
            Product productIt = (Product) it.next();
            if (productIt.getManufacturer().getId() > Integer.parseInt(arg.toString())) {
                count += 1;
            }
        }
        System.out.println("количество элементов, значение поля manufacturer которых больше заданного: " + count);
        return null;
    }

    @Override
    public String getName() {
        return "count_greater_than_manufacturer";
    }

    @Override
    public String getDescription() {
        return "Вывести количество элементов, значение поля manufacturer которых больше заданного";
    }
}
