package com.pilling.dao;

import com.pilling.entity.Pills;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PillsDAOImplementation implements PillsDAO{
    @Autowired
    private SessionFactory factory;

    @Override
    public List<Pills> getAllPills(){
        Session session = factory.getCurrentSession();
        List<Pills> allPills =session.createQuery("FROM Pills", Pills.class).getResultList();

        return allPills;
    }

    @Override
    public void savePill(Pills pill){
        Session session = factory.getCurrentSession();
        session.save(pill);
    }

    @Override
    public List<Pills> searchPills(String name){
        Session session = factory.getCurrentSession();
        Query<Pills> query = session.createQuery("FROM Pills WHERE name = :paramName");
        query.setParameter("paramName", name);
        List<Pills> pills = query.list();

        return pills;
    }
}
