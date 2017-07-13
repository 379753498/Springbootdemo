package SpringController;  

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import org.springframework.web.servlet.ModelAndView;

import Springboot.SpringDemo.Springutil;
import Springboot.SpringDemo.User;



@RestController  
@EnableAutoConfiguration  
public class MyFirstSpringBootController {

	
	@RequestMapping("/")  
    String home() {  
		
		
		
        return "Hello World!";  
    }  
      
	int a=0;
    @RequestMapping("/hello/{myName}")  
    String index(@PathVariable String myName) {  
    	
    	   ApplicationContext applicationContext = Springutil.getApplicationContext();
    	    
    	   User bean = applicationContext.getBean(User.class);
    	   String name = bean.getName();
    	        
    	   System.out.println(name+a);
    	   a++;

        return "Hello "+name+"!!!"+a;  
        
       
    }  

}
