package com.maxonchik.studyingproj;
import com.maxonchik.OOP.*;
import com.maxonchik.AcceptionOOPInPractice.*;
import java.util.Random;
import java.util.Scanner;
/* Информация из источников: 1) loftblog, 2)hillel, 3) Уроки Java
 4)http://developer.alexanderklimov.ru, 5)https://www.oracle.com/technetwork/java/codeconventions-150003.pdf
 6)https://docstore.mik.ua/orelly/java-ent/jnut/ch06_02.htm(JAVABEANS CONVENTIONS)
 7)Герберт Шилдт- основы Java 8.
 JavaBeans - классы в Java, написанные по определенным правилам.*/
/*Achievements: 1) First Steps - Learn a base of Java and OOP coding (Java Syntax)- got
* 2) Try Harder - learn Java Core!!! - haven't got yet.
* 3) Start Android - first app "HelloWorld" - haven't got yet.*/



public class Main {

    public static void main (String[] args) {
        /*В Java исходный код программы не компилируется компилятором в машинный код и не выполняется непосредственно.
         В Java исходный компилируется лишь в байт-код, который не является исполняемым, который интерпретируется в виртуальной
         машине Java(Java Virtual Machine). Java Development Kit(JDK) одержит два exe-шника: java и javac. Javac - это компилятор,
         преобразующий исходный код в байт-код. Java - это интерпретатор, интерпретирующий байт-код, сформированный javac.
         В случае работы с компилятором, при выводе им синтаксических ошибок, делает он это не всегда правильно, нужно изучить
         строки кода, предшедствующие строке, обозначенной компилятором./
         Java является строго типизированным языком программирования.
          */
        // метод main является ВХОДНОЙ ТОЧКОЙ ПРОГРАММЫ!!!
        //Основой программирования на Java является принцип ООП( Объектно-ориентирвоанного программирования)
        //Программа, основанная на ООП, состоит из классов( class )
        //Классы - это описание абстрактных сущностей в ООП
        //В классах описываются свойства, которые характерны для объектов этого класса.
        //Объекты класса, в свою очередь, обладают конкретными значениями свойств класса.
        /* Помимо объектов, классы содержат методы ( функции ), которые могут быть применины как для данного
        класса, так и для всех классов в пакете или любой точке программы ( зависит от модификаторов доступа)
        Методы - это подпрограммы, выполняющие какие-то определенные действия*/
        /* Создадим класс Human.java и создадим там методы и свойства*/
        // Запуск программы можно осуществить не обязательно, начиная программу с метода main
        // Можно вместо строчки метода main написать просто static, только в конце программы
        // необходимо ввести System.exit(0); (выход из системы с кодом 0)
        Human max = new Human(20, 3000000);
        Policeman dukalis = new Policeman(45, 4000000, 25);
        AddOpInf cicle = new AddOpInf();
        String stry = "123ury4";
        System.out.println(stry.indexOf(250));
        char Symbol = 'E';
        char Symbol2 = 't';
        byte tr = 10;
        byte kr = 12;
        byte ur;
        int Delimoe = 10;
        int Delitel = 3;
        if (Delitel != 0 && (Delimoe % Delitel) == 0) //Если не использовать укороченное И, то после первой операции, программе
            //необходимо будет произвести вторую, чтобы дать логическое значение выражению. Т.к в первом выражении делитель равен
            //0, естественно, выйдет ошибка деления на ноль, поэтому нужно укороченное И, чтобы сразу дать ложное значение выражению
            System.out.println(Delitel + "является делителем " + Delimoe);
        else System.out.println(Delitel + " не является делителем " + Delimoe);
        //Прграмма нахождения простых чисел в пределах от 2 до 100.
        int[] y; // ссылка на массив
        y = new int[98]; // можно на одной строке и объявить и создать в памяти. int[] y = new int[100];
        int sum = 0;               //Глава 2 задание 6 исправленное
        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println("summa ravna " + sum);
        }

        int var1; //числа для проверки
        int var2; //делители
        boolean isPrime;
        for (var1 = 2; var1 < 100; var1++) { // вводится первое значение 2
            isPrime = true;  // сразу присваивается true, false присвоится, если выполнится деление без остатка
            for (var2 = 2; var2 <= Math.sqrt(var1); var2++) // перебираем делители с условием, если делитель меньше корня делимого
                if ((var1 % var2) == 0)
                    isPrime = false; // если делитель больше корня делимого, то выполняется алгоритм. Если делится
            // без остатка, то число составное.
            if (isPrime) System.out.println(var1 + " is prime number"); //соответсвенно, вывести простые числа на экран
        }

