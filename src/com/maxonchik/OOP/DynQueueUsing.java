package com.maxonchik.OOP;
import java.io.*;

public class DynQueueUsing {
    public char VVOD(String str) throws IOException{
        System.out.println(str+ ": ");
        return (char)System.in.read();
    }
    public static void main(String[] args) {
        Exception fs = new Exception(); //объект исключения созданный вручную
        DynQueueUsing iai = new DynQueueUsing(1);
        int delimoe[]={12,6,3,0,3,6,6};
        int delitel[]={12,6,0,6,12,0,2,};

        for (int i = 0; i <delimoe.length ; i++) {
            try {
                System.out.println(delimoe[i]/delitel[i]);


                try{
                    System.out.println(delimoe[i]/delitel[i]);
                    throw new ArrayIndexOutOfBoundsException(); //Бросили исключение, в результате строка выходит=)
                }
                catch(ArrayIndexOutOfBoundsException exc) {System.out.println("Эта строка не выйдет");}}


            catch(Throwable exc){ //если деление на нуль, обработается, если указать тип Throwable, обрабатываются все исключения
                System.out.println("ААААААААААААААААААААААААААААААААААААААААААААААААААААААА");
            }}

        // catch(ArrayIndexOutOfBoundsException exp){  // Если обращение за границу массива, обработается
        //           System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
        //         }

        char ch;
        DynQueueUsing obh = new DynQueueUsing(15);
        for (int i=0;i<16;i++){
            obh.put((char) ('A'+i));

        }
        System.out.print("Queue elements ");
        for (int i = 0; i < 16; i++) {
            ch=obh.get();
            System.out.print(ch);
        }
        System.out.println();

    }
    private char q[]; // массив символов для хранения элементов очереди
    private int putloc, getloc; // индексы вставки и извлечения соответсвенно
    DynQueueUsing( int size){
        q = new char[size + 1];  // выделить память для очереди
        putloc = getloc = 0;
    }// Размер массива, на основе которого создана очередь всегда больше на 1 элемент, поэтому size+1.
    /*Теперь нужен метод, помещающий элемент в очередь:*/
    public void put ( char ch) {  //Метод проверки индекса очереди на наличие элемента и добавления в него элемента в случае отсутсвия
        if (putloc == q.length - 1) {  // Если putloc равнять с длиной массива, то выйдет исключение выхода за рамки массива
            char t[] = new char[q.length * 2];
            for (int i = 0; i < q.length; i++) {  //рансформировали в динамическую очередь
                t[i] = q[i];
                q = t;
            }
        }


        putloc++;
        q[putloc] = ch;}

    public char get () {  // метод проверки и получения элемента очереди
        if (getloc == putloc) {
            System.out.println("Очередь переполнена, б****");
            return (char)0;
        }
        getloc++;
        return q[getloc];
    }
}


