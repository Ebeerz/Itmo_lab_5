package com.company.Commands;

import com.company.Org.ProductCollection;

public class Info implements Command{
    @Override
    public String execute(Object o) {
        ProductCollection collection = new ProductCollection();
        System.out.println("Тип коллекции: " + ProductCollection.getType() + " дата инициализации: " + ProductCollection.getTime() + " количество элементов: " + ProductCollection.getSize());
        return null;
    }

    @Override
    public String getName() {
        return "info";
    }

    @Override
    public String getDescription() {
        return "Вывести информацию о коллекции";
    }
}

