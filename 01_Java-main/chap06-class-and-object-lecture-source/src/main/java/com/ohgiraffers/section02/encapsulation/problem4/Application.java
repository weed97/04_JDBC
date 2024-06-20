package com.ohgiraffers.section02.encapsulation.problem4;

public class Application {

    public static void main(String[] args) {
        Monster monster1 = new Monster();

        // kinds 필드는 private으로 제한이 되어있기 때문에
        // 필드로 직접 접근이 안된다.
//        monster1.kinds = "??";
//        monster1.hp = 10;

        /*
        * 선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고
        * public으로 접근을 허용한메소드만 이용할 수 있게 해놓은 것
        * => 캡슐화(encapsulation)
        * */

        monster1.setKinds("프랑켄슈타인");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());

        /*
        * 클래스 작성시, 득별한 목적이 아닌 이상 캡슐하가 기본 원칙으로 사용된다.
        *
        * */

    }
}
