package com.maxonchik.AcceptionOOPInPractice;

public class Huyndai extends Car {
    private String typeOfCase;
    //Дочерний конструктор для Hyundai
    public Huyndai(int Year, String TypeOfCase){
        super(Year);
        typeOfCase = TypeOfCase;

    }
}
