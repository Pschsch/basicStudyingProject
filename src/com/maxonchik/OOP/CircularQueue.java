package com.maxonchik.OOP;

public class CircularQueue implements QueueInterface {
    private char q[];
    private int putloc,getloc;
    public CircularQueue(int size){
        q= new char[size+1]; //выделение памяти для очереди
        putloc=getloc=0;
    }

    @Override
    public void put(char ch) {
        /*Очередь считается полной, если putloc на единицу меньше getloc или если putloc казывает на конец массива, а getloc -
        * на начало*/
        if(getloc==putloc+1 | (putloc==q.length-1)&(getloc==0)){
            System.out.println("Queue is full");
            return;
        }
        putloc++;
        if(putloc==q.length){putloc =0;}
        q[putloc]=ch;

    }

    @Override
    public char get() {
        if(getloc==putloc){
            System.out.println("Queue is null");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
