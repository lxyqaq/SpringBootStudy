package com.lxyqaq.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Person
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/10 22:12
 * @Version 1.0
 */

@Component
@Data
@ToString
@ConfigurationProperties(prefix = "person")
public class Person {

    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String, Object> score;
    private Set<Double> salarys;
    private Map<String, List<Pet>> allPets;

}
