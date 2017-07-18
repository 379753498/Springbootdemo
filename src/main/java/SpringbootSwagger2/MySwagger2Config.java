package SpringbootSwagger2;  

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 @EnableSwagger2
 
 @Configuration
public class MySwagger2Config {

	@Bean
	public  Docket CreateRestApi()
	{
		return new Docket(DocumentationType.SWAGGER_2).
				apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.
						basePackage("com.help.SpringController")).paths(PathSelectors.any()).build();
	
		
	}

	private ApiInfo apiInfo() {
		
		// TODO Auto-generated method stub  
		
		 ApiInfoBuilder title = new ApiInfoBuilder().title("This is a Test title");
		 title.contact(new Contact("xujian", "www.baidu.com", "379753498@qq.com"));
		 title.version("1.0");
		 ApiInfo build = title.description("This is a test").build();
		 
		 return build;
	}
	
}
