package com.spring.example1.spring_demo;
import org.springframework.stereotype.Component;

@Component
class Contruction_injection {
    public void test1(){
        System.out.println("test");
    }
}
@Component
class Contruction_injection2 {
        private Contruction_injection contruction_injection;

    public Contruction_injection2(Contruction_injection Contruction_injection) {
        this.contruction_injection=contruction_injection;

    }
}
