package com.ohgiraffers.section02.template;

import java.sql.Connection;

import static com.ohgiraffers.section02.template.JDBCTemplate.close;
import static com.ohgiraffers.section02.template.JDBCTemplate.getConnection;

public class Application {

    public static void main(String[] args) {

        Connection con = getConnection();


        // 연결 객체 생성되었는지 확인. (객체의 주소값이 반환되는것 확인)
        System.out.println("con = " + con);

//        try {
//            if(con !=null ) {
//                con.close();
//         catch(SQLException e){
//                    throw new RuntimeException(e);
//                }
                close(con);
    }
}
