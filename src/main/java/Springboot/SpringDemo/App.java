package Springboot.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



/**
 * Hello world!
 *
 */

@SpringBootApplication
@ComponentScan(basePackages={"com.help.SpringController","Springboot.SpringDemo","SpringbootSwagger2","com.Springboot.Exception"})
public class App 
{
    public static void main( String[] args )
    {
    	
    	   SpringApplication.run(App.class, args);
   
    }
}
