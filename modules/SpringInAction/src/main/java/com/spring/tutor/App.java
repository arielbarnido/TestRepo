package com.spring.tutor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean");
        helloWorld.printHello();
        helloWorld.printNameList();
        helloWorld.printKeyList();
        helloWorld.printPlayerMap();
        helloWorld.printTeams();
        
        
    }
}
