package com.ohgiraffers.section01.insert;

import com.ohgiraffers.model.EmployeeDTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application2 {
    public static void main(String[] args) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;

        int result = 0;

        Properties prop = new Properties();


        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu-query.xml"));


            String query = prop.getProperty("insertMenu");


            pstmt = con.prepareStatement(query);


            Scanner sc = new Scanner(System.in);


            System.out.print("사원 번호를 입력하세요 : ");
            String empId = sc.nextLine();
            System.out.print("직원명을 입력하세요 : ");
            String empName = sc.nextLine();
            System.out.print("주민등록번호를 입력하세요 :");
            String empNo = sc.nextLine();
            System.out.print("이메일을 입력하세요 : ");
            String email = sc.nextLine();
            System.out.print("전화번호를 입력하세요 :");
            String phone = sc.nextLine();
            System.out.print("부서코드를 입력하세요 :");
            String deptCode = sc.nextLine();
            System.out.print("직급코드를 입력하세요 :");
            String jobCode = sc.nextLine();
            System.out.print("급여등급을 입력하세요 :");
            String salLevel = sc.nextLine();
            System.out.print("급여를 입력하세요 :");
            double salary = sc.nextDouble();
            System.out.print("보너스율를 입력하세요 :");
            double bonus = sc.nextDouble();
            System.out.print("관리자사번을 입력하세요 : ");
            String managerId = sc.nextLine();
            System.out.print("퇴직여부를 입력하세요 : ");
            String entYn = sc.nextLine().toUpperCase();
            System.out.println();

            EmployeeDTO newEmployee = new EmployeeDTO();
            newEmployee.setEmpID(empId);
            newEmployee.setEmpName(empName);
            newEmployee.setEmpNo(empNo);
            newEmployee.setEmail(email);
            newEmployee.setPhone(phone);
            newEmployee.setDeptCode(deptCode);
            newEmployee.setJobCode(jobCode);
            newEmployee.setSalLevel(salLevel);
            newEmployee.setSalary(salary);
            newEmployee.setBonus(bonus);
            newEmployee.setManagerId(managerId);
            newEmployee.setEntYN(entYn);


            pstmt.setString(1, "200");
            pstmt.setString(2, "홍길동");
            pstmt.setString(3, "830807-1134567");
            pstmt.setString(4, "honh1234@gmail.com");
            pstmt.setString(5, "01012341234");
            pstmt.setString(6, "D9");
            pstmt.setString(7, "J1");
            pstmt.setString(8, "S1");
            pstmt.setString(9, "123432");
            pstmt.setDouble(10, 0.99);
            pstmt.setDouble(11, 214);
            pstmt.setString(12, "N");

            result = pstmt.executeUpdate();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(pstmt);
            close(con);
        }
            if (result > 0) {
                System.out.println("메뉴 저장 성공!!!");
            } else {
                System.out.println("메뉴 저장 실패!!!");
            }

        

    }
}
