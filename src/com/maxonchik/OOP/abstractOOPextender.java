package com.maxonchik.OOP;

public class abstractOOPextender extends abstractOOP{
private int h;
private int u;
private int i;
abstractOOPextender(int first,int second,int third){
    h=first;
    u=second;
    i=third;
}

 @Override
 void abstractMethod() {
    double y;
        y=h*u/i;
        System.out.println(y);
    }
}
