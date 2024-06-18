package com.ohgiraffers.section02.preparedstatement;


import com.ohgiraffers.model.dto.DepartmentDTO;
import com.ohgiraffers.model.dto.EmployeeDTO;

import java.sql.*;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application4 {

    public static void main(String[] args) {

        /*
        * Department 테이블의 부서코드(아이디)를 입력받아서
        * 부서코드(아이디), 부서명, 지역코드를 출력하시오
        * */

        // 1. Connection 객체 생성
        Connection con = getConnection();

        // 2. PreparedStatement 객체 생성
        PreparedStatement pstmt = null;

        // 3. ResultSet 생성 ->
        ResultSet rset = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 부서코드를 입력 하세요 :");
        String deptId = sc.nextLine();

        String query = "select * from department where dept_id = ?";

        DepartmentDTO selectedDep = null;


            try {

                pstmt = con.prepareStatement(query);
                pstmt.setString(1,deptId);

                rset = pstmt.executeQuery();

                if (rset.next()) {
                    selectedDep = new DepartmentDTO();
                    selectedDep.setDpetId(rset.getString("DEPT_ID"));
                    selectedDep.setDeptTitle(rset.getString("DEPT_TITLE"));
                    selectedDep.setLocationId(rset.getString("LOCATION_ID"));

                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
                // 7. 사용할 자원 반납
            } finally {
                close(rset);
                close(pstmt);
                close(con);

            }
        System.out.println("selectDep = " + selectedDep);
        }


    }

