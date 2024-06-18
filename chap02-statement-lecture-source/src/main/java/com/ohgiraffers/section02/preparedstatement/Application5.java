package com.ohgiraffers.section02.preparedstatement;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application5 {
    public static void main(String[] args) {

    // 연결 객체 만들기
    Connection con = getConnection();

    PreparedStatement pstmt = null;

    ResultSet rset = null;

    // 조회할 employee의 이름의 성을 받아서 찾기
    Scanner sc = new Scanner(System.in);

        System.out.println("조회할 이름의 성을 입력하세요 :");

        String empName = sc.nextLine();

        // concat(?, '%') => ? 로 시작하는 무엇
//        String query = "select * from employee where emp_name like concat(?, '%')";

        EmployeeDTO row = null;
        List<EmployeeDTO> empList = null;

        Properties prop = new Properties();
        try {

            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/section02/preparedstatement/employee-query.xml"));
            // 파일인풋스트림 파일을 블러온다


            String query = prop.getProperty("selectEmpByFamilyName");
            // 쿼리에 selectEmpBYFamilyName의 키값을 넣는다.
            pstmt = con.prepareStatement(query);
            // con에 연결할 preparestatement의 쿼리 값을 pstmt 값에 저장 한다.
            pstmt.setString(1, empName);
            // pstmt에 setString에 들어갈 파라미터 첫번쨰 값에 empName의 값을 받게한다.
            rset = pstmt.executeQuery();
            // rset 에 pstmt에 있는 executeQuery() 실행할 쿼리에 있는 값들을 설정해 입력받는다.
            empList = new ArrayList<>(); //EmployeeDTO의 객체 배열 empList에 새로운 객체 배열 ArrayList<>()값을 생성한다.
            // empList에 ArrayList로
            while (rset.next())  { // rest의 String 값을 읽고 불린형태로 받아들인다

                row = new EmployeeDTO(); // EmployeeDTO의 클래스를 row 에 생성한다

                row.setEmpID(rset.getString("EMP_ID")); // DB "EMP_ID" 컬럼을 DTO예 있는 값을 row에 저장된 값을 불러온다
                row.setEmpName(rset.getString("EMP_NAME")); // DB "EMP_NAME" 컬럼을 입력받아 DTO 에 있는 값들을 새로운 값을 row에 불러온다.
                row.setEmpNo(rset.getString("EMP_NO")); // DB "EMP_NO" 컬럼을 입력받아 DTO에 들어온 뒤에 row값에 들어온다.
                row.setEmail(rset.getString("EMAIL")); // DB "EMAIL" 컬럼을 입력받아 DTO에 들어와 설정한뒤 row에 값이 들어온다.
                row.setPhone(rset.getString("PHONE")); // DB "PHONE" 컬럼에 들어와서 getString으로 들어온 값을 매개로 받아 DTO에 불러와 설정된 값이 row에 입력된다.
                row.setDeptCode(rset.getString("DEPT_CODE"));
                row.setJobCode(rset.getString("JOB_CODE"));
                row.setSalLevel(rset.getString("SAL_LEVEL"));
                row.setSalary(rset.getDouble("SALARY"));
                row.setBonus(rset.getDouble("BONUS"));
                row.setManagerId(rset.getString("MANAGER_ID"));
                row.setHireDate(rset.getDate("HIRE_DATE"));
                row.setEntDATE(rset.getDate("ENT_DATE"));
                row.setEntYN(rset.getString("ENT_YN"));

                empList.add(row); // row에 있는값을 추가해서 empList 배열에 저장된 컬럼에 있는 값들이 들어온다.
            }
        } catch (SQLException e) { // catch 에 SQL문으로 저장된 파일을 익셉션하기 위해 e로 선언한다.
            throw new RuntimeException(e); // RuntimeException에 e에 SQLException에 e값에 들어가서 익셉션이 새롭게 생성된다.
        } catch (InvalidPropertiesFormatException e) { // InvailPropertiesFromatException e
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }

        for (EmployeeDTO emp : empList) {
            System.out.println(emp);
        }
    }



}
