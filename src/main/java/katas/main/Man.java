package katas.main;

public class Man {
//    Создать класс Man (человек). Он содержит 4 поля: String имя, String должность, int возраст, double рост.
//        Все поля private, проинициализировать все поля в конструкторе.
//
//                В классе Main вам дана строка: “Это Иван, ему 34 года, его рост 166.3 см. Должность - программист.”
//        Необходимо распарсить строку, то есть вытащить из нее данные и сохранить в переменные.
//
//                Создать объект Man, в качестве параметров в конструктор передать данные полученные из строки.
//
//                Вывести на экран все значения переменных (вам понадобятся геттеры).

    private String name;
    private String job;
    private int age;
    private double height;

    public Man(String name, double height, int age, String job) {
        this.name = name;
        this.height = height;
        this.age = age;
        job = job;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public String getName() {
        return name;
    }
}
