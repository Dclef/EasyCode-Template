# EasyCode-Template

基于EasyCode自定义模板,可一键生成restful风格的单表增删查改+高级查询+分页，并默认集成knife4j增强模式的Api文档
的springboot后台
## 如何使用？

### 1.在pom.xml中导包

```xml
<properties>
    <java.version>1.8</java.version>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
    <spring-boot.version>2.3.7.RELEASE</spring-boot.version>
</properties>

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <!--  引入lombok依赖-->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
        <exclusions>
            <exclusion>
                <groupId>org.junit.vintage</groupId>
                <artifactId>junit-vintage-engine</artifactId>
            </exclusion>
        </exclusions>
    </dependency>
    <!--MySQL驱动-->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
    </dependency>
    <!--引入 mybatis-spring-boot-starter 的依赖-->
    <dependency>
        <groupId>org.mybatis.spring.boot</groupId>
        <artifactId>mybatis-spring-boot-starter</artifactId>
        <version>2.2.0</version>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-test</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-test</artifactId>
    </dependency>
       <!--knife4j api文档-->
    <dependency>
        <groupId>com.github.xiaoymin</groupId>
        <artifactId>knife4j-spring-boot-starter</artifactId>
        <version>2.0.9</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <optional>true</optional>
    </dependency>
</dependencies>

<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-dependencies</artifactId>
            <version>${spring-boot.version}</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

### 2.配置application.properties

```properties
# 应用服务 WEB 访问端口
server.port=8080

#数据库连接信息
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/cms?useUnicode=true&characterEncoding=utf8&useSSL=true&serverTimezone=GMT%2B8
spring.datasource.username=root
spring.datasource.password=123456

#配置mybatis的信息
mybatis.type-aliases-package=icu.dclef.entity

#加载mybatis映射文件
mybatis.mapper-locations=classpath:mapper/*Mapper.xml


#增强模式
knife4j.enable=true
#禁用默认的Footer显示
knife4j.setting.enableFooter=false
```



### 3.在idea中下载easycode插件

如图：![](https://cdn.jsdelivr.net/gh/Dclef/CDN/img/2022-01-12-easycode-01-.png)

### 4.导入模板(EasyCodeConfig.json)



![](https://cdn.jsdelivr.net/gh/Dclef/CDN/img/2022-01-12_easycode-02.png)

### 5.使用

![](https://cdn.jsdelivr.net/gh/Dclef/CDN/img/2022-01-12-easycode-03.png)

## 6.示例

在游览器打开http://localhost:8080/doc.html 即可

![](https://cdn.jsdelivr.net/gh/Dclef/CDN/img/2022-01-12-easycode-04.png)

## F&Q

### 出现中文乱码问题

请自行将项目设置为utf-8格式，路径为File->Settings->Editor->File Encodings
