package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    private String s;


    public CharacterProcess() {

    }

    public CharacterProcess(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "입력한 값은 ='" + s + "입니다 ";
    }

    public int countAlpha(String s) {
        int count = 0;
        char charAt = 'a';
        String[] str = new String[10];
        for (int i = 0; i < s.length(); i++) {
            if (charAt >= 65 || charAt <= 122) {
                charAt = str[i].charAt(0);
                count = str.length;


            }

        }

        return count;
    }
}
