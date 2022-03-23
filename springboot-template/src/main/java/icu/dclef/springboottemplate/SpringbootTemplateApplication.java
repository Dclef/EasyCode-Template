package icu.dclef.springboottemplate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("icu.dclef.springboottemplate.mapper")
public class SpringbootTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTemplateApplication.class, args);
    }

}
