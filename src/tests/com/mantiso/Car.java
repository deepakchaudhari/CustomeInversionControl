package com.mantiso;

/**
 * Created by deepakchaudhari.
 */
public class Car implements Drivable {

    private Logger logger;

    public Car(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void drive() {
        System.out.println("driving ");
    }
}
