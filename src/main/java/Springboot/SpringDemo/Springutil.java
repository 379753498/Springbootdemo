package Springboot.SpringDemo;  

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Springutil implements ApplicationContextAware {


    private static ApplicationContext applicationContext = null;

    
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (Springutil.applicationContext == null) {
        	Springutil.applicationContext = applicationContext;
        	
        	
        	System.out.println("Springutil.getApplicationContext()方法获取上下文");
        }
    }

    // 获取applicationContext
    public static ApplicationContext getApplicationContext() {
    	  if (Springutil.applicationContext == null) {
          }
		return applicationContext;
    }

    // 通过name获取 Bean.
    public static Object getBean(String name) {
        return getApplicationContext().getBean(name);
    }

    // 通过class获取Bean.
    public static <T> T getBean(Class<T> clazz) {
        return getApplicationContext().getBean(clazz);
    }

    // 通过name,以及Clazz返回指定的Bean
    public static <T> T getBean(String name, Class<T> clazz) {
        return getApplicationContext().getBean(name, clazz);
    }


	
	
}
