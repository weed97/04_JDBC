package com.ohgiraffers.model.dto;

public class Class {

private int StudentNO;
private String studentName;
private String gender;
private String githubId;
private String email;
private String mbti;
private int subjectNo;

    public Class() {
    }

    public Class(int studentNO, String studentName, String gender, String githubId, String email, String mbti, int subjectNo) {
        StudentNO = studentNO;
        this.studentName = studentName;
        this.gender = gender;
        this.githubId = githubId;
        this.email = email;
        this.mbti = mbti;
        this.subjectNo = subjectNo;
    }

    public int getStudentNO() {
        return StudentNO;
    }

    public void setStudentNO(int studentNO) {
        StudentNO = studentNO;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGithubId() {
        return githubId;
    }

    public void setGithubId(String githubId) {
        this.githubId = githubId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMbti() {
        return mbti;
    }

    public void setMbti(String mbti) {
        this.mbti = mbti;
    }

    public int getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(int subjectNo) {
        this.subjectNo = subjectNo;
    }

    @Override
    public String toString() {
        return "Class{" +
                "StudentNO=" + StudentNO +
                ", studentName='" + studentName + '\'' +
                ", gender='" + gender + '\'' +
                ", githubId='" + githubId + '\'' +
                ", email='" + email + '\'' +
                ", mbti='" + mbti + '\'' +
                ", subjectNo=" + subjectNo +
                '}';
    }
}
