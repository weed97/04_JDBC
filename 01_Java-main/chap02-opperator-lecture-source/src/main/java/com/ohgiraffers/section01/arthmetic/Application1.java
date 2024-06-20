package com.ohgiraffers.section01.arthmetic;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 산술연산자
        *
        * 산술연산자는 주로 사칙연사과 관련된 연산자로 가장 기본적이면서도 많이 사용됨
        * 연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개인 이항 연산자로 분류되며,
        * 피연산자들의 연산 방향은 왼쪽에서 오른쪽이다.
        * */

        /*
        * 산술연산자의 종류
        *
        * '+' : 왼쪽 피연산에 오른쪽의 피연산자를 더함
        * '-' : 왼쪽 피연산에 오른쪽 피연산자를 뺌
        * '*' : 왼쪽 피연산에 오른쪽의 피연산자를 곱함
        * '/' : 왼쪽 피연산에 오른쪽의 피연산자를 나눈 몫
        * '%' : 왼쪽 피연산에 오른쪽의 피연산자를 나눈 나머지
        *
        * 산술연산자의 우선순위
        * 수학 개념과 유사하게 곱하기와 나누기 연산이 더하기 빼기보다 우선적으로 동작
        * 우선순위가 같은 경우 연산자의 결합 방향에 따라 실행 순서가 결정된다.
        * */

        int num1 = 20;
        int num2 = 7;

        System.out.println("nun1 + num2 = " + (num1 + num2));
        System.out.println("nun1 - num2 = " + (num1 - num2));
        System.out.println("nun1 * num2 = " + (num1 * num2));
        System.out.println("nun1 / num2 = " + (num1 / num2));
        System.out.println("nun1 % num2 = " + (num1 % num2));



    }
}
