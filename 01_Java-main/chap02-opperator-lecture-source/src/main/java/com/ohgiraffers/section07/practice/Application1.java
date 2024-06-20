package com.ohgiraffers.section07.practice;

public class Application1 {
    public static void main(String[] args) {
        /*산술 연산자*/
        // 1. 변수 a가 15이고, b가 4일때, a/b의 결과를 구하세요.
        int a = 15;
        int b = 4;
        int result1 = a / b;

        System.out.println("result1 = " + result1);

        // 2. 두 수 8과 3에 대해 나머지 연산을 수행하는코드를 작성하세요.
        int c = 8;
        int d = 3;
        int result2 = c % d;
        System.out.println("result2 = " + result2);

        // 3. 5 * 2 - 3을 계산하고 결과를 출력하는 코드를 작성하세요.
        int result3 = 5 * 2 - 3;
        System.out.println("result3 = " + result3);
        /*복합 대입 연산자*/
        // 1. 변수 x가 10일 때, x+=5 결과는 얼마인가요?
        int x = 10;
        x += 5;
        System.out.println("x = " + x);


        // 2. 변수 y가 20일 때, y /= 4의 결과를 구하세요.
        int y = 20;
        y /= 4;
        System.out.println("y = " + y);
        // 3. 변수 z가 8이고, z%-3을 수행한 후의 z의 값을 구하세요.
        int z = 8;
        z %= 3;
        System.out.println("z = " + z);

        /*증감 연산자*/
        // 1. 변수 i가 0일 떄, i++ 후의 i의 값을 출력하세요.
        int i = 0;
        i++;
        System.out.println("i = " + i);
        // int j = 10; 선언 후 -j의 결과를 출력하세요.
        int j = 10;
        System.out.println("-j = " + (-j));
        // int k = -5; 선언 후 k 값을 증가시키고, 증가된 값을 출력하는 코드를 작성하세요.
        int k = -5;
        ++k;
        System.out.println("k = " + k);


        /*비교 연산자*/
        // 1. 두 변수 num1 = 10, num2 = 20이 같은지 비교하는 코드를 작성하세요.
        int num1 = 10; int num2 = 20;
        System.out.println("num1값과 num2값이 같은가요" + ((num1 == num2)? "같다." : "같지 않다."));

        // 2. 15가 10보다 큰지 확인하는 java 코드를 작성하세요.
        System.out.println("15가 10 보다 큰가요 :" + (15> 10));

        // 3. 변수 age가 18 이상인지 확인하는 조건문을 작성하세요.
        int age = 20;
        System.out.println("변수 age는 18 이상인가요? : " + (age >= 18));

        /*논리 연산자*/
        // 1. 변수 a1 = true, b1 = false 일 떄, 둘 다 참이어야 참을 반환하는 조건문을 작성하세요.
        boolean a1 = true;
        boolean b1 = false;

        System.out.println(a1 && b1);

        // 2. int age1 = 20;이 18이상이면서 65미만인지 확인하는 코드를 작성하세요.
        int age1 = 20;
        System.out.println(18 <= age && age < 65);
        // 3. 변수 x =10, y = 20 일 때, x가 10이 아니거나 y가 25이상인지 확인하는 코드를 작성하세요.
        int x1 = 10; int y1 = 20;
        System.out.println(x != 10 || y >= 25);

    }


}