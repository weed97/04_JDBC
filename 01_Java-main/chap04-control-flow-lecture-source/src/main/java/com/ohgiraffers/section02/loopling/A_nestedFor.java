package com.ohgiraffers.section02.loopling;

import java.util.Scanner;

public class A_nestedFor {

    // 중첩 for 문
    // for문 안에 for문을 의미한다.
    public  void printGugudanFromTwoToNine() {
        // 구구단 전체를 출력하는 기능

        for(int dan = 2; dan < 10; dan++){
            System.out.println(dan + "단 입니다.");

            for(int su = 1; su < 10; su++){
                System.out.println(dan + "*" + su +  " = " +(dan*su));
            }

            //줄바꿈

            System.out.println();
        }
    }

    public void printUpgradeGugudanFromTwoToNine() {

        for(int dan = 2; dan < 10; dan ++)
        {
            // 단 * (1 ~ 9)
            printGugudanOf(dan);
            System.out.println();
        }
    }
    // 한단씩 구구단을 출력하는 메서드
    public void printGugudanOf(int dan){

        for(int su = 1; su < 10; su++) {
            System.out.println(dan + " *" + su + "=" + (dan * su));

        }
    }

    /*
    * 키보드로 정수를 하나 입력받아 정수만큼 한 행에 "*"을 5개씩 출력하세요
    * */
    public void printStarInpiutRowTimes() {

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 행 수를 입력하세요 :");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            printStar(row);

        }
    }
        public void printTriangleStars() {
            /*
            * 키보드로 정수를 하나 입력받아, 해당 정수만큼 한 행에 "*"을 행의 번호개씩 출력하세요
            *
            * 예시) 정수를 입력하세요 : 5
            * *
            * **
            * ***
            * ****
            * *****
            *
            * */
        Scanner sc = new Scanner(System.in);
            System.out.println("출력할 줄의 수를 입력하세요 ");
            int row = sc.nextInt();

            for (int i = 0; i < row; i++) {

                for (int j = 0; j < i; j++) {
                    System.out.println("*");

                }
                // 별찍고 줄바구기
                System.out.println();

            }

        }

        // 매개변수로 받은 row만큼 오른쪽으로 별을 찍는 메서드
    public void printStar(int row) {
        for(int i = 1; i <= row ; i++){
            System.out.println("*");
        }
        // 별찍고 줄바꾸기
        System.out.println();
    }

    }


