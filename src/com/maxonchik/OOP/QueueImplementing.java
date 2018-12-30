package com.maxonchik.OOP;
// еализация простой невосполняемой очереди
public class QueueImplementing implements QueueInterface {
    private char q[];
    private int putloc, getloc;

    public QueueImplementing(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }


    @Override
    public void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println("Queue is full");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println("Queue is null");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}


