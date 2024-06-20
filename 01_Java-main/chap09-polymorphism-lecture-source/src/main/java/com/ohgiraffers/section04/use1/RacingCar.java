package com.ohgiraffers.section04.use1;

public class RacingCar extends Car {
    // Car 상속받아서
    // go() "레이싱카가 달려갑니다"
    // stop() "레이싱카가 멈춥니다"


    @Override
    public void go() {
        System.out.println("레이싱카가 달려갑니다");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");
    }


}
