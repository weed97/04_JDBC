package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {
    public static void main(String[] args) {
        /*
        * java.util.Random
        *
        * java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
        * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위 까지의 난수를 발생시켜서 정수 형태로 반환
        *
        * 원하는 범위의 난수를 구하는 공식
        * random.nextInt([구하려는 난수의 갯수]) + [구하려는 난수의 최소값]
        *
        * */

        Random random = new Random(); // 객체를 생성한다.

        // 0 ~ 9까지의 난수 발생
        int randomNumber1 = random.nextInt(10);
        System.out.println("0 부터  9까지의 난수 :" + randomNumber1);


        // 1 ~ 10까지의 난수 발생
        int randomNumber2 = random.nextInt(10) + 1;
        System.out.println("1~ 10 까지의 난수 : " + randomNumber2);
        // 20 ~ 45까지의 난수 발생
        int randomNumber3 = random.nextInt(26) + 20;
        System.out.println("20 ~ 45까지의 난수 : " + randomNumber3);
        // -128 ~ 127까지의 난수 발생
        // int radomNumber = random.nextInt(256)-128;
        int randomNumber4 = new Random().nextInt(256) -128; // 객체를 생성하자마자 바로 메소드 호출 가능
        System.out.println("-128 ~ 127까지의 난수 :" + randomNumber4);

    }
}
