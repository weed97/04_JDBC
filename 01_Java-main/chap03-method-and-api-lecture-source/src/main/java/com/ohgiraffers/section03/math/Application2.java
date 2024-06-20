package com.ohgiraffers.section03.math;

public class Application2 {

    public static void main(String[] args) {

        /*
        * 난수의 활용
        *
        * Math.random()을 이용해 발생한 난수는 0부터 1전까지의 실수 범위의 난수값을 발생시킨다.
        * 필요에 따라 정수 형태의 값을 원하는 범위 만큼 발생시켜야하는 경우들이 존재한다.
        *
        * 원하는 범위의 난수를 구하는 공식
        * (int) (Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
        * */

        // 난수의 범위 0 ~ 9
        int random1 = (int) (Math.random()  * 10);
        System.out.println("0 ~ 9까지의 난수 생성" + random1);
        System.out.println(random1);

        int random2 = (int) (Math.random() * 10 ) + 1;
        System.out.println("1 ~ 10까지의 난수 생성 : " + random2);

        // 10 ~ 15 사이의 난수 발생

        int random3 = (int) (Math.random() * 6) + 10;
        System.out.println("10 ~ 15까지의 난수 생성" + random3);


        // -128 ~ 127 까지의 난수 발생

        int random4 = (int) (Math.random() * 256) - 128;
        System.out.println("-128 ~ 127 까지의 난수 생성" + random4);
    }

}
