package com.ohgiraffers.model.dto;

public class Tbl_Order_Menu {
    private int orderCode;
    private int menuCode;
    private int orderAmount;

    public Tbl_Order_Menu(int orderCode, int menuCode, int orderAmount) {
        this.orderCode = orderCode;
        this.menuCode = menuCode;
        this.orderAmount = orderAmount;
    }

    public Tbl_Order_Menu() {
    }

    @Override
    public String toString() {
        return "Tbl_Order_Menu{" +
                "orderCode=" + orderCode +
                ", menuCode=" + menuCode +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
