package com.ohgiraffers.api.string;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringProcess {

    public String preChar(String s) {


        // 1. 문자열 분리
        Pattern pattern = Pattern.compile("");
        String[] list = pattern.split(s);

        // 2. 첫글자를 대문자로 변경
        for (int i = 0; i < list.length; i++) {
//            System.out.println(list[i]);

        }
        list[0] = list[0].toUpperCase();

        System.out.println(list[0]);

        // 3. 문자열 합치기


        s = String.join("", list);


        return s;


    }


    public static int charSu(String s, char ch) {
//        int num = 0;
//        Pattern pattern = Pattern.compile("");
//        String[] list = pattern.split(s);
//        s = Arrays.toString(list);
//        for (int i = 0; i < s.length(); i++) {
//
//            if(list[i].charAt(i) == ch ){
//                num ++;
//
//            }
//        }
        System.out.println(s.replace(String.valueOf(ch),"").length());
        return s.length() - s.replace(String.valueOf(ch), "").length();


    }
    }

