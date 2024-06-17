package com.ohgiraffers.section01.statement;

import javax.management.Query;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application02 {
    public static void main(String[] args) {

        // 1. Connection 객체 생성
        Connection con = getConnection();

        // 2. Statement 생성
        Statement stmt = null;

        // 3. ResultSet 생성 ->
        ResultSet rset = null;

        try {

            // 4. 연결객체의 createStatement()를 이용한 Statement 객체 생성
            stmt = con.createStatement();

            String empID = "200";
            String query = "select emp_id,emp_name from employee where emp_id = '" + empID + "'";

            // 5. executeQuery()로 쿼리문을 실행하고 결과를 ResultSet 반환 받기
            rset = stmt.executeQuery(query);

// 6. 쿼리문의 결과를 컬럼 이름음ㄹ 이용해서 사용
            if (rset.next()) {
                System.out.println(rset.getString("EMP_ID") + ',' + rset.getString("EMP_NAME"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {


            close(rset);
            close(stmt);
            close(con);
        }
    }
}

