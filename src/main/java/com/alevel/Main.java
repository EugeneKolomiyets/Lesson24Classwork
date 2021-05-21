package com.alevel;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*        Collection<Product> collection = new ProductDao().getAll();
        for (Product product:collection) {
            System.out.println(String.format("ID: %d",product.id));
            System.out.println(String.format("First Name: %s",product.name));
            System.out.println(String.format("Last Name: %s",product.price));
            System.out.println(String.format("Last Name: %d",product.category_id));
            System.out.println("---------------------------------------------------------------");
        }*/
        ProductDao productDao = new ProductDao(HibernateUtils.getSessionFactory());
        List<Product> products=productDao.getAll();
        System.out.println(products);
        Product newProd = new Product(33,"gg",1,1);
        //prod.add(newProd);
    }
}
