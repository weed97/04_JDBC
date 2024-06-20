package com.ohgiraffers.section02.String;

public class Application4 {
    // 이스케이프(escape)문자
    public static void main(String[] args) {
    /*
     * 이스케이프(escape) 문자
     * 문자열 내에서 사용하는문자 중 특수문자를 표현하거나 특수기능을사용할 때사용 됨.
     * 이스케이프 문자         의
     *  \n              개행(줄바꿈)
     *  \t              텝
     *  \'              작은따움표
     *  \"              큰따움표
     *  \\              역슬래쉬 표시
     * */

        System.out.println("안녕하세요.  \t저는\'홍길동\'\\입니다.");

        System.out.println("안녕하세요 \t저는 홍길동 입니다.");
        System.out.println("안녕하세요. 저는 홍길동 입니다.");

        System.out.println("안녕하세요. 저는 '홍길동' 입니다.");
        // System.out.println('');
        System.out.println('\'');

        // System.out.println("안녕하세요 저는 "홍길동" 입니다.");
        System.out.println();

        System.out.println("안녕하세요. 저는 \"홍길동\" 입니다.");
        System.out.println("안녕하세요. 저는 \\홍길동\\ 입니다.");

        /*
        * split 할 때 이스케이프 문자를 사용해야하는 특수문자도 존재한다.
        * 이스케이프 문자 사용안하는 특수문자
        * ~ ` ! @ # - _ ; : ' \ " , < > /
        *
        * 이스케이프 문자를 사용하는 특수문자 (\\)
        * $ ^ * ( ) + | { } [ ] . ?
        * \\
        * */

        String str = "java^oracle^jdbc";
        String str1 = "java$oracle$jdbc";

        String[] sarr = str.split("\\^");
        String[] sarr1 = str1.split("\\$");



        for (String s : sarr) {
            System.out.println(s);
        }

        for (String s1 : sarr1) {
            System.out.println(s1);
        }

    }
}
