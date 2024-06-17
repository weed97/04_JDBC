package com.ohgiraffers.model.dto;

public class Tbl_order {
    private int orderCode;
    private String orderDate;
    private String orderTime;
    private int TotalOrderPrice;

    public Tbl_order() {
    }

    @Override
    public String toString() {
        return "Tbl_order{" +
                "orderCode=" + orderCode +
                ", orderDate='" + orderDate + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", TotalOrderPrice=" + TotalOrderPrice +
                '}';
    }

    public Tbl_order(int orderCode, String orderDate, String orderTime, int totalOrderPrice) {
        this.orderCode = orderCode;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        TotalOrderPrice = totalOrderPrice;
    }
}
