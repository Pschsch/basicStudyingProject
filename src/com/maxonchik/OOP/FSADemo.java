package com.maxonchik.OOP;
import java.io.*;
import com.maxonchik.OOP.DynQueueUsing;
/** sasa*/
public class FSADemo {


    wowIKnowWhaIsInterface is; // is - ссылка на интерфейс. Эта ссылка может использоваться для любого объекта, реализующего интерфейс
    // wowIKnowWhaIsInterface. Эта ссылка хранит в себе только сведения о методах, реализованых в интерфейсе, но не о других методах,
    //использующихся в объектах, которые не относятся к интерфейсу.
    public  static void main(String args[]) {
        System.out.println();
        FSADemo obl = new FSADemo();
        FSADemo obk = new FSADemo();
        FSADemo usy = new FSADemo();
        FailSortArray fs = new FailSortArray(5, -1);
        int x;
        System.out.println("Обработка ошибок без вывода отчета.");
        for(int i=0;i<(fs.length*2);i++) fs.put(i, i*10);
        for (int i=0;i<(fs.length*2);i++) {x=fs.get(i);
        if(x!=-1) System.out.print(x+ " ");}
        System.out.println();
        //Обработать ошибки
        System.out.println("\nОбработка ошибок с выводом отчета.");
        for(int i=0; i<(fs.length*2);i++){
            if(!fs.put(i,i*10)) System.out.println("Индекс "+ i+" вне допустимого диапазона");
        }
        for (int i=0;i<(fs.length*2);i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
            else System.out.println("Индекс " + i + " вне допустимого диапазона");
            // @Override /Overload нету, да и не надо))/@
        }
        System.out.println(obl.factR(25));
        System.out.println(obl.toString());
        System.out.println(obk.toString());
   //     System.out.println(uk);
        try{
            System.out.println(uk/0);
        }
        catch(ArithmeticException arth){
            System.out.println("DON'T DIV ON ZERO TVOYU MAT\'!!!!!!! "); //Работает))))))) Не вылазит Exception)))
        }
        finally {
            //usy.
        }
    }
    public int factR(int n){  // Рекурсивный метод, поддерживает рекурсию, метод вызвает сам себя
        int result;
        if(n==1) return 1;  // Метод при значении n==1 вернет 1, тут все понятно
        result = factR(n-1)*n; // Но если n!=1, то метод хз, что ему возвращать, так как при возврате result, метод должен вызвать сам
        // себя. Будет вызывать сам себя до тех пор, пока n не станет равно 1.
        return result; }//
    int ui;
    int uj;
    static int uk=3;











}
