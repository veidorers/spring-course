package com.example;

import com.example.database.pool.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
        var pool = context.getBean("pool1", ConnectionPool.class);
        var driver = context.getBean("driver", String.class);
        System.out.println(driver);
        System.out.println(pool);
    }
}
