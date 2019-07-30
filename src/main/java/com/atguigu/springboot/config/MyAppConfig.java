package com.atguigu.springboot.config;

import com.atguigu.springboot.controller.HelloController;
import com.atguigu.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//指明当前类是一个配置类，就是来替代之前的spring配置文件
//在配置文件中<bean><bean/>标签添加组件

/*这是第二种方式通配置类*/
@Configuration
public class MyAppConfig {
    //将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService(){
        System.out.printf("配置类@Bean给容器中添加组件");
        return new HelloService();
    }
}
