package com.maxonchik.OOP;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.lang.*;
import java.io.*;

// 1)Обычный вывод введенного массива символов с обработкой IOException(консольный ввод)
//2)Методы printf() и format()
/*Итак,*/
public class IOtrying {

   /* static int method1(int i)  //Подробный разбор вызовов методов. Method1 возвращает то, что возвращает Method4 по иерархии.
    // При вызове метода 1 значения передаются поступенчато к методу, который возвращает конкретное значение и не требует
    //другого метода для своего выполнения
    {
        return method2(i *= 11);
    }

    static int method2(int i)
    {
        return method3(i /= 11);
    }

    static int method3(int i)
    {
        return method4(i -= 11);
    }

    static int method4(int i)
    {
        return i += 11;
    }*/
    //Пример использвания статического инициализатора класса и инициализатора экземляра
/*    public static int a=1111;        // Интересная новая штука)))
    static {a=a-- - --a;}  // инициализатор класса
    {a= a++ + ++a;} //инициализатор экземпляра*/
    public static void main(String args[]){
        /*1-я программа*/
        /*    try {
           byte arraydata[] = new byte[25];
           System.out.println("Ну вводи че ты там хочешь... ");
           System.in.read(arraydata);
           System.out.print("Поздравь себя, ты ввел : ");
           for (int i = 0; i < arraydata.length; i++) {
               if (arraydata[1] == 'a') {
                   System.out.println("АААAAAAAAAAAAA ДАУН НЕЛЬЗЯ ЧТОБЫ а МАЛЕНЬКАЯ ВТОРОЙ БЫЛА!!!!! ");
                   return;
               }

               System.out.print((char) arraydata[i]);
           }
       } catch (IOException ioEx){
           System.out.println("Ошибка ввода, дурачок");
       }*/
        /*2-я*//*
        String s ="123";
        System.out.printf(s); //тоже что print, о с доп.параметрами обязательными
        System.out.format(s); //тоже, что printf, подробности узнаем по мере необходимости*/
        /*3-я прога для работы с файлами. Имя файла вводится как arg командной строки, в Идее оно прописывается в конфиге проекта*/
        /*Шо то не ладится((*/
        /*3-я программа: файлы*/
        /*  File FileName;
        FileInputStream txtReader;
        int i;
        FileName = new File("C:\\Users\\apart-136\\Desktop","SomeTextDoc.txt");
        try{
            txtReader = new FileInputStream(FileName);
        } catch (FileNotFoundException pizdec){
            System.out.println("Файл не найден");
            return;
        }
        try{
            do{
                i=txtReader.read();
                if(i !=-1) System.out.print((char) i); //-1 то конец файла, это значение возвращает метод read()
            } while(i != -1);
        } catch (IOException IOexC){
            System.out.print("Ошибка при чтении файла");
        }
        finally {
            try{
                txtReader.close();
            } catch (IOException askjak){
                System.out.println("Ошибка закрытия файла");
            }


            //finally {

            // System.out.println(FileName.isFile());//Надо смотреть иногда на имя файла в свойствах файла)))) Я и не подумал, что у меня
            //не стояла возможность смены расширения*/
        /*4_я прога Копирование содержимого одного файла в другой*/
     /*   File FirstFile = new File("C:\\Users\\apart-136\\Desktop", "SomeTextDoc.txt");
        File SecondFile = new File("C:\\Users\\apart-136\\Desktop", "Try to rewrite me looser!.txt");
        int i;
        FileInputStream instream = null;
        FileOutputStream outstream = null;
        try(instream = new FileInputStream(FirstFile); outstream = new FileOutputStream(SecondFile);)
            do{
                i=instream.read();
                if(i!=-1) outstream.write(i);
            }
            while(i!=-1);
        } catch (IOException IOex){
            System.out.println("Ошибка-ввода-вывода");
        }
        }*/
        /*5-я прога: запись примитивов в файл*/
     /*   int y = 100;
        double d = 25.158;
        boolean bool = true;
        File FileName = new File("C:\\Users\\apart-136\\Desktop", "Try to rewrite me looser!.txt");
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(FileName, true))) {
            dataOut.writeDouble(d);
            dataOut.writeInt(y);
            dataOut.writeBoolean(bool);
        } catch (IOException ioEX) {
            System.out.println("IOEXCEPTION MAZAFAKA");
        }
        try(DataInputStream dataIn = new DataInputStream(new FileInputStream(FileName))){
            dataIn.readDouble();
            System.out.println(d);
        }catch (IOException ioeXX){
            System.out.println("IOEXCEPTiON epta");
        }*/
     /*6-я прога: чтение строк с помощью буферизованного символьного потока*/

     /*   try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
        String ch;
            System.out.println("Пока точку не введешь, не закроется");
        do{
            ch = bf.readLine();
            if (ch.equals("\n")) ;
            System.out.print(ch);
        } while (bf.readLine()!="пезда");
        }
        catch (IOException ioexc){
            System.out.println("Ошибка ввода");
        }*/
     //Сравнение объектов типа Integer с помощью операора сравнения ==
        /*
    Integer i1 =127;
    Integer i2 =127;
        System.out.println(i1==i2); *//*true, так как объекты ссылаются на одну и ту же ячейку кэша автоупаковки, по умолчанию кэш идет
        от -128 до 127. В случае выхода из этого диапазона, объекты уже будут ссылаться на разные ячейки памяти
        Диапазон кэша можно регулировать, об этом далее*/
    /*   try{ Integer i = new Integer(null);} catch (Exception exc){
           System.out.println("Какой нулл, ты дурак?");
       }
        String s = new String();*/
    //String s = "23d"+2+2+"dasd"+2+"asa";// Числа преобразуются в объекты типа Integer и через метод toString() преобразуются в строки
        //и конкатенируются
      //  System.out.println(s);
    }
}


