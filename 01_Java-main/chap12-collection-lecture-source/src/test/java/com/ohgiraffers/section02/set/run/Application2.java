package com.ohgiraffers.section02.set.run;

import java.io.*;
//import java.io.FileOutputStream;
//import java.io.IOException;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {

        /*
        * Properties
        * HashMap을 구현하여사용 용법이 거의 유사하다.
        * key-value 모두 문자열만 사용 할 수 있는 자료구조이다.
        * 설정 파일의 값을 읽어서 어플리케이션에 적용할 떄 사용한다.
        * */
        Properties prop = new Properties();

        // 값을 추가할떄
        prop.setProperty("driver", "oracle.jdbc.driver.OracleOriver");
        prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");

        System.out.println("prop : " + prop);

        try {

            prop.store(new FileOutputStream("drive.dat"),"jdbc drive");
            prop.store(new FileWriter("drive.txt"),"jdbc drive");
            prop.storeToXML(new FileOutputStream("drive.xml"),"jdbc.drive");

        } catch (IOException e) {
            throw new RuntimeException(e);

        }

        Properties prop2 = new Properties();
        try {
            // drive.txt 파일에서 문자열을 읽어옴
            BufferedReader reader = new BufferedReader(new FileReader("drive.txt"));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while((line = reader.readLine()) != null) {

                stringBuilder.append(line);
                stringBuilder.append("\n");

            }

            reader.close();
            String content = stringBuilder.toString();

            prop2.load(new StringReader(content));

            for (String key : prop2.stringPropertyNames()) {
                String value = prop2.getProperty(key);
                System.out.println("key = " + key + "value = " + value );;
            }


            prop2.load(new FileInputStream("drive.txt"));
            prop2.load(new FileReader("drive.xml"));
            prop2.load(new FileInputStream("drive.dat"));
            prop2.load(new StringReader("drive.txt"));


            System.out.println("prop2 : " + prop2);
        } catch (IOException e) {

            throw new RuntimeException(e);
        }



    }
}
