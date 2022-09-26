package com.akrem.stereotype_annotation;

import com.akrem.bean_annotation.FullTimeMentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APP {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCourse.class);

        context.getBean(FullTimeMentor.class).createAccount();

    }
}
