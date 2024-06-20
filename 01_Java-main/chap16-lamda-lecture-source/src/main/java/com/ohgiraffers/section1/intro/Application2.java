package com.ohgiraffers.section1.intro;

public class Application2 {
    public static void main(String[] args) {
        
        OuterCalculator.Sum sum = (x,y) -> x + y;
        OuterCalculator.Sum minus2 = (x,y) -> x -y;
        // minus
        OuterCalculator.Minus minus = (x,y) -> x - y;
        // multiple
        OuterCalculator.Multiple multiple = (x,y) -> x * y;
        // division
        OuterCalculator.Division division = (x, y) -> x / y;

        System.out.println("20과 10의 합 : " + sum.sumTwoNumber(20, 10));
        System.out.println("20과 10의 차 : " + minus.minusTwoNumber(20, 10));
        System.out.println("20과 10의 곱 : " + multiple.multipleTwoNumber(20, 10));
        System.out.println("20과 10의 나누기 : " + division.divisionTwoNumber(20, 10));
    }
}
