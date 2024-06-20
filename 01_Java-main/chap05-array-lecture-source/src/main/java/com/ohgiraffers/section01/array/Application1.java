package com.ohgiraffers.section01.array;

public class Application1 {

    public static void main(String[] args) {
        /*
         * 배열?
         *
         * 동일한자료형의묶음(연속된메모리 공간에값을저장하고 사용하기 위한용도)이다.
         * 배열은 heap영역에 new 연산자를 이용하여 할당한다.
         * */

        /*
         * 배열의 사용이유
         *
         * 배열을 사용하지 않으면 -> 변수를 여러개 사용해야한다.
         * -> 모든 변수의이름을사용자가 관리를 해야한다는단점
         * 1. 연속된 메모리 공간으로 관리할 수 있다.
         * 2. 반복문을 이용해 연속 처리가 가능하다.
         * */
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println("sum = " + sum);

        int[] arr = new int[5];

//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;

        for (int i = 0,value = 0; i < arr.length;  i++) {
            value += 10;
            arr[i] = value;

            System.out.println("arr[" + i + ") : " +arr[i] );


        }

        int sum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum2 = sum2 + arr[i];
        }

        System.out.println("sum : " + sum2);




    }



}
