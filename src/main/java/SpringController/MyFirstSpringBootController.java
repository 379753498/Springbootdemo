package SpringController;  

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    @RequestMapping("/{id}/{myName}/{date}")  
    User index(@PathVariable int id ,@PathVariable String myName,@PathVariable String date) throws ParseException {  
    	
    	
    	   ApplicationContext applicationContext = Springutil.getApplicationContext();
    	    
    	   User bean = applicationContext.getBean(User.class);
    	   bean.setName(myName);
    	   bean.setId(id);
    	   bean.setDate(new Date());
    
    	        
    	
    	   a++;

        return bean;  
        
       
    }  

}
