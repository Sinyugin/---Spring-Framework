package com.example.springmvc;

import com.example.springmvc.dao.ProductDao;

public class MaiApp {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);

//            Product product = productDao.findById(2L);
//            product.print();
//
//            System.out.println(productDao.findAll());
//            System.out.println(productDao.findByTitle("Молоко"));

//            productDao.save(new Product("Колбаса", 500));
            System.out.println(productDao.findAll());
            productDao.updateTitle(1L, "Новый хлеб", 50);
            System.out.println(productDao.findAll());

            productDao.deleteById(1L);
            System.out.println(productDao.findAll());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutdown();
        }
    }
}
