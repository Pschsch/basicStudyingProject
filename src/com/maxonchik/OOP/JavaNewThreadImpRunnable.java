package com.maxonchik.OOP;

public class JavaNewThreadImpRunnable implements Runnable {
    JavaNewThreadImpRunnable(){

    }
    public void run(){ System.out.println("Запуск потока ");
        int count = 0;
        try {
            System.out.println(Thread.currentThread());
            for (int i = 0; i < 10; i++) {
                Thread.sleep(700, 1);
                count++;
                System.out.println("Выполнение потока "+count+" раз");
            }
            System.out.println("Завершение потока");
        } catch (InterruptedException intEx){
            System.out.println("Плоха блен, че та ни так((((");}

    }
}

