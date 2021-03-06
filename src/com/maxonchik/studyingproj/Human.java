package com.maxonchik.studyingproj;

public class Human {
    /*Данный класс является частью одной программы, здесь мы описываем все свойства и методы для реализации
        в программе класса "Человек" */
    //Human max = new Human(); /* Новый объект max, создается в main class*/
    /* у данного объекта могут быть свойства( состояния), согласно приницпу ООП, которые описываются в классе, к которому
    принадлежит объект*/
    private int Age;
    private double Weight =70;
    private long Salary;/* Деньги считаются в копейках, центах и т.д, нельзя использовать дробный тип переменных*/
    private String FullName;
    /*Также и методы, проводящие какие-либо дейсвтия с свойсвтами объекта( поведение объекта)*/

    public double getWeight() { //Getter - метод, позволяющий получить доступ к свойству класса
        return Weight;
    }
    public double moonWeight() {  // Типичный метод для расчета лунного веса человека  В скобки можно передавать какие-либо переменные, которые будут использоваться в рамках данного метода.
        return Weight * 0.17; // Выводить эти данные можно только в порядке, который подходит под типы переданных переменных
        // Например: public double getWeight(int i, double d, boolean bool)
        // то, при выводе на экран, например: System.out.println(obj.getWeight(3, 3.5, true));
        //т.е подходящие значения строго в порядке к подходящим типам.
    }
    public void setWeight(double weight) { // Сеттер - метод, позволяющий установить значение свойства
        Weight = weight;
    }

    public void setSalary(long salary) { //Alt+Insert - можно генерировать различные методы, геттеры, сеттеры и т.д
        Salary = salary;
    }
    //Ниже находится конструктор объектов класса Human с установлением значений Age и Salary.
    Human(int age, long salary){
        Age=age; Salary=salary;
    }
}
