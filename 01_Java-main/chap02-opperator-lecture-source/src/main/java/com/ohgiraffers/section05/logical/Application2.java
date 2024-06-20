package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args) {

        /*
         * 논리 연산자의 우선순위와 활용
         *
         * and[&&] 연산과 or[||]연산의 우선순위
         * && : 11위
         * || : 12위
         * -> and연산자 우선순위가 논리 or 연산자 우선순위보다 높다
         * */

        // 1부터 10사이의 값인지 확인
        // 1 <= 변수 <= 100
        // 대문자 A : 65, Z : 90
        // 소문자 a : 97, z : 122
        int num1 = 55;
        System.out.println("1부터 100사이인지 확인 : " + (num1 >= 1 && num1 <= 100)); // true

        int num2 = 166;
        System.out.println("1부터 100사이인지 확인 : " + (num1 >= 1 && num1 <= 100)); //false

        // 영어가 대문자인지 확인
        char ch1 = 'G';
        System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= '2'));


        char ch2 = 'g';
        System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= '2'));

        // 대소문자 상관없이 영문자 y인지 확인
        char ch3 = 'Y';
        System.out.println("영문자 y인지 확인 : " + (ch3 == 'y' || ch3 == 'Y'));
        char ch4 = 'y';
        System.out.println("영문자 y인지 확인 : " + (ch4 == 'y' || ch4 == 'y'));

        // 영문자 인지 확인
        char ch5 = 'f';
        System.out.println("영문자인지 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));
        System.out.println("영문자인지 확인 : " + ((ch5 >= 65 && ch5 <= 90) || (ch5 >= 97 && ch5 <= 122)));

    }
}
