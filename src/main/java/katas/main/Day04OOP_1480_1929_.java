package katas.main;

public class Day04OOP_1480_1929_ {
    public static void main(String[] args) {

//        Создать класс Dog (собака), в котором будет 3 поля: String - кличка, String - порода, int - скорость.
//
//                Создать внутри класса 2 метода:
//
//        1) Метод run (бежать) - без параметров, тип void. При вызове данного метода на экран выводится “бегу, бегу, бегу...” -
//                слово “бегу” должно вывестись столько раз, сколько указано в переменной скорость.
//
//        2) Метод String info(); - возвращает строку с полной информацией о собаке (кличка, порода и скорость), э
//        тот метод ничего не выводит на экран.
//
//                В классе Main продемонстрировать работу данных методов.

//        Dog Corgy = new Dog();
//        Corgy.name = "снежинка";
//        Corgy.breed = "корги";
//        Corgy.speed = 5;
//
//        Corgy.run();
//        System.out.println(Corgy.info());


//        Создать класс Rect (прямоугольник), в котором будет 2 поля - длина и ширина. Объявить 3 метода:
//
//        1) Метод, который принимает 2 параметра - длину и ширину, и устанавливает их у нашего прямоугольника.
//        2) Метод без параметров - возвращает периметр прямоугольника.
//        3) Метод без параметров - возвращает площадь прямоугольника.
//
//        В классе Main продемонстрировать работу данных методов.

//        Rect cube = new Rect();
//        cube.Zakrep(15, 20);
//
//        System.out.println(cube.summary());
//        System.out.println(cube.perimetr());

//        Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//                Return the running sum of nums.
//
//
//
//                Example 1:
//
//        Input: nums = [1,2,3,4]
//        Output: [1,3,6,10]
//        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
//        Example 2:
//
//        Input: nums = [1,1,1,1,1]
//        Output: [1,2,3,4,5]
//        Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
//        Example 3:
//
//        Input: nums = [3,1,2,10,1]
//        Output: [3,4,6,16,17]
//
//
//        Constraints:
//
//        1 <= nums.length <= 1000
//                -10^6 <= nums[i] <= 10^6
//
//
//        class Solution {
//            public int[] runningSum(int[] nums) {
//                for (int i = 1; i < nums.length; i++) {
//                    nums[i] += nums[i-1];
//                };
//                return nums;
//            };
//        };

//        Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//                Specifically, ans is the concatenation of two nums arrays.
//
//                Return the array ans.
//
//
//
//                Example 1:
//
//        Input: nums = [1,2,1]
//        Output: [1,2,1,1,2,1]
//        Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//        - ans = [1,2,1,1,2,1]
//        Example 2:
//
//        Input: nums = [1,3,2,1]
//        Output: [1,3,2,1,1,3,2,1]
//        Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
//        - ans = [1,3,2,1,1,3,2,1]
//
//
//        Constraints:
//
//        n == nums.length
//        1 <= n <= 1000
//        1 <= nums[i] <= 1000
//
//        class Solution {
//            public int[] getConcatenation(int[] nums) {
//                int n = nums.length;
//                int[] ans = new int[n * 2];
//                for (int i = 0; i< n; i++) {
//                    ans[i] = nums[i];
//                    ans[i + n] = nums [i];
//                }
//                return ans;
//            }
//        }

//        class Solution {
//            public int[] shuffle(int[] nums, int n) {
//                int[] ans = new int[n * 2];
//                for (int i = 0; i < n; i++) {
//                    ans[i] = nums[i];
//                    ans[i + 1] = nums[i + n];
//                }
//                return ans;
//            }
//        }
//
//        class Solution {
//            public int[] shuffle(int[] nums, int n) {
//                int[] ans = new int[n * 2];
//                for (int i = 0; i < n; i++) {
//                    ans[2*i] = nums[i];
//                    ans[2*i + 1] = nums[i + n];
//                }
//                return ans;
//            }
//        }


    }
}
