package com.ohgiraffers.section01.array;

import java.util.Arrays;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        /*
        * 5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램
        * */

        int[] scores = new int[5];

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg = 0;

        // 점수를 입력 받는다.
        // 입력받은 점수를 scores 배열에 저장
        for(int i = 0; i < scores.length; i++) {

            System.out.print((i + 1) + "번째 학생의 점수를 입력해주세요 :");
            scores[i] = sc.nextInt();

        }

        //배열에 값들을 합계 -> int
        // sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4]

        for (int i = 0; i < scores.length; i++) {
            sum = sum +scores[i];

        }

        // 배열에 값들을 평균 -> 실수
        avg = (double)sum/scores.length;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }

}
