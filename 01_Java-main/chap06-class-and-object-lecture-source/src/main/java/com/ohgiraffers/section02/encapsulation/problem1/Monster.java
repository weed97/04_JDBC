package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
//    //몬스터 이름
//    String name;
//
//    // 몬스터 체력
//    int hp;

    // hp에 음수가 저장되는것을 막고자 hp가 양수인 경우에만 입력하는 hp로 변경하고
    // 0보다 작은경우 0으로 변경할 수 있도록 기능

    String name;
    int hp;

    public void setHp(int hp) {
        /*
        * this 인스턴스가 생성되었을 떄 자신의 주소를 저장하는 레퍼런스 변수이다.
        * 지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선적으로 접근하기 떄문에
        * 전역변수에 접근하기 위해서 this.를 명시해야한다.
        * */
        if (hp > 0) {
            System.out.println("양수값이 입력되어 몬스터의 체력을 입력한 값으로 변경합니다.");
            this.hp = hp;
        } else {
            System.out.println("0보다 작거나 같은 값이 입력되어몬스터의 체력을0으로 변경합니다.");
            this.hp = 0;
        }
    }

}
