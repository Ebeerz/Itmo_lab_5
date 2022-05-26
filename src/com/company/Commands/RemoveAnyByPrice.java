package com.company.Commands;

import com.company.Org.Product;
import com.company.Org.ProductCollection;

import java.util.Iterator;

public class RemoveAnyByPrice implements Command{
    @Override
    public String execute(Object arg) {

        try {
            ProductCollection collection = new ProductCollection();
            if (ProductCollection.getSize() == 0) {
                System.out.println(("Коллекция пустая."));
                return null;
            }
            else {
                Long price = Long.parseLong((String) arg);
                for(Iterator<Product> it = (Iterator<Product>) ProductCollection.getCollection().iterator(); it.hasNext();)
                {
                    Product product = (Product) it.next();
                    if (product.getPrice() == price){
                        it.remove();
                        System.out.println("Был удален продукт с price: "+ price.toString());
                        return null;
                    }

                }
                System.out.println("Продукта с price: " + price.toString() + " не найдено");
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String getName() {
        return "remove_any_by_price";
    }

    @Override
    public String getDescription() {
        return "Удаление одного объекта с заданным полем price";
    }
}
