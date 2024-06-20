package com.ohgiraffers.section03.interfaceimplements;

public interface InterProduct /*extends java.io.Serializable,java.util.Comparator*/{

    /*
    * 인터페이스가 인터페이스를 상속받을 시에는 extends 키워드를 이용해
    * 여러 인터페이스를 다중 상속 받을 수 있다.
    * */

    /*
    * 인터페이스는 상수 필드만 작성 가능하다.
    * public static final 제어자 조합을 상수 필드라고 부른다.
    * 반드시 선언과 동시에 초기화를 해주어야한다.
    * */
    public static final int MAX_NUM = 100;

    // String name;
    int MIN_NUM = 10;

    // 인터페이스는 생성자를 가질 수 없다.
    // public InterProduct() {}

    // 인터페이스는 구현부가 있는 non-static 메서드를 가질 수 없다.
//    public void nonStaticMethod();
    // 추상 메서드만 작성이 가능하다.
    public abstract void nonStaticMethod();

    /*
    * 인스턴스 안에 작성하는 메서드는 묵시적으로 public abstract의 의미를 가진다. (다른 접근제한자 사용불가
    * => 인터페이스의 메소드를 오버라이딩 하는 경우
    * 반드시 접근제한자를 public으로 해야 오버라이딩이 가능하다.
    * */
    /*public abstract */void abstMethod();

    // static 메서드는 작성이 가능하다. jdk 1.8 이후 추가됨.
    public static void staticMethod() {

        System.out.println("InterProduct 클래스의 staticMethod 호출됨");;

    }

    // default 키워드를 사용하면 non-static 메소드도 작성 가능 jdk 1.8 이후 추가됨
    public default void defaultMethod() {
        System.out.println("InterProduct 클래스의 defaultMethod 호출됨...");
    }


}
