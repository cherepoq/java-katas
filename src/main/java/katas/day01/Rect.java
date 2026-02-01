package katas.day01;

public class Rect {
//    Создать класс Rect (прямоугольник), в котором будет 2 поля - длина и ширина. Объявить 3 метода:
//
//        1) Метод, который принимает 2 параметра - длину и ширину, и устанавливает их у нашего прямоугольника.
//        2) Метод без параметров - возвращает периметр прямоугольника.
//        3) Метод без параметров - возвращает площадь прямоугольника.
//
//        В классе Main продемонстрировать работу данных методов.

    int length;
    int width;

    void Zakrep (int length, int width) {
        this.length = length;
        this.width = width;
    }

    int perimetr() {
        return length * 2 + width * 2;
    }

    int summary() {
        return length * width;
    }

}
