package com.example.springmvc.dao;

import com.example.springmvc.Buyer;

import java.util.List;

public interface BuyerDao {
    Buyer findById(Long id);
    Buyer findByName(String name);
    List<Buyer> findAll();
}
