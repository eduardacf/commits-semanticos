package br.com.eduardacf.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.function.Predicate;

@Configuration
public class Swagger2Config {


    @Bean
    Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(this.apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(this.paths())
                .build();
    }

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Sistema de geração de commits de forma semântica")
                .version("v1.0")
                .contact(new Contact("Eduarda Ferreira", "https://www.linkedin.com/in/eduarda-ferreira/", "eduarda.cferreira10@gmail.com"))
                .build();
    }

    private Predicate<String> paths() {
        return PathSelectors.regex("/v1.*");
    }


//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("br.com.eduardacf"))
//                .build()
//                .apiInfo(apiInfo());
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Sistema de geração de commits de forma semântica")
//                .version("1.0.0")
//                .contact(new Contact("Eduarda Ferreira", "https://www.linkedin.com/in/eduarda-ferreira/", "eduarda.cferreira10@gmail.com"))
//                .build();
//    }
}

