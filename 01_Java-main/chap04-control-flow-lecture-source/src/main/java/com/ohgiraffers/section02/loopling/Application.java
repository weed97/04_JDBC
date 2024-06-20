package com.ohgiraffers.section02.loopling;

//실행용 클래스
public class Application {

    public static void main(String[] args) {

        A_for a_for = new A_for();

        //a_for.testSimpleForStatement();
        //a_For.testFOrExample1();
        //a_for.testExample2();
        //a_for.testExample3();
        //a_for.testExample4();
        //a_for.printSimpleGugudan();

//        A_nestedFor a_nestedFor = new A_nestedFor();
//        a_nestedFor.printGugudanFromTwoToNine();
//        a_nestedFor.printUpgradeGugudanFromTwoToNine();
//        a_nestedFor.printStarInpiutRowTimes();
//        a_nestedFor.printTriangleStars();


        B_while b_nestedwhile = new B_while();
//        b_nestedwhile.testSimpleWhilestatement();
//        b_nestedwhile.testWhileExample1();
//        b_nestedwhile.testWhileExample2();
//        b_nestedwhile.testWhileExample3();
        C_dowhile c_dowhile = new C_dowhile();
//        c_dowhile.testSimpleDoWileStatement();
//        c_dowhile.testDoWhileExample1();
        Ex_Star exStar = new Ex_Star();
        exStar.forStar1();
        exStar.forStar2();
        exStar.forStar3();
        exStar.forStar4();
    }
}
