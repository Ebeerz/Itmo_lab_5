package com.company.Commands;

import com.company.Org.ProductCollection;

public class Show implements Command{
    @Override
    public String execute(Object o) {
        System.out.println(ProductCollection.getCollection().toString());
        return null;
    }

    @Override
    public String getName() {
        return "show";
    }

    @Override
    public String getDescription() {
        return "Показать коллекцию";
    }
}
