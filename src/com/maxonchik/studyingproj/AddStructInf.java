package com.maxonchik.studyingproj;
import com.maxonchik.otherPackage.*;

public class AddStructInf {
    otherpackageClass new2 = new otherpackageClass();

    /*ПАКЕТЫ в JAVA
    Пакет - группа логически связанных классов. Полное имя пакета состоит из 3-х составляющих:
    1) Тип домена, 2) Имя домена, 3) Имя проекта
    Например: com(1).maxonchik(2).studyingproj(3).
    Для имени пакета выделяется место в пространтсве имен - оно определяет область объявлений. Нельзя присваивать классам
    одинаковые имена из одного пространства имен. Главная их функция - предотвращение конфликтов имен классов.
    Все классы принадлежат к пакетам. Если, опреатором package не указано имя пакета, то используется пакет по умолчанию, который
    не обладает никаким именем. Общий синтаксис объявления пакета:
    package имя_пкета;
    Для управления паетами, в Джаве используется файловая система, которая определяет пакеты в каталоги(для каждого пакета - свой
    каталог). Чтобы создать иерархию пакетов, нужно лишь разделить имена пакетов точками: package pack1.pack2.pack3....
    В Intellij IDEA каталоги создаются автоматически, вручную их создавать не нужно.
    Пакеты являются методом структуризации проекта и его идентификации.
    Если в пакете создается субпакет(subpackage), то его полное имя будет:
    com.maxonchik.studyingproj.subpackage(название субпакета).
    Полное имя класса состоит из имен пакета и класса, наприме класс TestClass находится в субпакете subpackage
    нашего основного пакета: Адрес класса:com.maxonchik.studyingproj.subpackage.TestClass*/
    /*Еесли необходимо получить доступ к классу другого пакета, чтобы не писать каждый раз его адрес при создании
    объекта класса того пакета, используется оператор import. Вводится полный адрес класса.
    Это не всегда удобно, так как если нужно импортировать несколько классов из пакета, то
    нужно писать несколько раз импорт адрес класса и т.д. Чтобы так не делать, вместо
    названия класса пишется "*" Это значит, что заимпортируются все классы пакета.
    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!ТАБЛИЦА МОДИФИКАТОРОВ ДОСТУПА!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                                                    public      private     protected       дефолтный модификатор
    Доступен в том же классе                        да          да          да              да
    Доступен из подкласса в том же пакете           да          нет         да              да
    Доступен из любого класса в том же пакете       да          нет         да              да
    Доступен из подкласса в любом пакете            да          нет         да              нет
    Доступен из любого класса в любом пакете        да          нет         нет             нет
    (изи сам составил)))
    Эта таблица для членов классов
    Protected в C++ отличается от Java тем, что в С++ данный модификатор доступа позволяет пользоваться полями только лишь
    подклассам. А в Java в пределах пакета и подклассам со всех пакетов.
    Библиотеки Java: Java обладает набором стандартных библиотек, они называются Java API (Application Programming Interface).
    Эти классы хранятся в общем пакете java, который иерархируется далее:

    java.lang - содержит большое количество классов общего назначения
    java.io - классы для поддержки ввода-вывода данных
    java.net - классы для поддержки сетевого взаимодействия
    java.applet - классы для создания апплетов
    java.awt - поддержка набора инструментальных средств Abstract Window Toolkit.(графическая библиотека)
    java.util - пакет Java Collections Framework, а также несколько классов, не относящихся к коллекциям.
    java.sql - JDBC - Java DataBase Connectivity - работа с базами данных


    Пакет java.lang автоматически импортирован в каждый класс, другие нужно импортировать явным образом.

    Интерфейсы в Java: Интерфейс определяет набор методов, которые должны находиться в классе. В самом интерфейсе методы не реализуются
    , он представляет собой чисто логическую консрукцию.
    Интерфейс имеет сходство с абстрактным методом: в абстрактом методе определяется имя метода, его сигнатура, но не как
    должен этот метод использоваться. Таким образом, абстрактный метод определяет ИНТЕРФЕЙС, но не реализацию.
    В Java редусмотрено разделение интерфейса класса и его реализацию с помощью ключевого слова interface. По синтаксису, интер-
    фейсы подобны абстрактным классам. Но, в интерфейсе абсюлютно все методы не должны иметь тела. Т.е, работает полное ограничение
    реализации методов. В интерфейсе указывается только то, что надо делать, но не как это надо делать. Один интерфейс м/б реализован
    в любом количестве классов, так и в одном классе м/б реализовано любое количество интерфейсов.
    Для реализации интерфейса уже предоставляются тела методов, определенных в интерфейсе. Каждому классу предоставляется свобода
    в своей реализации заданного  интерфейса. В коде, в котором извествен какой-либо интерфейс могут использоваться объекты нескольких
    классов, которые реализуют этот интерфейс, т.к для этих разных объектов - одинаковый интерфейс. Интерфейсы позволяют
    полностью реализовать полиморфизм в Java: принцип один интерфейс - множество методов.
    Общий синтаксис объявления интерфейсов:
    модификатор_доступа interface имя{
    тип имя_метода(список_параметров);
    тип имя_метода2(список_параметров);
    тип переменная = значение;
    .....
    }
    Как правило, интерфейс имеет public или дефолтный модификатор.
    При объявлении методов указываются типы и сигнатуры.
    Эти методы является, по сути, абстрактными.
    Каждый класс, использующий интерфейс, должен полностью его реализовать. Переменные интерфейса неявно обозначаются как
    public static final и должны быть обязательно реализованы.
    Определнный однажды интерфейс м/б реализован одним или несколькими классами. Для реализации интерфейса используется
    ключевое слово implements: синтаксис:
    class ClassName extends SuperClassName implements SuperClassNameInterface{
    //тело класса
    }
    Ключевое слово extends и имя суперкласса указывать необязательно
    Все методы интерфейса должны быть public, также сигнатуры реализуемых методов должны полностю соответсвовать сигнатурам
    методов, поределнных в интерфейсе. Класс, реализующий интерфейс, может содержать дополнительно сви методы, необъявленные
    в интерфейсе, зачастую, программисты на JAva так и делают. Возможно, необходимо будет внести изменения в методы интерфейса,
    но сам интерфейс не претерпит никаких изменений. Если класс реализует не все методы интерфейса, то класс д/б объявлен как
    abstract. Объект абстрактного класа не создать, но его можно использовать в качестве суперкласса, а завершить реализацию методов
    в его подклассах.
    Применение интерфейсных ссылок: можно объявлять переменные, хранящие ссылки на интерфейс. Такая пременная ссылается на любой
    объект, реализующий ее тип интерфейса.
    Переменные в интерфейсах: переменные, объявленные в интерфейсах - константы
    Один интерфейс может наследовать другой. Синтаксис для интерфейсов аналогичен наследованию классов. если класс наследует
    подинтерфейс, то в классе нужно определить все методы суперинтерфейса и подинтерфейса.
    В интерфейсах, помимо абстрактных методов, могут быть определны методы по умолчанию. Это было доавлено в JDK 8.
    Методы по умолчанию означают, что методы могут быть реализованы в интерфейсе по умолчанию, и, если в классах не переопределяются
    методы интерфейса другим образом, то используется тело метода, определенное по умолчанию. Такие методы интерфейсов
    называются методами расширения. Такие методы дают возможность необязательного определния в классах всех существующих
    в интерфейсе методов и определять их только при определенных условиях. Эти методы обозначаются ключевым словом default.
    Таким образом, нет нужды писать "заглушку" для метода, реализация которого в классе нам не нужна
    Самое главное преимущество такого способа: возможность обновлять свои интерфейсы безболезненно для работы программ, исполь-
    зующих этот интерфейс, не нарушая работоспособность.
    Проблема множественно наследования от интерфейсов: если 2 интерфейса реализуются в одном классе, и оба интерфейса имеют
    2 одинаковых дефолтных метода, то возникает проблема, от какого интерфейса возьмется метод? Приоритетно реализуется
    собственная реализация классом метода. Если не реализуется, то возникает ошибка. Если интерфейс наследует другой интерфейс
    и оба имеют метод с одинаковым именем, то будет использоваться версия подинтерфейса. Чтобы сослаться на конкретную реализацию,
    нужно прописать следующее: имя_интерфейса.super.имя_метода();
    Использование статических методов интерфейса: Также добавлено в JDK 8. Как и в классах, статические методы интерфейсов
    можно вызывать без создания объекта. Чтобы вызвать такой метод, используется синтаксис:
    имя_интерфейса.имя_статического_метода();
    Статические методы интерфейсов неявно обозначаются как final.
    P.S. Интерфейсы очень важная составляющая, влдаеть ими обязательно! На практике используются почти всегда.

     */
}
