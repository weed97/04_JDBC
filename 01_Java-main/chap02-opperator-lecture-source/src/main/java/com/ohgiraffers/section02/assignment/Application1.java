package com.ohgiraffers.section02.assignment;

public class Application1 {
    public static void main(String[] args) {

        /*
         * 대입연산자와 산술 복합 대입 연산자
         * '=' : 왼쪾의 피연산자에 오른쪽에 피연산자를대입함
         * '+=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
         * '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀한 결과를 왼쪽의 피연산자에 대입함
         * '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱합한 결과를 왼쪽의 피연산자에 대입함
         * '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈한 결과를 왼쪽의 피연산자에 대입함
         * * '/%' : 왼쪽의 피연산자에 오른쪽의 피연산자의 나머지를 왼쪽의 피 연산자에 대입함
         *
         * */

        int num = 10;
        int num2 = 10;
        num += 3;
        System.out.println("num = " + num); // 13
//
//        num2 = num2 + 3;
//        System.out.println("num2 = " + num2); // 13

        num -= 5;
//        num = num -5;
        System.out.println("num = " + num); // 8

        num *= 2;
        //num = num * 2;
        System.out.println("num2 = " + num); // 16

        num /= 2;
        //num = num / 2;
        System.out.println("num2 = " + num); // 8

        num %= 3;
        System.out.println("num = " + num); // 2

        /* 주의 사항 : 산술 복합 대입연산자의 작성 순서에 주의해야한다. */

        // num -= 1;
        num =- 1;
        System.out.println("num = " + num);

        num++;



    }
}
