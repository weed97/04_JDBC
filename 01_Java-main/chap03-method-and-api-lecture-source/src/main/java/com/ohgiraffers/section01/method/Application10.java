package com.ohgiraffers.section01.method;

public class Application10 {
    public static void main(String[] args) {


        int num1 = 16;
        int num2 = 5;
        Application10 app10 = new Application10();
        System.out.println("두 수의 덧셈 : " + app10.addNum(num1, num2));
        System.out.println("두 수의 뺄셈 : " + app10.addMinus(num1, num2));
        System.out.println("두 수의 곱셈 : " + app10.addMultiple(num1, num2));
        System.out.println("두 수의 나눗셈 : " + app10.addDivide(num1, num2));
        System.out.println("두 수의 나머지 : " + app10.addDivision(num1, num2));
    }

    public int addNum(int num1, int num2) {

        return num1 + num2;
    }

    // 빼기
    public int addMinus(int num1, int num2) {

        return num1 - num2;
    }


    // 곱하기
    public int addMultiple(int num1, int num2) {

        return num1 * num2;
    }


    // 나눗셈
    public int addDivide(int num1, int num2) {

        return num1 / num2;
    }


    // 나머지
    public int addDivision(int num1, int num2) {

        return num1 % num2;
    }

}