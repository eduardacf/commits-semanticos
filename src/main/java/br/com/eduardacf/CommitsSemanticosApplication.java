package br.com.eduardacf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CommitsSemanticosApplication {

    public static void main(String args[]) {
        SpringApplication.run(CommitsSemanticosApplication.class, args);
    }


    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {

            @Override
            public void addCorsMappings(CorsRegistry registry) {

                registry.addMapping("/v1/**")
                        .allowedOrigins("http://localhost:8080")
                        .allowedMethods("*");

                // to heroku allow connections from netlify
                registry.addMapping("/v1/**")
                        .allowedMethods("*");

                registry.addMapping("/swagger-ui/**")
                        .allowedOrigins("*");

                registry.addMapping("/api/v2/api-docs")
                        .allowedOrigins("*");

            }

        };


    }

}
