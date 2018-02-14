package com.spring.cms_ivancicek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CmsIvancicekApplication {
    
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CmsIvancicekApplication.class);
    }
    
	public static void main(String[] args) {
		SpringApplication.run(CmsIvancicekApplication.class, args);
	}
}
