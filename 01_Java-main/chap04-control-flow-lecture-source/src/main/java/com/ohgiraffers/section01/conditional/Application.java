package com.ohgiraffers.section01.conditional;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {

        A_If aIF = new A_If();

        //aIF.testSimpleIfStatement(); // 단일 if 문
//        aIF.testNestedIfStatement(); // 중첩 if 문

        B_ifElse bIfElse = new B_ifElse();

//        bIfElse.testSimpleIfElseStatement(); // 단일 if-else 문
//        bIfElse.testNestedIfElseStatement(); // 중첩 if-else 문


        C_ifElseif cIfElseif = new C_ifElseif(); // 단일 If-else 문
//        cIfElseif.testSimpleleftElseIfStatement();
//        cIfElseif.testNestedIFElseIFStatement();

        D_switch dSwitch = new D_switch();
//        dSwitch.testSimpleSwitchStatement();
        dSwitch.testSwitchVendingMachine();






    }
}
