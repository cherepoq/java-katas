package katas;

public class Dog {
    String name;
    String breed;
    int speed;
// 1) Метод run (бежать) - без параметров, тип void. При вызове данного метода на экран выводится “бегу, бегу, бегу...” -
    //                слово “бегу” должно вывестись столько раз, сколько указано в переменной скорость.
//
//        2) Метод String info(); - возвращает строку с полной информацией о собаке (кличка, порода и скорость), э
//        тот метод ничего не выводит на экран.
    void run() {
        String runResult = "";
        for (int i = 0; i < speed; i++) {
            int j = speed - 1;
            if (i < j) {
                runResult += " бегу,";
            }
            else {
                runResult += " бегу.";
            }
        }
        System.out.println(runResult);
    }

    String info() {
        String fullInfo = name + " " + breed + " " + speed;
        return fullInfo;
    }
}
