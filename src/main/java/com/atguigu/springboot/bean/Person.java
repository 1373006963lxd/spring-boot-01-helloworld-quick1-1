package com.atguigu.springboot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中的配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties告诉springboot将本类中的所有属性和配置文件中相关的配置进行绑定
 * prefix = "person" ；配置文件中哪个下面的属性进行映射
 * 只有这个组件是容器中的组件，才能为容器提供ConfigurationProperties功能
 */
//这个注解指定配置文件---注意后面没有s
//@PropertySource(value = {"classpath:person.properties"})
@Data
@Component
@ConfigurationProperties(prefix = "person")
//@Validated//这个注解说明这个javabean里面属性需要校验
public class Person {
    /**
     * <bean class="Person">
     *      <property name="lastName" value=?></property>
     *   </bean>
     */
    //@Value("${person.lastName}")
     //@Email---属性的格式
    private String lastName;
    //@Value("#{11*2}")
    private Integer age;
    private Boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

}
