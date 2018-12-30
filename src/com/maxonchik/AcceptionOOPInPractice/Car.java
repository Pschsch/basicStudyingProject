package com.maxonchik.AcceptionOOPInPractice;

public class Car {
        private int year;
        private double baseSpeed, multiplier; //можно объявлять несколько переменных одного типа в одной строке)
        //Родительский конструктор для Car
    public Car( int Year){
            year = Year;
        }
        public double drive () {
            return baseSpeed * multiplier;

        }
        public void repairCar (Car TypeCar){
            TypeCar.year++;
        }

        public void setBaseSpeed ( double baseSpeed){
            this.baseSpeed = baseSpeed;
        }

        public void setMultiplier ( double multiplier){
            this.multiplier = multiplier;
        }
    }

