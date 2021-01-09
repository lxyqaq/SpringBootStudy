package com.lxyqaq.boot;

import com.lxyqaq.boot.bean.Pet;
import com.lxyqaq.boot.bean.User;
import com.lxyqaq.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName MainApplication
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/8 21:09
 * @Version 1.0
 * 主程序类
 * @SpringBootApplication：是一个springboot应用
 */

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        //1.返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //2.查看容器中的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            //System.out.println(name);
        }

        /*Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02 = run.getBean("tom", Pet.class);
        System.out.println("组件：" + (tom01 == tom02));

        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        User user01 = bean.user01();
        User user02 = bean.user01();
        System.out.println(user01 == user02);

        User user03 = run.getBean("user01", User.class);
        Pet tom03 = run.getBean("tom", Pet.class);
        System.out.println("用户的宠物：" + (user03.getPet() == tom03));*/

        //获取组件
        /*String[] beanNamesForType = run.getBeanNamesForType(User.class);
        System.out.println("====================");
        for (String s : beanNamesForType) {
            System.out.println(s);
        }*/

        boolean tom = run.containsBean("tom");
        System.out.println("容器中tom组件: " + tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中user01组件: " + user01);

        boolean tom22 = run.containsBean("tom22");
        System.out.println("容器中tom22组件: " + tom22);

    }

}
