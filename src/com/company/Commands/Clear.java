package com.company.Commands;

import com.company.Org.ProductCollection;

public class Clear implements Command{
    @Override
    public String execute(Object o) {
        ProductCollection collection = new ProductCollection();
        collection.clear();
        System.out.println("Коллекция очищена");
        return null;
    }

    @Override
    public String getName() {
        return "clear";
    }

    @Override
    public String getDescription() {
        return "Очищение коллекции";
    }
}
