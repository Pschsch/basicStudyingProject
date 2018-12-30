package com.maxonchik.OOP;

public class PriorityThread implements Runnable{
    int count;
    Thread thrd;
    static boolean stop;
    static String currentName;
    PriorityThread(String name){  //конструктор PriorityThread, создающий объект потока через ссылку thrd и имя PriorityThread.
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }
    public void run() {
        System.out.println(thrd.getName()+ " - Запуск");
        do{
            count++;
            if(currentName.compareTo(thrd.getName())!=0){
                currentName = thrd.getName();
                System.out.println("B " + currentName);
            }
        } while (stop == false && count < 10000000);
        stop=true;
        System.out.println("\n"+thrd.getName()+" - Завершение");
    }
}
