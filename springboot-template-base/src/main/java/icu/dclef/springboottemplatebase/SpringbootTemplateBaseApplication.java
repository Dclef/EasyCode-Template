package icu.dclef.springboottemplatebase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("icu.dclef.springboottemplatebase.org.mapper")
public class SpringbootTemplateBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTemplateBaseApplication.class, args);
    }

}
