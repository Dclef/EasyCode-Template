package icu.dclef.template;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("icu.dclef.template.mapper")
public class SpringbootTemplateBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTemplateBaseApplication.class, args);
    }

}
