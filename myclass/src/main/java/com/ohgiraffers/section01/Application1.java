package com.ohgiraffers.section01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {

    public static void main(String[] args) {

        // 연결 객체
        Connection con = getConnection();

        // 쿼터문을 저장하고, 실행하는 기능을 하는 용도의 인터페이스
        Statement stmt = null;

        // *select* 결과집합을 받아올 용도의 인터페이스
        ResultSet rset = null;

        try {
            // connection을 이용해 statement 객체생성
            stmt = con.createStatement();

            rset = stmt.executeQuery("select * from class,favorite_subject,tbl_category,tbl_menu,tbl_order_menu,tbl_payment_order");
            while (rset.next()) {
                // . next() : ResultSet의 위치를 하나 내리면서 행이 존재하면 true, 아니면 false
                System.out.println(rset.getString("rset "));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            // 오버로딩으로 통일시킴.

            close(rset);
            close(stmt);
            close(con);




        }
    }
}
