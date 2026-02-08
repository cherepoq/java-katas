package katas.main;

import java.util.ArrayList;

public class Day6OOP3 {
//    Установить у всех конструкторов, полей и методов класса Box правильные модификаторы доступа,
//    если необходимо, создайте геттеры и сеттеры.

    public static void main(String[] args) {
//        MyArrayList employees = new MyArrayList();
//        employees.add("Kolya");
//        employees.add("Ivan");
//        employees.add("Igor");
//        employees.add("Anastasia");
//        employees.add("Petrovich");
//
//        employees.remove(2);
//        employees.remove("Kolya");
//
//        employees.remove("Bob");
//
////        for (int i = 1; i < 100; i++) {
////            employees.add("Coworker " + i);
////        }
//
//        for (int i = 0; i < employees.getSize(); i++) {
//            System.out.println(employees.get(i));
//        }

//        Создать класс Man (человек). Он содержит 4 поля: String имя, String должность, int возраст, double рост.
//        Все поля private, проинициализировать все поля в конструкторе.
//
//                В классе Main вам дана строка: “Это Иван, ему 34 года, его рост 166.3 см. Должность - программист.”
//        Необходимо распарсить строку, то есть вытащить из нее данные и сохранить в переменные.
//
//                Создать объект Man, в качестве параметров в конструктор передать данные полученные из строки.
//
//                Вывести на экран все значения переменных (вам понадобятся геттеры).

//            String s = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист.";
//
//
//        String name = s.substring(s.indexOf("Это ") + 3, s.indexOf(", ему")).trim();
//        String ageStr = s.substring(s.indexOf("ему ") + 4, s.indexOf(" года")).trim();
//        int age = Integer.parseInt(ageStr);
//
//        String heightStr = s.substring(s.indexOf("рост ") + 5, s.indexOf(" см")).trim();
//        double height = Double.parseDouble(heightStr);
//
//        String job = s.substring(s.indexOf("Должность - ") + 11, s.length() - 1).trim();
//
//        Man man = new Man(name, height, age, job);
//            System.out.println(man.getJob());
//            System.out.println(man.getHeight());
//            System.out.println(man.getName());
//            System.out.println(man.getAge());

        //Создать 3 коллекции: в первой 10 чисел, во второй 10 имен (заполните их произвольными значениями),
          //  а третья коллекция должна автоматически заполняться строками, которые содержат число из первой коллекции,
            //    потом знак тире и строку из второй коллекции.

              //  Вывести все значения второй коллекции в цикле for each.

//        ArrayList<Integer> firstCollection = new ArrayList<>();
//        ArrayList<String> secondCollection = new ArrayList<>();
//        ArrayList<String> thirdCollection = new ArrayList<>();
//
//        firstCollection.add(1);
//        firstCollection.add(2);
//        firstCollection.add(3);
//        firstCollection.add(4);
//        firstCollection.add(5);
//        firstCollection.add(6);
//        firstCollection.add(7);
//        firstCollection.add(8);
//        firstCollection.add(9);
//        firstCollection.add(10);
//
//        secondCollection.add("Sergey");
//        secondCollection.add("Vitalik");
//        secondCollection.add("Vova");
//        secondCollection.add("Artem");
//        secondCollection.add("Aleksandr");
//        secondCollection.add("Aleksey");
//        secondCollection.add("Victor");
//        secondCollection.add("Nikita");
//        secondCollection.add("Kolya");
//        secondCollection.add("Toha");
//
//        for (int i = 0; i < firstCollection.toArray().length; i++) {
//            String graduation = firstCollection.get(i) + " - " + secondCollection.get(i);
//            thirdCollection.add(graduation);
//        }
//
//        for ( String name : thirdCollection) {
//            System.out.println(name);
//        }

//        Создать класс BoxWeight (весовая коробка), которая наследуется от Box с дополнительным полем weigth (вес).
//                Создать в ней все конструкторы, как в супер классе, в которых инициализируется также и поле вес.
//        Если необходимо, создайте геттеры и сеттеры на вес.
//
//                В родительском классе создайте метод showInfo(), который выводит всю информацию о коробке.
//                В дочернем классе переопределите этот метод, чтобы в нем выводилась также информация о весе.
//
//                Продемонстрировать работу конструкторов и методов родительского и дочернего классов в методе main().



    }


}
