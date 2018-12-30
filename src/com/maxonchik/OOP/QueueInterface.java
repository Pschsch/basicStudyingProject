package com.maxonchik.OOP;
//Интерфейс для очереди символов
public interface QueueInterface {
    void put(char ch);
    char get();
    default void f(){
        System.out.println();
    };
}
