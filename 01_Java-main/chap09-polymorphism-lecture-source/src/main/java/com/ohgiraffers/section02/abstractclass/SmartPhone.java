package com.ohgiraffers.section02.abstractclass;

// java에서는 단일 상속만 가능하다.
public class SmartPhone extends Product/*,java.util.Scanner*/ {

    public SmartPhone() {}

    @Override
    public void absMethod() {

        System.out.println("Product 클래스의 abstMethod를 오버라이딩한 메소드 호출함...");
    }

    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메서드 호출함...");
    }


}
