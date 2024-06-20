package com.ohgiraffers.section04.use2;

public class Application {
    public static void main(String[] args) {

    SaveProvider saveProvider = new FileSaveProvider();

    Person person = new Person(saveProvider);

    person.doSomething();
    }
}
