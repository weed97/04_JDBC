package com.ohgiraffers.model.dto;

public class Tbl_category {
    private int categoryCode;
    private String catagoryName;
    private int refCategoryCode;

    public Tbl_category() {
    }

    public Tbl_category(int categoryCode, String catagoryName, int refCategoryCode) {
        this.categoryCode = categoryCode;
        this.catagoryName = catagoryName;
        this.refCategoryCode = refCategoryCode;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCatagoryName() {
        return catagoryName;
    }

    public void setCatagoryName(String catagoryName) {
        this.catagoryName = catagoryName;
    }

    public int getRefCategoryCode() {
        return refCategoryCode;
    }

    public void setRefCategoryCode(int refCategoryCode) {
        this.refCategoryCode = refCategoryCode;
    }

    @Override
    public String toString() {
        return "Tbl_category{" +
                "categoryCode=" + categoryCode +
                ", catagoryName='" + catagoryName + '\'' +
                ", refCategoryCode=" + refCategoryCode +
                '}';
    }
}
