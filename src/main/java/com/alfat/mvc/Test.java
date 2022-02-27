package com.alfat.mvc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        Employee employee = new Employee("Petroliy", "Alfat");
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();

        sessionFactory.close();
    }
}
