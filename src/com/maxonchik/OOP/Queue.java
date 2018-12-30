package com.maxonchik.OOP;

public class Queue {
    int q[]; // массив символов для хранения элементов очереди
    public int putloc, getloc; // индексы вставки и извлечения соответсвенно
    Queue(int size) {
        q = new int[size + 1];  // выделить память для очереди
        putloc = getloc = 0;
    }// Размер массива, на основе которого создана очередь всегда больше на 1 элемент, поэтому size+1.
    /*Теперь нужен метод, помещающий элемент в очередь:*/
    public void put(int ch){  //Метод проверки индекса очереди на наличие элемента и добавления в него элемента в случае отсутсвия
        if(putloc==q.length-1){  // Если putloc равнять с длиной массива, то выйдет исключение выхода за рамки массива
            System.out.println(" - Очередь заполнена, не вар че то добавить(((");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }
    public int get(){  // метод проверки и получения элемента очереди
        if(getloc==putloc){
            System.out.println("Очередь переполнена, б****");
            return 0;
        }
        getloc++;
        return q[getloc];
    }


}


