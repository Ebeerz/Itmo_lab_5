package com.company.Commands;

import com.company.Org.Product;
import com.company.Org.ProductCollection;

import java.util.Iterator;

public class RemoveById implements Command{
    @Override
    public String execute(Object arg) {
        try {
            ProductCollection collection = new ProductCollection();
            if (ProductCollection.getSize() == 0) {
                System.out.println(("Коллекция пустая."));
                return null;
            }
            else {
                Long id = Long.parseLong((String) arg);
                for(Iterator<Product> it = (Iterator<Product>) ProductCollection.getCollection().iterator(); it.hasNext();)
                {
                    Product product = (Product) it.next();
                    if (product.getId() == id)
                        it.remove();
                }
                System.out.println("Был удален продукт с id: "+ id.toString());;
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public String getName() {
        return "remove_by_id";
    }

    @Override
    public String getDescription() {
        return "Удаление элемента по заданному id";
    }
}
