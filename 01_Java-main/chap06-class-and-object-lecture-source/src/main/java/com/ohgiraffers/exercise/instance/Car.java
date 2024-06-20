package com.ohgiraffers.exercise.instance;

public class Car {
//    Tesla Model S를 만들고 2022년식이며 전기차인 자동차 객체를 생성하여 값을 출력하세요.

    private String modelName;
    private int modelYear;
    private  String engine;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getInfo() {
        return "모델명은 " + this.modelName + " 입니다." + " 모델 연식은 " + this.modelYear + "년" + " 입니다." + " 엔진은 " + this.engine + " 입니다";

    }
}
