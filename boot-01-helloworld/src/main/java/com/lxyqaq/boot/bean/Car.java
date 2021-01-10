package com.lxyqaq.boot.bean;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName Car
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/9 18:48
 * @Version 1.0
 */

@Data //get set方法
@NoArgsConstructor //无参数构造器
@AllArgsConstructor //全参数构造器
@ToString //重写toString方法
@EqualsAndHashCode //重写hashcode方法
@Slf4j //引入日志 log.info
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {

    private String brand;
    private Integer price;

}
