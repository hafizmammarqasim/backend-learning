package com.ammar.expenseManagerDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //This is Manual Object Creation
//        Dev dev = new Dev();
//        dev.compile();

        //What if we want to use Spring
        //Use Dependency of Spring Context


        //ApplicationContext is interface, so can't be used directly
        //Use the class which implements Application Context
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev devWithSpring = (Dev) context.getBean("dev");

        //Now we need to configure the xml file
       // devWithSpring.compile();

        Laptop laptop = devWithSpring.getLaptop();
        laptop.run();
    }
}
