package com.lxyqaq.boot.config;

import com.lxyqaq.boot.bean.Car;
import com.lxyqaq.boot.bean.Pet;
import com.lxyqaq.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyConfig
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/9 16:51
 * @Version 1.0
 */

/**
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods：代理bean的方法
 *      Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 *      Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 *      组件依赖必须使用Full模式默认。其他默认是否Lite模式
 *
 * 4、@Import({User.class, DBHelper.class})
 *      给容器中自动创建出这两个类型的组件、默认组件的名字就是全类名
 *
 *
 * 5、@ImportResource("classpath:beans.xml")导入Spring的配置文件，
 *
 */
@Configuration(proxyBeanMethods = true) //告诉SpringBoot这是一个配置类 == 配置文件
@ConditionalOnMissingBean(name = "tom") //条件装配
//1.开启Car的配置绑定
//2.把这个Car这个组件自动注册到容器中
@EnableConfigurationProperties(Car.class)
public class MyConfig {

    @Bean
    public User user01() {
        User user01 = new User("张三", 18);
        //User组件依赖了Pet组件
        user01.setPet(pet01());
        return user01;
    }

    @Bean("tom22")
    public Pet pet01() {
        return new Pet("tomcat");
    }

}
