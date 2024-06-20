package com.ohgiraffers.section04.comparison;

public class Application1 {
    public static void main(String[] args) {
        /*
         * 비교연산자
         *
         * 비교연산자는 피연산자 사이에 상대적인 크기를 판단해 참 혹은 거짓을 변환하는 연산자이다.
         * 연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건절에 많이 사용된다.
         * */

        /*
         * 비교연산자의 종류
         * '==' : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true 다르면 false를 반환
         * '!=' : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true 같으면 false를 반환
         * '>'  : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 true 아니면 false를 반환
         * '>=" : 왼쪽의 피연산자가 오른쪽의 피연산자보다 같거나 크면 true 아니면 false를 반환
         * '<'  : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 true 아니면 false를 반환
         * '<=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 같거나 작으면 true 아니면 false를 반환
         * */

        // 정수비교
        int inum1 = 10;
        int inum2 = 20;

        System.out.println("=========== 정수값 비교 ===========");
        System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2)); // false
        System.out.println("inum1과 inum2가 같은지 않은지 비교 : " + (inum1 != inum2)); // True
        System.out.println("inum이 inum2보다 큰지 비교: " + (inum1 > inum2)); //false
        System.out.println("inum이 inum2보다 큰거나 같은지 비교: " + (inum1 >= inum2)); //false
        System.out.println("inum이 inum2보다 작은지 비교: " + (inum1 < inum2)); //True
        System.out.println("inum이 inum2보다 작은지 비교: " + (inum1 <= inum2)); //True

        // 실수
        double dnum1 = 10.0;
        double dnum2 = 20.0;

        System.out.println(); // 줄 띄우기
        System.out.println("=========== 실수값 비교 ===========");
        System.out.println("dnum1과 dnum2가 같은지 비교 : " + (dnum1 == dnum2)); // false
        System.out.println("dnum1과 dnum2가 같은지 않은지 비교 : " + (dnum1 != dnum2)); // True
        System.out.println("dnum1이 dnum2보다 큰지 비교: " + (dnum1 > dnum2)); //false
        System.out.println("dnum1이 dnum2보다 큰거나 같은지 비교: " + (dnum1 >= dnum2)); //false
        System.out.println("dnum1이 dnum2보다 작은지 비교: " + (dnum1 < dnum2)); //True
        System.out.println("dnum1이 dnum2보다 작은지 비교: " + (dnum1 <= dnum2)); //True


        //문자값 비교
        char ch1 = 'a'; // 97
        char ch2 = 'A'; // 65

        System.out.println();
        System.out.println("=========== 문자값 비교 ===========");
        System.out.println("ch1과 ch2가 같은지 비교 : " + (ch1 == ch2)); // false
        System.out.println("ch1과 ch2가 같은지 않은지 비교 : " + (ch1 != ch2)); // True
        System.out.println("ch1이 ch2보다 큰지 비교: " + (ch1 > ch2)); //true
        System.out.println("ch1이 ch2보다 큰거나 같은지 비교: " + (ch1 >= ch2)); //true
        System.out.println("ch1이 ch2보다 작은지 비교: " + (ch1 < ch2)); //false
        System.out.println("ch1이 ch2보다 작은지 비교: " + (ch1 <= ch2)); //false

        // 논리값 비교
        // == 와 !=는 비교가 가능하지만 대소 비교는 불가능하다.
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println();
        System.out.println("=========== 문자값 비교 ===========");
        System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2)); // false
        System.out.println("bool1과 bool2가 같은지 않은지 비교 : " + (bool1 != bool2)); // True

//        System.out.println("bool1이 bool2보다 큰지 비교: " + (bool1 > bool2)); //true
//        System.out.println("bool1이 bool2보다 큰거나 같은지 비교: " + (bool1 >= bool2)); //true
//        System.out.println("bool1이 bool2보다 작은지 비교: " + (bool1 < bool2)); //false
//        System.out.println("bool1이 bool2보다 작은지 비교: " + (bool1 <= bool2)); //false

        // 문자열 비교
        // == 와 !=는 비교가 가능하지만 대소 비교는 불가능하다.
        String str1 = "java"; // 메모리상 주소가 저장된다
        String str2 = "java";



        System.out.println(); // 줄 띄우기
        System.out.println("=========== 문자열값 비교 ===========");
        System.out.println("str1과 str2가 같은지 비교 : " + (str1 == str2)); // false
        System.out.println("str1과 str2가 같은지 않은지 비교 : " + (str1 != str2)); // true

//        System.out.println("str1이 str2보다 큰지 비교: " + (str1 > str2)); //true
//        System.out.println("str1이 str2보다 큰거나 같은지 비교: " + (str1 >= str2)); //true
//        System.out.println("str1이 str2보다 작은지 비교: " + (str1 < str2)); //false
//        System.out.println("str1이 str2보다 작은지 비교: " + (str1 <= str2)); //false
        
        
        int x = 10;
        int y = 11;
        
        boolean resalt = x <= y; // true
        System.out.println("resalt = " + resalt);



        
    }
}
