package com.ohgiraffers.exercise.instance;

public class Application {
    public static void main(String[] args) {

        //이름이 Max이고 5살이며 골든 리트리버 종인 강아지를 표현하는 클래스를 만들고,
        //
        //객체를 생성하여 값을 출력하세요.

        Dog dog = new Dog();

        dog.setName("Max");
        dog.setAge(5);
        dog.setKinds("골든 리트리버");

        System.out.println(dog.getInfo());

        Dog dog1 = new Dog();

        dog1.setName("구찌");
        dog1.setAge(11);
        dog1.setKinds("푸들");

        System.out.println(dog1.getInfo());

        Laptop laptop = new Laptop();

        laptop.setBrand("Dell");
        laptop.setModel("XPS 13");
        laptop.setRamStorage("16GB");
        laptop.setSsdStorage("512GB");
        System.out.println(laptop.getInfo());

        Book book = new Book();

        book.setBookName("Effectiva Java");
        book.setWriter("Joshua Bloch");
        book.setPageNumber(416);
        book.setCoverOption("하드커버");
        System.out.println(book.bookGetInfo());


        Person person = new Person();
        person.setAge(30);
        person.setName("James");
        person.setGender('남');
        person.setMaritalStatus("기혼");
        person.setChild("3명");

        System.out.println(person.getInfo());

        Car car = new Car();

        car.setModelName("Tesla Model S");
        car.setModelYear(2022);
        car.setEngine("전기차");

        System.out.println(car.getInfo());



    }
}
