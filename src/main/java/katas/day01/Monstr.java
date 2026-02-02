package katas.day01;

public class Monstr {
//    Создать 4 конструктора (пустой, с 1-им параметром, 2-мя и 3-мя).
//    Если в параметрах конструктора не устанавливается какое-то значение, то установить его равным 2.
//
//    Создать методы
//    void voice() - выводит на экран слово “Голос”
//    void voice(int i) - выводит слово голос i раз
//    void voice(int i, String word) - выводит слово word i раз

    int hands;
    int eyes;
    int legs;

    Monstr() {
        hands = 2;
        eyes = 2;
        legs = 2;
    }

    Monstr(int all) {
        hands = all;
        eyes = all;
        legs = all;
    }

    Monstr(int handsLegs, int eyes) {
        hands = handsLegs;
        legs = handsLegs;
        this.eyes = eyes;
    }

    Monstr(int hands, int legs, int eyes) {
        this.hands = hands;
        this.legs = legs;
        this.eyes = eyes;
    }

    void voice() {
        System.out.println("Голос");
    }
    void voice (int i) {
        for (int j = 0; j < i; j++) {
            System.out.println("Голос");
        }
    }
    void voice (int i, String word) {
        for (int j = 0; j < i; j++) {
            System.out.println(word);
        }
    }

}
