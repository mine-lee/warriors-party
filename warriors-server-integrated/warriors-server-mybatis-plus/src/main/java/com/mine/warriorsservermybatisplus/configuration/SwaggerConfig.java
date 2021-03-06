package com.mine.warriorsservermybatisplus.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;

/**
 * 可视化接口调试
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestfulApi() {//api文档实例
        return new Docket(DocumentationType.SWAGGER_2)  //文档类型：DocumentationType.SWAGGER_2
                .apiInfo(apiInfo())//api信息
                .select()//构建api选择器
                .apis(RequestHandlerSelectors.basePackage("com.mine.warriorsservermybatisplus.web"))   //api选择器选择api的包
                .paths(PathSelectors.any())                 //api选择器选择包路径下任何api显示在文档中
                .build();//创建文档
    }

    private ApiInfo apiInfo() {//接口的相关信息
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful接口")
                .description("【mybatis-plus】接口描述")
                .version("1.0")
                .build();
    }
}

