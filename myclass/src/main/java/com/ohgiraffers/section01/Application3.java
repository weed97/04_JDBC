package com.ohgiraffers.section01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application3 {
    public static void main(String[] args) {
        // 1. Connection 객체 생성
        Connection con = getConnection();

        // 2. Statement 생성
        Statement stmt = null;

        // 3. ResultSet 생성 ->
        ResultSet rset = null;


            // 4. 연결객체의 createStatement()를 이용한 Statement 객체 생성
            try {
                stmt = con.createStatement();
                Scanner sc = new Scanner(System.in);
                System.out.println("조회하려는 사번을입력하세요 : ");
                String subjectNo = sc.nextLine();
                String query = "select subject_no,subject_name from favorite_subject where subjectNo = '" + subjectNo + "'";
                // 5. executeQuery()로 쿼리문을 실행하고 결과를 ResultSet 반환 받기
                rset = stmt.executeQuery(query);
                
                // 6. 쿼리문의 결과를 컬럼 이름을 이용해서 사용
                if (rset.next()) {
                    System.out.println(rset.getString("SUBJECT_ID") + ',' + rset.getString("SUBJECT_NAME"));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                // 7. 사용한 자원 반납
                close(rset);
                close(stmt);
                close(con);
            }


    }
}
