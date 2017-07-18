package Springboot.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.help.SpringController.MyFirstSpringBootController;


/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	
    	   SpringApplication.run(MyFirstSpringBootController.class, args);
   
    }
}
