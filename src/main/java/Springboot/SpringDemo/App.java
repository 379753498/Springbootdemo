package Springboot.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import SpringController.MyFirstSpringBootController;


/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
    	
    	   SpringApplication.run(MyFirstSpringBootController.class, args);
   
    }
}
