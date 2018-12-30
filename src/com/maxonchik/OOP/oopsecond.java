package com.maxonchik.OOP;

public class oopsecond extends oop implements wowIKnowWhaIsInterface{

    public int saturn;
    public double GlobalVal=10; //переменная подкласса

    public oopsecond(int Uran, int Neptun, int Saturn) {
        super(Uran, Neptun);
        saturn = Saturn;
    }
    public void AYE(){
        double h;
        h=super.GlobalVal*35;  // в данном случае используется переменная суперкласса, если убрать супер, будет исп переменная
        System.out.println(h); // дочернего класса
    }


    // Переопределить (override) метод родительского класса (oop)
    @Override
    public void getUran() {
        System.out.println("Is overridden method ");
    }


    @Override
    public void printVal() {
        System.out.println();
    }

    @Override
    public int setVal(int i) {
        return i;
    }
}

