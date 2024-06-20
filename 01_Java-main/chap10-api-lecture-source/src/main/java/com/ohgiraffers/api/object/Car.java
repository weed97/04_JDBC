package com.ohgiraffers.api.object;

import java.util.Objects;

public class Car {
    private String carName;
    private String carColor;
    private int engiceCC;
    // ...


    public Car() {
    }

    public Car(String carName, String carColor, int engiceCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engiceCC = engiceCC;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getEngiceCC() {
        return engiceCC;
    }

    public void setEngiceCC(int engiceCC) {
        this.engiceCC = engiceCC;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carName, car.carName) && Objects.equals(carColor, car.carColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, carColor);
    }


}



