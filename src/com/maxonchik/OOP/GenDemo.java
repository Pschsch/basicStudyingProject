package com.maxonchik.OOP;

public class GenDemo {
    public static void main(String args[]){
        Generics<Integer, String> intObj = new Generics<>(100, "string"); //Одна ссылка на 2 объекта..... мда...
        intObj.showType();

        //Все правильно)))
    }
}
