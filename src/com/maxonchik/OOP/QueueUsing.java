package com.maxonchik.OOP;
import java.io.IOException;


public class QueueUsing {

    public static void main(String args[]) {


        QueueUsing hr = new QueueUsing();
        Queue queueBig = new Queue(100);
        Queue queueSmall = new Queue(5);
        int ch;
        int i;
        for (i = 0; i < 26; i++) {
            queueBig.put((50 + i));
        }
        System.out.print("Queue Big contains: ");
        for (i = 0; i < 26; i++) {
            ch = queueBig.get();
            if (ch != 0)
                System.out.print(ch + " ");
        }
        System.out.println();
        for (i = 0; i < 6; i++) {
            System.out.println("Saving to Queue Small: " + (50 - i));
            queueSmall.put((50 - i));
        }
        for (i = 0; i < 6; i++) {
            ch = queueSmall.get();
            if (ch != 0) System.out.println(ch);
        }
        int array[] = {231, 432, 32423, 646, 214, 46457, 5234, 4634};
        int sum = 0;
        for (int x : array) {
            if (x == 46457) break;
            System.out.println("Value " + x);
            sum += x;
        }
        System.out.println("Summa " + sum);
        System.out.println("Hah, extremely useful thing))");
        int arraychik[][] = {
                {12312, 124, 523, 543, 4124, 5421},
                {4213, 253, 254124, 23546, 47,},
        };
        for (int x[] : arraychik) {
            for (int y : x) {
                System.out.println("Value " + y);
                sum += y;
            }

        }
        System.out.println("Summa " + sum);
        int resultOfComparing;
        int idx;
        String str = new String("Да-да-да, я объект, а ты думал не объект)");
        String str2 = new String(str);
        String str3 = "Java крутЬ)))";
        System.out.println("Длину str давай сюда: " + str.length());
        System.out.print("Посимвольно стр3: ");
        for (int l = 0; l < str3.length(); l++) {
            System.out.print(" " + str3.charAt(l));
        }
        System.out.println();
        if (str.equals(str2))
            System.out.println("str1 equals str2, ты ж знаешь, блин))");//сравнение последовательности символов по индексам
        resultOfComparing = str3.compareTo(str); //сравнение величин строк
        if (resultOfComparing < 0) System.out.println("str3<str");
        else if (resultOfComparing > 0) System.out.println("str3>str");
        else System.out.println("str3=str");
        idx = str.indexOf("объект"); //индекс начала первой подстроки
        System.out.println("Номер сивола начала подстроки \"объект\" " + idx);
        idx = str.lastIndexOf("объект"); //индекс начала последней подстроки
        System.out.println("Номер сивола конца подстроки \"объект\" " + idx);
        String str4 = str + str3; // конкатенация
        System.out.println(str4);
        String arrayOfStrings[] = {"jeppa", "pisya", "nenado", "plokhyh", "slov"};
        System.out.println("Ishodniy massiv: ");
        for (String s : arrayOfStrings) {
            System.out.print(s + " ");
        }
        System.out.println();
        arrayOfStrings[0] = "ulybka";
        arrayOfStrings[1] = "schast\'e";
        System.out.println("izmenenniy massiv: ");
        for (String r : arrayOfStrings) {
            System.out.println(r);
        }
        String str5 = str2.substring(7, 21); // Выводит с 7 до 21 символов, str5 -субстрока str2.
        System.out.println(str5);
        int r1;
        int x = 13;
        int y = 32;
        int summa = 0;
        double middleCount;
        r1 = x ^ y;
        double arrayCh5Ex3[] = {25.213, 48.5123, 623.123, 55.5123, 464.123, 52.5, 265, 55.5, 55.6, 23.8}; //Прога
        for (i = 0; i < 10; i++) {
            summa += arrayCh5Ex3[i];
        }
        middleCount = summa / arrayCh5Ex3.length;
        System.out.println("Среднее значение вашего массива равно " + middleCount);

        //пузырьковая сортировка элементов массива
        String sortArray[] = {"this", "is", "a", "test", "of", "a", "string", "sort", "nigga", "bitch"};
        int a, b;
        String t;
        for (a = 1; a < sortArray.length; a++) {
            for (b = sortArray.length - 1; b >= a; b--)
                if (sortArray[b - 1].compareTo(sortArray[b]) > 0) {
                    t = sortArray[b - 1];
                    sortArray[b - 1] = sortArray[b];
                    sortArray[b] = t;
                }
        }

        System.out.print("\nРаспределенный одномерный массив из 10 значений:");
        for (int m = 0; m < 10; m++) {
            System.out.print(" " + sortArray[m]);
        }//Число итераций(проходов сотрировки) на 1 меньше, чем число элементов массива
        int arrayMinMax[] = {531, 55, 325, 495, 2134, 85, 49, 495, 319};
        int min = arrayMinMax[0];
        int max = arrayMinMax[0];
        for (int j : arrayMinMax) {
            if (j < min) min = j;
            if (j > max) max = j;

        }
        System.out.println();
        System.out.println(min + " " + max);
        int egearray[] = {7, 9, 8, 1, 2, 3, 3, 10, 8, 6};
        int s = 0;
        for (i = 1; i < egearray.length; ++i) {
            if (egearray[i - 1] < egearray[i]) {
                egearray[i] = egearray[i - 1] + 1;
                s += 1;
            }
            System.out.println("s raven= " + s);
        }
        oopsecond obj2 = new oopsecond(15,56,165);
        obj2.AYE();

    }
}









