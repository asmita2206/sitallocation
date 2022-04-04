package com.practise.sitallocation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;

@EnableSwagger2
@Configuration
public class SwaggerConfig extends WebMvcConfigurerAdapter {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
               // .apiInfo(apiInfo())
              //  .securityContexts(Arrays.asList(securityContext()))
                .securitySchemes(Arrays.asList(apiKey()))
                .select()
                .apis(RequestHandlerSelectors.any()).build();
    }
//
//    private SecurityContext securityContext() {
//        return SecurityContext.builder().securityReferences(defaultAuth()).build();
//    }

//    private List<SecurityReference> defaultAuth() {
//        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
//        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
//        authorizationScopes[0] = authorizationScope;
//        return Arrays.asList(new SecurityReference("JWT", authorizationScopes));
//    }

    private ApiKey apiKey() {
        return new ApiKey("JWT", "Authorization", "header");
    }
//    private ApiInfo apiInfo() {
//        return new ApiInfo(
//                "My REST API",
//                "Some custom description of API.",
//                "1.0",
//                "Terms of service",
//                new Contact("Uday Bajare", "www.bluescript.com", "udayBajare2@gmail.com"),
//                "License of API",
//                "API license URL",
//                Collections.emptyList());
//    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry)
//    {
//        //enabling swagger-ui part for visual documentation
//        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }
}
