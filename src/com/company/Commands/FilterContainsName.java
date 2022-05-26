package com.company.Commands;

import com.company.Org.Product;
import com.company.Org.ProductCollection;

import java.util.Iterator;

public class FilterContainsName implements Command{
    @Override
    public String execute(Object arg) {
        try {
            ProductCollection collection = new ProductCollection();
            if (ProductCollection.getSize() == 0) {
                System.out.println(("Коллекция пустая."));
                return null;
            }
            else {
                for(Iterator<Product> it = (Iterator<Product>) ProductCollection.getCollection().iterator(); it.hasNext();)
                {
                    Product product = (Product) it.next();
                    if (product.getName().contains((String)arg)){
                        System.out.println(product.toString());
                        return null;
                    }

                }
                System.out.println("Выведены элементы значение поля name которых содержит подстроку " + (String)arg);
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String getName() {
        return "filter_contains_name";
    }

    @Override
    public String getDescription() {
        return "Вывести элементы, значение поля name которых содержит заданную подстроку";
    }
}
