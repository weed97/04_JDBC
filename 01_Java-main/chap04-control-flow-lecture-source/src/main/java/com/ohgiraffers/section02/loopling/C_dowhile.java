package com.ohgiraffers.section02.loopling;

import java.util.Scanner;

public class C_dowhile {

    /*
    * [do-while 문 표현식]
    *
    * [초기식];
    *
    * do {
    *
    * // 반복할코드
    * // 1회차에는 무조건 실행하고 이후에는 조건식을 확인해만족하는 경우 수행되는 코드.
    * [증감식]
    *
    * } while([조건식])
    * */

    public void testSimpleDoWileStatement()
    {
        do{
            System.out.println("최소 한번은 동작함......");
        } while (false);

        System.out.println("반목문 종료 확인 ....");
    }
    public void testDoWhileExample1() {
        /* 키보드로 문자열을 입력받아 반복적으로 출력
        * */
        Scanner scanner = new Scanner(System.in);

        String str = "";

        do {
            // 반복할 코드
            // 1회차에는 무조건 실행하고 이후에는 조건식을 확인해 만족하는 경우 수행되는 코드.
            // [증감식]

            System.out.println("문자열을 입력하세요 : ");
            str = scanner.nextLine();
            System.out.println(str);

            /*
            * equlas() : 문자열은 == 비교가 불가능하다. Stgring 클래스에서 제공하는 equals() 기능으로 비교가능하다.

            * */
        } while (!str.equals("exit"));

        System.out.println("프로그램을 종료합니다.");

    }
}

