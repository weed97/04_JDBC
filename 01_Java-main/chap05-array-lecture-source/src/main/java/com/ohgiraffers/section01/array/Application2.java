package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /*
         * 배열의 사용 방법
         *
         * 1. 배열의 선언
         * 2. 배열의 할당
         * 3. 배열의 인덱스 공간에 값 대입
         * */

        /*
         * 배열의 선언
         *
         * 자요형[] 변수명;
         * 자료형 변수명[]'
         * */

        // stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것
        int[] iarr;
        char carr[];

        /*
         * 선언한 레퍼런스 변수에 배열을 할당하여 대입할 수 있다.
         * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
         * 발생한 주소를 레퍼런스 변수(참조형 변수)에 저장하고 이것을 참조하여 사용하기 때문에
         * 참조 자료형 이라고 한다.
         * */

        // 배열의 할당을 할시에는 반드시 배열의 크기를 지정해 줘야한다.
        // iarr = new int[]; // 크기를 지정해주지 않아서 에러가 발생

        iarr = new int[5];
        carr = new char[5]; // 타입도 맞춰 줘야한다.

        // 선언과 할당을 동시에 할 수 있다.
        int[] iarr2 = new int[5];
        char carr2[] = new char[10];
        long[] larr = new long[5];

        System.out.println("iarr2 : " + iarr2);
        System.out.println("carr2 : " + carr2);
        System.out.println("larr = " + larr);

        /*
         * hashcode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환
         * -> 동일객체인지 비교할 때 사용할 목적으로 많이 쓰이며, 동등객체를 동일객체 취급하기 위한 용도로 ovvering
         * */

        System.out.println("iarr2의 hashcode : " + iarr2.length);
        System.out.println("carr2의 hashcode : " + carr2.length);

        Scanner sc = new Scanner(System.in);

        System.out.println("새로 할당할 배열의 길이를 입력하세요 :");
        int size = sc.nextInt();

        double[] darr = new double[size];

        System.out.println("darrd의 hashcode : " + darr.length);
        System.out.println("darr의 길이 = " + darr.length);

        // 한번 지정한 배열의 크기는 변경하지 못한다.

        darr = null;

        System.out.println("삭제 후 darr의 길이 : " + darr.length);

    }
}
