package com.ohgiraffers.model.dto;

public class Favorite_subject {
    private int subjectNo;
    private String subjectName;

    public Favorite_subject() {
    }

    public Favorite_subject(int subjectNo, String subjectName) {
        this.subjectNo = subjectNo;
        this.subjectName = subjectName;
    }

    public int getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(int subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Favorite_subject{" +
                "subjectNo=" + subjectNo +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
