package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//导入spring的配置文件
//@ImportResource(value = "{classpath:beans.xml}")
public class SpringBoot01HelloworldQuick1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01HelloworldQuick1Application.class, args);
    }

}
