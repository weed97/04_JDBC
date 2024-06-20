package com.ohgiraffers.exercise.instance;

public class Person {
    int age;
    String name;
    char gender;
    String maritalStatus;
    String child;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public String getInfo() {
        return "이름은 " + this.name + "입니다. " + "성별은 " + this.gender +"입니다." + "결혼 유무는 " + maritalStatus + "입니다." + "자식은 몇명인가요 " + child + "입니다. ";
    }

}
