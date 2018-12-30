package com.maxonchik.studyingproj;

public class Policeman extends Human {
    int AgeofWork;
    Policeman(int age, long salary, int ageofWork){ //Конструктор полицейского, наследует от
        super(age, salary); AgeofWork = ageofWork;} // хьюмана + параметр стаж работы

}
