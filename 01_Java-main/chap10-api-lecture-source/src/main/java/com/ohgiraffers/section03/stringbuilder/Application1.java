package com.ohgiraffers.section03.stringbuilder;

public class Application1  {
    // String과 StringBuilder의 차이점
    public static void main(String[] args) {

        /*
        * String과 StringBuilder
        * String : 불변이라는 특성을 가지고 있다.
        *          문자열에 + 연산으로 합치기 하는 경우, 기존 인스턴스를수정하는 것이아닌.
        *          새로운 인스턴스를 반환한다.
        *          문자열 변경이 자주 일어나는 경우 성능 면에서 좋지 않다.
        *          하지만, 변하지 않는 문자열 자주 읽어 들이는경우 오히려 더 좋은 성능을 낸다.
        *
        * StringBuilder : 가변이라는 특징을 갖는다.
        *                 문자열에 append() 메소드를 이용해 합치는 경우
        *                 기존 인스턴스를 수정하기 때문에 새로운 인스턴스를 만들지 않는다.
        *                 따라서 잦은문자열 변경이 일어나는 경우 String보다 성능이 좋다.
        *
        * */

        /*
        * StringBuilder : 스레드 동기화 기능 제공되지 않음
        *                 스레드 동기화처리를 고려하지 않는상황에서 StringBuffer 보다 성능이 좋음
        *
        * StringBuffer : 스레드 동기화 기능 제공한다.
        *                성능 면에서 StringBuilder보다 느리다.
        * */

        // StringBuilder 인스턴스 생성
        StringBuilder sb = new StringBuilder("java");

        System.out.println("sb = " + sb);


        /*
        * hashCode는 오버라이딩이 안되어 있음.
        * => 동일한 값을 가지는 경우 같은 해쉬코드를 반환하는 것이 아니라.
        *    인스턴스가 동일해야 같은 해쉬코드를 반환한다.
        * */
        System.out.println("sb의 hashCode : " + sb.hashCode());
        sb.append("oracle");
        System.out.println("sb = " + sb);
        System.out.println("sb의 hashCode : " + sb.hashCode());

        // stringBuilder는 문자열 변경했따고 새로운인스턴스가 생성되지 않는다.

    }
}
