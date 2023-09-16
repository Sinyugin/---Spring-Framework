package com.example.springmvc.dao;

import com.example.springmvc.Product;

import java.util.List;

public interface ProductDao {
    Product findById(Long id);

    Product findByTitle(String title);

    List<Product> findAll();

    void save(Product product);

    void updateTitle(Long id, String title, int cost);

    Product saveOrUpdate(Product product);

    void deleteById(Long id);
}
