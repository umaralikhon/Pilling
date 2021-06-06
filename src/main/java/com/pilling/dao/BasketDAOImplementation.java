package com.pilling.dao;

import com.pilling.entity.Basket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class BasketDAOImplementation implements BasketDAO {
    @Autowired
    private SessionFactory factory;

    @Override
    public List<Basket> getAllPills() {
        Session session = factory.getCurrentSession();
        List<Basket> allPills = session.createQuery("FROM Basket").getResultList();

        return allPills;
    }

    @Override
    public Basket getPill(int id) {
        Session session = factory.getCurrentSession();
        Basket pill = session.get(Basket.class, id);

        return pill;
    }

    @Override
    public void savePill(Basket pill) {
        Session session = factory.getCurrentSession();
        session.saveOrUpdate(pill);
    }

    @Override
    public void truncateTable() {
        Session session = factory.getCurrentSession();
        session.createQuery("DELETE FROM Basket").executeUpdate();
    }
}
