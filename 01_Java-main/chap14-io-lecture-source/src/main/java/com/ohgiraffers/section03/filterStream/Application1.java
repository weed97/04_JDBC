package com.ohgiraffers.section03.filterStream;

import java.io.*;

public class Application1 {

    // BufferedWriter & BufferedReader
    public static void main(String[] args) {

        /*
        * java.io 패키지의 입출력 스트림은 기본스트림과 빌더(보조) 스트림으로 분류 할 수 있다.
        * 기본 스트림은외부 데이터에 직접 연결되는 스트림이고
        * 필터 스트림은 외부 데이터에 직접 연결하는 것이 아니라 기본 스트림에 추가로 사용 가능한 스트림이다.
        * 주로 성능을 향상시키는 목적으로 사용된다.
        * 생성자 쪽에 매개변수로 다른 스트림을 이용하는클래스 필터 스트림이라고 할 수 있다.
        * */

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/section03/filterStream/testBuffered.txt"));

            bw.write("안녕하세요");
            bw.write(10);
            bw.write("반갑습니다");

            // 버퍼를 이용하는 경우 버퍼가 가득 차지 않는 상태에서 내보낼땐
            // flush로 강제로 내보내기를할 수 있다.
             bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally // 자원 반납
        {
            if (bw != null) {
                try {

                    // close를 호출하면 내부적으로 flush()를 하고서 자원을 반납한다.
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        // BufferedReader
        // 버퍼에 미리 읽어온 후, 한 줄 단위로 읽어들이는 기능을 제공해준다.
        // => 기존 스트립보다 성능이 개선됨.
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/section03/filterStream/testBuffered.txt"));

            String temp;

            /*
            * readLine() 기능을 추가로 제공한다.
            * 버퍼의 한 줄을 읽어와서 문자열로 반환해준다.
            * */
            while ((temp = br.readLine()) !=null) {
                System.out.println(temp);

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
