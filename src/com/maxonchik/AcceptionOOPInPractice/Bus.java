package com.maxonchik.AcceptionOOPInPractice;

public class Bus extends Car {
    private int numOfSeats;
    //Дочерний конструктор для Bus
    Bus(int Year, int NumOfSeats){
        super(Year);
        numOfSeats = NumOfSeats;
    }
}
