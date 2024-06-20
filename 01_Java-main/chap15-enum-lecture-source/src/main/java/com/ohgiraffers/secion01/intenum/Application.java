package com.ohgiraffers.secion01.intenum;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /*
         * Enum (열거타입)
         * 제한된 값 목록이 필요한경우 사용한다.
         *
         * 이넘이란 관련이 있는 상수의 집합의 클래스를 의미한다.
         * 각각의 열거 상수는 열거 객체로 생성된다.
         * 기존의 상수를 정의하는 방법을 효과적으로 대체한다.
         * 1. 정수형 상수는 의미가 있는 문자열로 출력하기 어렵다.
         * 2. 정수 열거 그룹에 속한 상수들을 조회 할 수 없다. (갯수 확인도 불가능)
         * 3. 타입의 안전을 보장 할 수 없다.
         * */

        // 1. 정수값 만을 저장하고 있는 필드 일 뿐
        int subject1 = Subjects.JAVA; // 0
        int subject2 = Subjects.HTML; // 0

        if (subject1 == subject2) {
            System.out.println("두과목은 같은 과목입니다.");
        }

        // 2. 문자열로 출력하기가 까다롭다.
        int num = 0;
        String subjectText = "";


        // switch문을 int 를 매개변수로 입력받고


        // return 없고, 과목명을 출력하는 메소드

        // public static,printsubject() {}

//        switch (num) {
//            case Subjects.JAVA : subjectText = "JAVA"; break;
//            case Subjects.JDBC : subjectText = "JDBC"; break;
//            case Subjects.ORACLE : subjectText = "ORACLE"; break;
//        }

        System.out.println("subjectText : " + subjectText);
        // 3. 타입 안전을 보장할 수 없다.

        Scanner sc = new Scanner(System.in);

        int num1 =sc.nextInt();
        System.out.println("java 0 , jdbc 1 , oracle 2");
        printSubject(1);

    }

    public static void printSubject(int num1) {
        String subject ="";
        switch (num1) {
            case Subjects.JAVA : subject = "JAVA";
            case Subjects.JDBC : subject = "JDBC";
            case Subjects.ORACLE : subject = "ORACLE";

        }
        System.out.println("subject = " + subject);
        }


    }



