package com.ohgiraffers.model.dto;

public class Tbl_Payment {
    private int paymentCode;
    private String paymentDate;
    private String paymentTime;
    private int paymentPrice;
    private String paymentType;

    public Tbl_Payment(int paymentCode, String paymentDate, String paymentTime, int paymentPrice, String paymentType) {
        this.paymentCode = paymentCode;
        this.paymentDate = paymentDate;
        this.paymentTime = paymentTime;
        this.paymentPrice = paymentPrice;
        this.paymentType = paymentType;
    }

    public Tbl_Payment() {
    }

    @Override
    public String toString() {
        return "Tbl_Payment{" +
                "paymentCode=" + paymentCode +
                ", paymentDate='" + paymentDate + '\'' +
                ", paymentTime='" + paymentTime + '\'' +
                ", paymentPrice=" + paymentPrice +
                ", paymentType='" + paymentType + '\'' +
                '}';
    }
}
