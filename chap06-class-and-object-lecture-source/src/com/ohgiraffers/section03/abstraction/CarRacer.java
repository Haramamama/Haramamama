package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private Car car = new Car();

    public void startUp(){car.startUp();}; // 앞에 있는 스타트업의 의미와 뒤 스타트업 의미가 다르다

    public void stepAcclator(){car.go();}

    public void stepBreak(){car.stop();}

    public void turnOff(){car.turnOff();}
}

