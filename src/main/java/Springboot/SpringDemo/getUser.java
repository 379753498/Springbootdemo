package Springboot.SpringDemo;  

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
  

public class getUser {
    @Bean(name="testDemo")
    public User generateDemo() {
    	User demo = new User();
        demo.setId(12345);
        demo.setName("test");
        return demo;
    }
}