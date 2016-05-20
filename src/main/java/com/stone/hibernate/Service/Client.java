package com.stone.hibernate.Service;

import com.stone.hibernate.Entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

/**
 * @auther chenxu03 on 2016/5/20.
 */
public class Client {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = null;
        try {
            session = factory.openSession();
            session.beginTransaction();
            User user = new User();
            user.setName("mikcey" + Math.random());
            user.setPassword("1988903545");
            user.setCreateTime(new Date());
            user.setExpireTime(new Date());
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                if (session.isOpen()) {
                    session.close();
                }
            }
        }
    }
}
