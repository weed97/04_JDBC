package com.ohgiraffers.section02;


import java.time.LocalTime;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.*;

public class Application1 {

    public static void main(String[] args) {


        /*
         * 표준 함수적 인터페이스
         * JDK 8 자주 사용되는 함수적 인터페이스를 표준 API로 제공하고 있다.
         * Consumer : 리턴값이 없는 accept() 메소드를 가지고 있다. (매개변수 소비자 역할)
         * Supplier : 매개변수가 없고, 리턴값이 있는 getXXX() 메소드를 가지고 있다.
         * Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있는데, 매개변수로 연산을한 후 통일된 타입으로 리턴
         * Operator : Function 과 똑같이 applyXXX() 메소드를 가지고 있는데, 매개변수로 연산을 한 후 통일된 타입으로 리턴
         * Predicate : 매개변수와 boolean 값을 반환하는 textXXX() 메소드를 가지고 있다. (매개변수를 활용해서 Bollean 값 리턴)
         * */

        Runnable runnable = () -> System.out.println("hello");

        runnable.run();


        /* Consumer<T>#accept(T t) : void : 객체 T를 받아 소비 */
        Consumer<String> consumer = (str) -> System.out.println(str + "이(가) 출력됨");
        consumer.accept("hello world");

        /* BiConsumer<T, U>#accept(T t, U u) : void 객체 T, U를 받아 소비*/
        BiConsumer<String, LocalTime> biConsumer = (str, time) -> System.out.println(str + "이(가) " + time + "에 출력됨");
        biConsumer.accept("hello world", LocalTime.now());

        /* IntConsumer#accept(T t, U u) : void : 객체 T, U를 받아 소비*/
        IntConsumer intConsumer = (num) -> System.out.println("입력하신 정수의 제곱은" + (num * num) + "입니다.");
        intConsumer.accept(15);

        /* LongConsumer#accept(long value) : void : long값을 받아서 소비한다.*/
        LongConsumer longConsumer = num -> System.out.println("입력하신 정수는 " + num + "입니다.");
        longConsumer.accept(12345);

        /* ObjIntConsumer<T>#accept(T t, int value) : void 객체 T와 int 값을 받아 소비한다. */
        ObjIntConsumer<java.util.Random> objIntConsumer =
                (random, value) ->
                        System.out.println("0 부터" + value + " 전 까지의 난수 발생" + random.nextInt(value));
        objIntConsumer.accept(new java.util.Random(), 10);

        /* ObjLongConsumer<T>#accept(T t, long value) : void 객체 T와 long값을 받아 소비한다. */
        ObjLongConsumer<LocalDate> objLongConsumer =
                (date, days) -> System.out.println(date + "의" + days + "일 후의 날짜는" + date.plusDays(days));
        objLongConsumer.accept(LocalDate.now(),10);

        /*ObjDoubleConsumer<T>#accept(T t) : void : 객체 T와 double값을 받아 소비한다.*/
        ObjDoubleConsumer<StringBuilder> objDoubleConsumer =
                (sb, doubleValue) -> System.out.println(sb.append(Math.abs(doubleValue)));
        objDoubleConsumer.accept(new StringBuilder("절대값 : "), -123.5);

    }

}
