package com.patterns.solid;

public class Main {

    public static void main(String[] args) throws InvalidCarException {

        ICar car = new ElectricCar();
        if (car instanceof ElectricCar) {
            car.accelerate();
        } else {
            throw new InvalidCarException("Invalid car");
        }

    }
}