        ur = (byte) (kr * tr);// Нужно присваивать byte, иначе требует int.
        System.out.println(ur);
        //  max.vozrast = 21;
        //  System.out.println("сколько лет Maксу? " + max.vozrast); // при наборе sout предлагается выбрать
        // System.out.println, чтобы не печатать каждый раз его!
        //System - это предопределенный класс, предоставляющий доступ к системным ресурсам
        //out - это поток вывода на консоль. Итого: System.out - это объект, инкапсулирующий вывод на консоль.
        //ЧУВАКИ, ДАЖЕ ДЛЯ ОПРЕДЕЛЕНИЯ КОНСОЛИ ИСПОЛЬЗУЕТСЯ ОБЪЕКТ, Java это очень строгое ООП!
        // Кстати, для вывода пустой строки, необходимо вызвать println без параметров)

        //Сила тяжести на Луне = 17% от земной. Рассчитать вес человека на Луне.
        max.setWeight(28);
        max.moonWeight();

        System.out.println("Вес человека на луне равен " + max.moonWeight());

        //Расчет расстояния до места удара молнии.
        /* Звук в воздухе распространяется со скоростью приблизительно равной 1100 футам в секунду.
          Зная интервал времени между вспышкой молнии и звуком сопровождающим ее можно рассчитать
          расстояние. Допустим интервал 7,2 секунды.*/
        // Для решения этой задачи, используем класс Lightning
        Lightning lightning = new Lightning();
        lightning.setTime(2.5);
        lightning.Distance();
        System.out.println("Расстояние до объекта в футах равно " + lightning.Distance());
        cicle.setRepeatCount(5);
        cicle.forRepeatCount();
        oop planet = new oopsecond(10, 20, 30);
        oop plane = new oop(15, 25);
        Car solaris1 = new Huyndai(2012, "sedan");
        AddOpInf gs = new AddOpInf();
        solaris1.setBaseSpeed(15);
        solaris1.setMultiplier(7.5);
        System.out.println(solaris1.drive());
        //Прога для вывода таблицы перевода дюймов в метры.
        double inch;
        double meter;
        int counter = 0;
        for (inch = 1; inch <= 30; inch++) {
            meter = inch * 0.0254;
            System.out.println(+inch + " дюймов равно\t" + meter + " метрам");
            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
        System.out.println(Symbol);
        boolean p, q;
        System.out.println("R\tS\tAND\tOR\tXOR\tNOT");
        /*   p=q=true;
         System.out.print(p+ "\t" + q + "\t");
         System.out.print((p&q)+"\t"+(p|q)+"\t");
         System.out.println((p^q)+"\t"+(!p));
         p=q=false;
         System.out.print(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t");
         System.out.println((p^q)+"\t"+(!p));
         p=false; q=true;
         System.out.print(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t");
         System.out.println((p^q)+"\t"+(!p));
         p=true; q=false;
         System.out.print(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t");
         System.out.println((p^q)+"\t"+(!p));*/
        gs.LogOpResult(true, true);
        gs.LogOpResult(true, false);
        gs.LogOpResult(false, true);
        gs.LogOpResult(false, false);
        gs.EnglishAlph();
    //пузырьковая сортировка элементов массива
        int sortArray[] = {283,125,-659,345,236,-335,919,456,797,12};
        int a,b,t;
        for ( a=1;a<10;a++){
            for ( b=9;b>=a;b--){
                if (sortArray[b-1]>sortArray[b]) {
                    t=sortArray[b-1];
                    sortArray[b-1]=sortArray[b];
                    sortArray[b]=t;
                }
            }
        }
        System.out.print("\nРаспределенный одномерный массив из 10 значений:");
        for (int i=0;i<10;i++){
            System.out.print(" "+sortArray[i]);
        }//Число итераций(проходов сотрировки) на 1 меньше, чем число элементов массива
        int array12[][] = new int[3][4]; //количсетво ячеек
        int c,d;
        System.out.println();
        for(c=0;c<3;++c){
            for(d=0;d<4;++d){
                array12[c][d]=c*4+d+1;  }
    }//номера ячеек
                System.out.println(array12.length+" "+array12[1].length+" "+array12[2].length+" "+array12[0].length);

        int h;
        int l;
        int s;
        int countingOfSymbolsOFArray=0;
        int VolumeArray[][][]={  //Объявили быстрой инициализацией трехмерный массив))))
                {
                        {3, 3, 3},
                        {3, 3, 3},
                        {3, 3, 3},
                },
                {
                        {3, 3, 3},
                        {3, 3, 3},
                        {3, 3, 3},
                },
                {
                        {3, 3, 3},
                        {3, 3, 3},
                        {3, 3, 3},
                }
        };
        for (h=0;h<3;++h)
            for(l=0;l<3;++l)
                for(s=0;s<3;++s){
                    countingOfSymbolsOFArray++;
                    System.out.println(VolumeArray.length);
                }








            }
        }






