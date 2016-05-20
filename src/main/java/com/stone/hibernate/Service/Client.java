package com.stone.hibernate.Service;

import com.stone.hibernate.Entity.User;
import com.stone.hibernate.Util.StrUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.Random;

/**
 * @auther chenxu03 on 2016/5/20.
 */
public class Client {

    private final static String STR_WITH_CHARATER = "abcdefghijklmnopqrstuvwxyz0123456789";
    private final static String STR_WITH_NUMBER = "0123456789";

    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = null;
        try {
            session = factory.openSession();
            session.beginTransaction();
            User user = new User();
            user.setName(StrUtil.getRandomString(10, STR_WITH_CHARATER));
            user.setPassword(StrUtil.getRandomString(6, STR_WITH_NUMBER));
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
