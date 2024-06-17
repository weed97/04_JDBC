package com.ohgiraffers.model.dto;

/*
* DTO 클래스의 조건
* 1. 모든 필드는 private
* 2. 기본생성자와 모든 필드를 초기화하는 생성자
* 3. 모든 필드에 대한 setter/getter
* 4. toString Overiding을 이용한 필드 값 반환용 메서드
* 5. 직렬화 처리
* */


import java.sql.Date;

public class EmployeeDTO {

    private String empID;
    private String empName;
    private String empNo;
    private String email;
    private String phone;
    private String deptCode;
    private String jobCode;
    private String salLevel;
    private double salary;
    private double bonus;
    private String managerId;
    private java.sql.Date hireDate;
    private java.sql.Date entDATE;
    private String entYN;

    public EmployeeDTO() {
    }



    public EmployeeDTO(String empID, String empName, String empNo, String email, String phone, String deptCode, String salLevel, double salary, double bonus, String managerId, Date hireDate, Date entDATE, String entYN) {
        this.empID = empID;
        this.empName = empName;
        this.empNo = empNo;
        this.email = email;
        this.phone = phone;
        this.deptCode = deptCode;
        this.salLevel = salLevel;
        this.salary = salary;
        this.bonus = bonus;
        this.managerId = managerId;
        this.hireDate = hireDate;
        this.entDATE = entDATE;
        this.entYN = entYN;
    }
    public EmployeeDTO(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getSalLevel() {
        return salLevel;
    }

    public void setSalLevel(String salLevel) {
        this.salLevel = salLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getEntDATE() {
        return entDATE;
    }

    public void setEntDATE(Date entDATE) {
        this.entDATE = entDATE;
    }

    public String getEntYN() {
        return entYN;
    }

    public void setEntYN(String entYN) {
        this.entYN = entYN;
    }


    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empID='" + empID + '\'' +
                ", empName='" + empName + '\'' +
                ", empNo='" + empNo + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", salLevel='" + salLevel + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", managerId='" + managerId + '\'' +
                ", hireDate=" + hireDate +
                ", entDATE=" + entDATE +
                ", entYN='" + entYN + '\'' +
                '}';
    }
}
