package com.ohgiraffers.section02;
import java.util.function.*;

public class Application3 {
    public static void main(String[] args) {
        // Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다.

        /* Function<T, R>#apply(T t) : R : 객체 T를 R로 매핑한다*/
        Function<String, Integer> function = (str) -> Integer.parseInt(str);
        String strValue = "12345";

        // getClass() : 래퍼타입의 클래스를 가져옴
        System.out.println(function.apply(strValue) + ": "
        + function.apply(strValue).getClass().getName());

        /* BiFunction<T, U, R>#apply(T t U u) : R : 객체 T와 U를 R로 맵핑한다*/
        BiFunction<String, String, Integer> biFunction = (str1, str2)
            -> Integer.parseInt(str1) + Integer.parseInt(str2);

        String str1 = "12345";
        String str2 = "56789";
        System.out.println(biFunction.apply(str1,str2) + " : " + biFunction.apply(str1, str2).getClass().getName());

        /*IntFunction<R>#apply(int value) : R : int를 R로 맵핑한다.*/
        IntFunction<String> intFunction = intValue -> String.valueOf(intValue);

        int intValue = 123;
        System.out.println(intFunction.apply(intValue) + " : " + intFunction.apply(intValue).getClass().getName());

        /* 목차. 4. IntToDOubleFunction#applyAsDouble(int value) : double : int를 double로맵핑한다. */
        /* 목차. 5. IntToLongFunction#applyAsDouble(int value) : double : int를 long으로 맵핑한다. */
        /* 목차. 6. DoubleFunction#applyAsDouble(double value) : R : double을 R로 맵핑한다. */
        /* 목차. 7. LongToDOubleFunction#applyAsDouble(long value) : double : long을 double로 맵핑한다. */
        /* 목차. 8. LongTointFunction#applyAsDouble(long value) : int : long을 int로 맵핑한다. */
        /* 목차. 9. ToDOubleFunction#applyAsDouble(T t , U u) : double : double : 객체 T오 U를 double로  맵핑한다. */
        /* 목차. 10. ToDoubleFunction<T>#applyAsDouble(T t) : double : 객체T를 Double로 맵핑한다. */
        /* 목차. 11. IntToDOubleFunction#applyAsDouble(int value) : int : 객체 T와 U를 int로 맵핑한다. */
        /* 목차. 12. ToIntToFunction#applyAsDouble(int value) : int : 객체 T를 int로 맵핑한다. */








    }
}
