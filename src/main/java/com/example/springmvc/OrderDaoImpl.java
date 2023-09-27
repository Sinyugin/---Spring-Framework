package com.example.springmvc;

import com.example.springmvc.dao.OrderDao;
import org.hibernate.Session;

import java.util.List;

public class OrderDaoImpl implements OrderDao {
    private SessionFactoryUtils sessionFactoryUtils;

    public OrderDaoImpl(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

    @Override
    public List<Product> findByIdProduct(Long id) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            List<Product> products = session.createQuery("select p from Product p").getResultList();
            session.getTransaction().commit();
            return products;
        }
    }

    @Override
    public List<Buyer> findById(Long id) {
        return null;
    }

    @Override
    public List<Order> findByAll() {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            List<Order> orders = session.createQuery("select o from Order o").getResultList();
            session.getTransaction().commit();
            return orders;
        }
    }
}
