package com.lxyqaq.boot.bean;

/**
 * @ClassName User
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2021/1/9 16:47
 * @Version 1.0
 */
public class User {

    private String name;
    private Integer age;

    private Pet pet;

    public User() {

    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, Integer age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }

}
