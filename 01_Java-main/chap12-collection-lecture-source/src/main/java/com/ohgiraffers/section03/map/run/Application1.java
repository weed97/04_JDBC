package com.ohgiraffers.section03.map.run;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Application1 {

    //Map
    public static void main(String[] args) {

        /*
         * Map 인터페이스의 특징
         * Collection 인터페이스와는 다른 저장 방식을 가진다.
         * 키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
         *
         * 키(key)
         * 값(value)를 찾기 위한 이름 역할을 하는 객체를 의미한다.
         * 1. 요소의 저장 순서를 유지하지 않는다.
         * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값은 저장 가능하다.
         *
         * HashMap, HashTable, TreeMap 등 대표적인 클래스가 존재한다.
         * HashMap이 가장 많이 사용되며 HashTable은 jdk 1.0부터 존재해,
         * HashMap과 동일하게 동작된다. -> 하위호환을 위해 남겨놓은 것
         * 따라서, 가급적이면 HashMap을 사용하는 것이 권장된다.
         * */

        HashMap hMap = new HashMap();
        //Map hmp2 = new HashMap();

        // put()
        // 키와 값 둘다 객체여야한다.
        // atuoBoxing처리 된다. 12 => new Integer(12)
        hMap.put("one", new Date());
        hMap.put(12, "red apple");
        hMap.put(33, 123);

        System.out.println("hMap : " + hMap);

        // 중복 확인
        hMap.put(12, "yellow banana");
        hMap.put(13, "yellow banana");
        hMap.put(14, "yellow banana");
        
        System.out.println("hMap : " + hMap);
        
        hMap.remove(13, "yellow banana");
        hMap.remove(14, "yellow banana");
        System.out.println("hMap = " + hMap);
        
        // 저장된 객체수 확인
        System.out.println("hMap에 저장된 객체 수 : " + hMap.size());

    }




}