package com.spring.example1.spring_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
interface Sport
{
    public void info();
}
@Component
class OutdoorSport implements Sport
{
    @Override
    public void info()
    {
        System.out.println("outdoor games");
    }
}
@Component("testing")
class Tennis
{
    @Autowired
    Sport sport;

    public void setSport(Sport sport)
    {
        this.sport = sport;
    }

    public void playSport() {
        System.out.println("playing tennis");
        sport.info();
    }

}
class Utility
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(configure_component_autowired.class);

        Tennis tennisBean = context.getBean("testing", Tennis.class);
        tennisBean.playSport();

    }
}
