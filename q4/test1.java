package com.spring.example1.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
class application_context{
     void test(){
         System.out.println("Bean created");
     }

}
class test{
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext( application_context.class);
        application_context ac = context.getBean( application_context.class);
        ac.test();
    }
}
