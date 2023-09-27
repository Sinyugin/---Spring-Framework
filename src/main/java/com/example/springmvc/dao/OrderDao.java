package com.example.springmvc.dao;

import com.example.springmvc.Buyer;
import com.example.springmvc.Order;
import com.example.springmvc.Product;

import java.util.List;

public interface OrderDao {

    List<Product> findByIdProduct(Long id);
    List<Buyer> findById(Long id);

    List<Order> findByAll();
}
