package com.maxonchik.OOP;

public class FailSortArray {
    private int a[]; //приватная ссылка на массив
    private int errorvalue; //приватная переменная, дающя знать об ошибке в случае выполнения метода get
    public int length;
    public FailSortArray(int size,int errval){
        a=new int[size];
        errorvalue=errval;
        length=size;
    }
    public int get(int index){
        if(indexOK(index)) return a[index];
        return errorvalue;
    }
    public boolean put(int index, int val){
        if(indexOK(index)) {a[index]= val;
        return true;}
        return false;
    }
    private boolean indexOK(int index){
        if(index>=0&index<length) return true;
return false;
    }

}
