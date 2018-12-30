package com.maxonchik.AcceptionOOPInPractice;

public class Truck extends Car {
    private int maxWeight;
    //Дочерний конструктор для Truck
    Truck(int Year, int MaxWeight){
        super(Year);
        maxWeight = MaxWeight;
    }
}
