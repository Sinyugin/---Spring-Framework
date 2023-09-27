package com.example.springmvc;

import com.example.springmvc.dao.BuyerDao;
import org.hibernate.Session;

import java.util.List;

public class BuyerDaoImpl implements BuyerDao {
    private SessionFactoryUtils sessionFactoryUtils;
    public BuyerDaoImpl(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }
    @Override
    public Buyer findById(Long id) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Buyer buyer = session.get(Buyer.class, id);
            session.getTransaction().commit();
            return buyer;
        }
    }

    @Override
    public Buyer findByName(String name) {
        return null;
    }

    @Override
    public List<Buyer> findAll() {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            List<Buyer> buyers = session.createQuery("select b from Buyer b").getResultList();
            session.getTransaction().commit();
            return buyers;
        }
    }
}
