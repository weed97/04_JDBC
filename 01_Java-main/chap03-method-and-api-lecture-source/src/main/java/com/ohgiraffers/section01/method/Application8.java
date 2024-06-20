package com.ohgiraffers.section01.method;

import java.sql.SQLOutput;

public class Application8 {
    public static void main(String[] args) {
        // static 메서드 호출
        // static 메서드 <-> non-static 메서드

        /*
        * static 메소드를 호출하는 방법
        * 클래스명.[메소드명]()
        * */

        System.out.println("10과 20의 합 : " + Application8.sumTwoNumbers(10,20));

        System.out.println("10과 20의 합 : " + sumTwoNumbers(20,30));
    }

    public static int sumTwoNumbers(int first, int second) {

        return first + second;
    }
}
