package com.ohgiraffers.section02.stream;

import java.io.*;

public class Application2 {
    // FileReader
    public static void main(String[] args) {

//        /*
//         * FileReader
//         * FileInputStream 과 사용하는 방법이 거의 동일하다.
//         * 단, byte 단위가 아닌 character 단위로 읽어들이는 부분이 차이점.
//         * => 2바이트이던 3바이트이던 글자 단위로 읽어오기 떄문에 한글도 정상적으로 읽을 수 있다.
//         * */



FileReader fr = null;

        try {

            fr = new FileReader("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");
//            int value;
//            while ((value = fr.read()) != -1) {
//                System.out.println((char) value);
//            }

            int size = (int) new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length();

            System.out.println("size = " + size);

            char[] carr = new char[size];

            fr.read(carr);

            for (int i = 0; i < carr.length; i++) {

                System.out.println(carr[i]);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 자원반납
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
