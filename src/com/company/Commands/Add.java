package com.company.Commands;

import com.company.Org.Product;
import com.company.Org.ProductCollection;

public class Add implements Command {
    @Override
    public String execute(Object arg) {
        ProductCollection productCollection = new ProductCollection();
        ProductCreator productCreator = new ProductCreator();

        Product product = new Product();
        product = productCreator.create((String) arg);

        ProductCollection.add(product);
        System.out.println("Был добавлен продукт");
        return null;
    }

    @Override
    public String getName() {
        return "add";
    }

    @Override
    public String getDescription() {
        return "добавление объекта";
    }
}
