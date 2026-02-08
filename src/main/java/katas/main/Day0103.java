package katas.main;

public class Day0103 {
    public static void main(String[] args) {
//        double a = 6;
//        double b = 8;
//        double c = (int) Math.sqrt(a*a+b*b);
//        System.out.println(c);

//        int time = 9;
//        int Weather = 0;
//        boolean late = time >= 22 || time < 6;
//        boolean goodWeather = Weather == 1;
//        if (late) {
//            System.out.println("Спать");
//        }
//        if (!late && goodWeather) {
//            System.out.println("Гулять");
//        }
//        if (!late && !goodWeather) {
//            System.out.println("Читать книгу");
//        }

//        //Вывести все нечетные числа от 100 до 1000, которые делятся без остатка на 5.
//        int Neven = 0;
//        for (int i = 100 ; i >= 100 && i <= 1000; i++) {
//            if (i % 2 != 0) {
//                Neven = i;
//                if (Neven % 5 == 0) {
//                    System.out.println(Neven);
//                }
//            }
//
//        }


//        int i = 1000;
//        while (i >= 0 ) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i--;
//        }

//        int i = 0;
//        int suummary = 0;
//        while (i <= 100) {
//            suummary += i;
//            i++;
//        }
//        int result = suummary / i;
//        System.out.println(result);

//
//        Создать массив чисел, и проинициализировать его значениями от 100 до 1000.
//        Создать второй массив по длине равный первому (использовать свойство length).
//        Проинициализировать его значениями, взятыми из первого массива, но в обратном порядке.
//        В цикле for each вывести все элементы второго массива.

//            int[] M = new int[900];
//            for (int i = 0; i < M.length; i++) {
//                M[i] = i + 100;
//            }
//            int[] S = new int[M.length];
//            for (int count = 0, max = S.length - 1; count < S.length; count++, max--) {
//                S[count] = M[max];
//            }
//            for (int Skolko : S) {
//                System.out.println(Skolko);
//            }


//            String[] NameM = {"January, ", "February, ", "March, ", "April, "};
//            for (String i : NameM) {
//                System.out.println(i);
//            }

//        Написать программу, которая принимает строковую переменную с названием месяца.
//        И если месяц введен правильно, то вывести на экран время года, к которому этот месяц относится,
//        в противном случае вывести сообщение, что месяц не существует.
//
//                Выполнить при помощи switch-case.

//        String NameOfMonth = "Апрель";
//        String[] AllMonths = {
//                "Январь",
//                "Февраль",
//                "Март",
//                "Апрель",
//                "Май",
//                "Июнь",
//                "Июль",
//                "Август",
//                "Сентябрь",
//                "Октябрь",
//                "Ноябрь",
//                "Декабрь",
//        };
//        int monthNumber = 0;
//        for (int i =0; i < AllMonths.length; i++) {
//            if (AllMonths[i].equals(NameOfMonth)) {
//                monthNumber = i + 1;
//                break;
//            }
//        }
//        switch (monthNumber) {
//            case 1,2,12:
//                System.out.println("Зима");
//                break;
//            case 3,4,5:
//                System.out.println("Весна");
//                break;
//            case 6,7,8:
//                System.out.println("Лето");
//                break;
//            case 9,10,11:
//                System.out.println("Осень");
//                break;
//            default:
//                System.out.println("Месяц не существует");
//        }

//        leetcode Fizz Buzz

//        Given an integer n, return a string array answer (1-indexed) where:
//
//        answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//        answer[i] == "Fizz" if i is divisible by 3.
//        answer[i] == "Buzz" if i is divisible by 5.
//        answer[i] == i (as a string) if none of the above conditions are true.

//        Дано целое число n. Верните строковый массив answer (с индексацией от 1), в котором:
//
//        answer[i] == "FizzBuzz", если i делится на 3 и 5.
//        answer[i] == "Fizz", если i делится на 3.
//        answer[i] == "Buzz", если i делится на 5.
//        answer[i] == i (в виде строки), если ни одно из вышеперечисленных условий не выполняется.

//        class Solution {
//            int n = 5;
//            public List<String> fizzBuzz(int n) {
//                List<String> answer = new ArrayList<>();
//                for (int i = 1; i <= n; i++) {
//                    if (i % 3 == 0 && i % 5 == 0) {
//                        answer.add("FizzBuzz");
//                    }
//                    else if (i % 5 == 0) {
//                        answer.add("Buzz");
//                    }
//                    else if (i % 3 == 0) {
//                        answer.add("Fizz");
//                    }
//                    else {
//                        answer.add(String.valueOf(i));
//                    };
//                };
//                return answer;
//            };
//        };
//        Создать класс Человек, в котором будет 3 поля: имя, возраст и вес.
//
//        В классе Main создать 5 экземпляров класса Человек,
//        присвоить значения их полям и вывести на экран их средний возраст.

//        human humanoid1 = new human();
//        human humanoid2 = new human();
//        human humanoid3 = new human();
//        human humanoid4 = new human();
//        human humanoid5 = new human();
//        humanoid1.name = "Ilya";
//        humanoid1.age = 15;
//        humanoid1.weight = 75;
//        humanoid2.weight = 14;
//        humanoid3.weight = 27;
//        humanoid4.weight = 98;
//        humanoid5.weight = 115;
//        double SummaryWeight = (humanoid1.weight + humanoid2.weight + humanoid3.weight + humanoid4.weight + humanoid5.weight) / 5;
//        System.out.println(SummaryWeight);

    }
}
