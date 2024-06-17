package com.ohgiraffers.section01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application3 {
    public static void main(String[] args) {
        // 1. Connection 객체 생성
        Connection con = getConnection();

        // 2. Statement 생성
        Statement stmt = null;

        // 3. ResultSet 생성 ->
        ResultSet rest = null;

//        try {
//            // 4. 연결객체의 createStatement()를 이용한 Statement 객체 생성
//            try {
//                stmt = con.createStatement();
//                Scanner sc = new Scanner(System.in);
//                System.out.println("조회하려는 사번을입력하세요 : ");
//                String query = "select emp_id,emp_name from employee where subjectNo = '" + subjectNo + "'";
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//
//        }

    }
}
