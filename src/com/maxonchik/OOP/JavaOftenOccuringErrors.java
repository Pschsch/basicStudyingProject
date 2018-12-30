package com.maxonchik.OOP;
/*Наиболее часто возникающие ошибки в Java*/
public class JavaOftenOccuringErrors {
    /*

    *Error#1

    * String s = new String(null)   - Ошибка времени выполнения, объект String is ambiguous. Null может передаваться нескольким конструкторам
    * в данном случае неясно, к какому конструктору обращаться. Всего таких претендентов 5:
    * String(byte[] bytes)
    * String(char[] value)
    * String(String original)
    * String(StringBuffer buffer)
    * String(StringBuilder builder)
    *
    * Error#2
    *
    * SomeClass someObj = new SomeClass;
    * someObj = null
    * someObj.someMethod - Исключение NullPointerException - исключение, вызывающееся при использовании пустой ссылки на объект
    *
    * Error#3
    *
    * */
}
