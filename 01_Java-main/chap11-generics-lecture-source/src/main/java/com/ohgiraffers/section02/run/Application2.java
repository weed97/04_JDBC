package com.ohgiraffers.section02.run;

import com.ohgiraffers.section02.*;

public class Application2 {
    // 와일드카드(wildCard)
    public static void main(String[] args) {

        /*
         * 와일드카드
         * 제네릭 클래스 타입의 객체를 메소드의매개변수로 받을 때,
         * 그 객체의 타입 변수를 제한 할 수 있다.
         *
         * <?> : 제한 없음
         * <? extends [type]> : 와일드카드의 상한 제한
         *                      Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용가능
         * <? super [type]>   : 와일드카드의 하한 제한
         *                      Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용가능
         * */

        WildCardFarm wildCardFarm = new WildCardFarm();

        // 매개변수의 타입 제한이 없는경우
        // 토끼농장 생성자체가 불가능하면매개변수로 사용 불가능.
        // wildCardFarm.anyType(new RabbitFarm<>(new Mammal()));
        // wildCardFarm.anyType(new RabbitFarm<>(new Readable()));

        System.out.println("=================== <?> ======================");
        // RabbitFarm을 생성만 가능하면 <?>에서는 모두 매개변수로 사용 가능하다.
        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        //  extends Bunny이기 때문에 Bunny이거나 Bunny의 후손 토끼농장만 매개변수로 사용가능
        // 상위타입으로 만든 토끼농장은 매개변수로사용 불가능
        // wildCardFarm.extendsType(new RabbitFarm<>(new Rabbit()));

        System.out.println("=================== <? extends Bunny> ======================");
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        System.out.println("=================== <? super Bunny> ======================");
        // extends Bunny의 <? super> 이기 때문에 Bunny이거나 Bunny 상위 토끼농장만 매개면수로 사용가능
        // 후손타입으로 만든 토끼농장은매개변수로 사용 불가능
        wildCardFarm.superType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<>(new Bunny()));
         // wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny());





    }
}
