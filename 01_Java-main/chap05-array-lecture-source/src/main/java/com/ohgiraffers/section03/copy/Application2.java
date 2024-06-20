package com.ohgiraffers.section03.copy;

import java.sql.SQLOutput;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 얕은 복사의 활용
        *
        * 얕은복사를 활용하는 것은 주로 메소드 호출시 인자로 사용하는 경우
        * 리턴값을 동일한 배열을 리턴해주고싶은 경우
        * */

        String[] names = {"홍길동", "유관순", "이순신"};

        // names배열 hashCode 출력
        System.out.println("names 배열의 hashCode = " + names.hashCode());

        print((names));

        String[] animals = getAnimals();

        System.out.println("리턴받은 animals의 hashCode : " +animals.hashCode());

        print((names));

    }

    public static String[] getAnimals() {
        String[] animals = new String[] {"Bear", "Koala", "Gorilla"};

        // 얕은복사 확인을 위해 hashCode 출력
        System.out.println("새로 만든 animals의 hashCode : " + animals.hashCode());

        return  animals;
    }
    public static void print(String[] sarr) {
        System.out.println("sarr의 hashCode : " + sarr.hashCode());

        for (int i = 0; i < sarr.length; i++) {
            System.out.print(sarr[i] + " ");

        }
        System.out.println();

    }
}
