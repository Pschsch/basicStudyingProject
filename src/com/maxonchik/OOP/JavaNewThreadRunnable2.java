package com.maxonchik.OOP;

public class JavaNewThreadRunnable2 implements Runnable {
    JavaNewThreadRunnable2(){}
    public void run(){ System.out.println("Запуск потока ");
        int count = 0;
        try {
            for (int i = 0; i < 6; i++) {
                Thread.sleep(1000, 1);
                count++;
                System.out.println("Выполнение потока "+count+" раз");
            }
            System.out.println("Завершение потока");
        } catch (InterruptedException intEx){
            System.out.println("Плоха блен, че та ни так((((");}

    }
}
