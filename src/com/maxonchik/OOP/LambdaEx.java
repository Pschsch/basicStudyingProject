package com.maxonchik.OOP;


public class LambdaEx {
    public static void main (String args[]){
        FunctionalInterface example = (n)->45/n; //инициализация функционального интерфейса лямбда-выражением
        System.out.println(example.getInt(5)); //нужно вызвать метод из функционального интерфейса.
        FunctionalInterface ex2 = (n)->40/n; // монж реализовывать функциональный интерфейс несколькими лямбдами!)
        System.out.println(ex2.getInt(4));
        System.out.println(example.getInt(5));
        FunctionalInterface BlockLambda = (n) ->{ //Блочное лямбда-выражение
            int sum = 0;
            for (int i=0; i<10; i++){
                sum+=(n+i);
            }
            return sum;
        };
        System.out.println(BlockLambda.getInt(3));
    }
}

