package com.akrem.bean_annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);

       container.getBean(FullTimeMentor.class).createAccount();
        System.out.println(container.getBean(String.class));
        container.getBean("p1",PartTimeMentor.class).createAccount();
        container.getBean(FullTimeMentor.class).createAccount();


    }
}
