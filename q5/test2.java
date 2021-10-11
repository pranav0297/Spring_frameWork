package com.spring.example1.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface Animal {
   public void character();
}
@Component
class Dog implements Animal {
    Animal animal;
    public void character() {
        System.out.println("Bark");
    }
}
@Component
@Primary
    class Cat implements Animal {
        public void character() {
            System.out.println("Meow");
        }
    }
    
@Configuration
@ComponentScan(basePackages = "com.spring.example1.spring_demo")
class testing {

}
    class test {
        public static void main(String[] args) {
            ApplicationContext context = new AnnotationConfigApplicationContext(testing.class);

            Animal animal= context.getBean(Animal.class);
            animal.character();

        }
    }






