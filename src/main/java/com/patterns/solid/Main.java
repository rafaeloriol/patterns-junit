package com.patterns.solid;

public class Main {

    public static void main(String[] args) throws InvalidCarException {

        String carType = "electric";

        ICar car;
        if ("car" == carType) {
            car = new Car();
        } else if ("electric" == carType) {
            car = new ElectricCar();
        }else{
            throw new InvalidCarException("Invalid car");
        }
        car.accelerate();
    }
}
