package katas.main;

public class Day5OOP2_1920_1431 {
//    Создать класс работник, в котором будет 3 поля: имя, должность и зарплата. В конструкторе с параметрами проинициализировать все поля.
//
//    Добавить метод с параметром int, тип возвращаемого значения - String,
//    который возвращает информацию о сотруднике, а также о сумме зарплаты, которую он получил за i месяцев
//            (значение i передается в качестве параметра).
//
//    Продемонстрировать работу методов в классе Main.

//    public static void main(String[] args) {
//        Worker wokrer1 = new Worker("Dilan", "Programmer", 50000);
//
//        String info = wokrer1.getInfo(12);
//
//        System.out.println(info);
//    }

//    Создать класс Монстр, с 3-мя полями типа int (кол-во глаз, ног и рук).
//    Создать 4 конструктора (пустой, с 1-им параметром, 2-мя и 3-мя).
//    Если в параметрах конструктора не устанавливается какое-то значение, то установить его равным 2.
//
//    Создать методы
//    void voice() - выводит на экран слово “Голос”
//    void voice(int i) - выводит слово голос i раз
//    void voice(int i, String word) - выводит слово word i раз

//        Monstr Joker = new Monstr();
//
//        Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
//
//        A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
//
//
//
//        Example 1:
//
//        Input: nums = [0,2,1,5,3,4]
//        Output: [0,1,2,4,5,3]
//        Explanation: The array ans is built as follows:
//        ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//                = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//                = [0,1,2,4,5,3]
//        Example 2:
//
//        Input: nums = [5,0,1,2,3,4]
//        Output: [4,5,0,1,2,3]
//        Explanation: The array ans is built as follows:
//        ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//                = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
//                = [4,5,0,1,2,3]
//
//
//        Constraints:
//
//                1 <= nums.length <= 1000
//                0 <= nums[i] < nums.length
//        The elements in nums are distinct.
//
//
//        Follow-up: Can you solve it without using an extra space (i.e., O(1) memory)?

//        class Solution {
//                public int[] buildArray(int[] nums) {
//                        int[] ans = new int[nums.length];
//                        int IndexNumber;
//                        for (int i = 0; i < nums.length; i++) {
//                                IndexNumber = nums[i];
//                                ans[i] = nums[IndexNumber];
//                        }
//                        return ans;
//                }
//        }

//    Kids With the Greatest Number of Candies
//            Easy
//    Topics
//    premium lock icon
//            Companies
//    Hint
//    There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
//
//    Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
//
//    Note that multiple kids can have the greatest number of candies.
//
//
//
//            Example 1:
//
//    Input: candies = [2,3,5,1,3], extraCandies = 3
//    Output: [true,true,true,false,true]
//    Explanation: If you give all extraCandies to:
//            - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//            - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//            Example 2:
//
//    Input: candies = [4,2,1,1,2], extraCandies = 1
//    Output: [true,false,false,false,false]
//    Explanation: There is only 1 extra candy.
//    Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
//    Example 3:
//
//    Input: candies = [12,1,12], extraCandies = 10
//    Output: [true,false,true]
//
//
//    Constraints:
//
//    n == candies.length
//2 <= n <= 100
//            1 <= candies[i] <= 100
//            1 <= extraCandies <= 50

//    class Solution {
//        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//            List<Boolean> result = new ArrayList<>();
//            int max = candies[0];
//            for (int i = 0; i < candies.length; i++) {
//                if (candies[i] > max) {
//                    max = candies[i];
//                }
//            }
//            for (int j = 0; j < candies.length; j++) {
//                if (candies[j] + extraCandies >= max) {
//                    result.add(true);
//                }
//                else {
//                    result.add(false);
//                }
//            }
//            return result;
//
//        }
//    }

//    В классе Box создать метод, который принимает в качестве параметра объект box,
//    и возвращает новую коробку, у которой все размеры равны: размеры вызывающего объекта + размеры переданного объекта.
//
//    Создать конструктор, который принимает 2 коробки. С помощью этого конструктора можно будет создать объект,
//    который по объему больше, чем 2 переданные коробки вместе взятые.
//
//    Продемонстрировать работу метода и конструктора в классе Main в методе main().
//    public static void main(String[] args) {
//        Box b1 = new Box (5, 3, 7);
//        Box b2 = new Box (6, 8, 12);
//
//        Box sum = b1.combine(b2);
//
//        System.out.println("b1: " + b1.info());
//        System.out.println("b2: " + b2.info());
//        System.out.println("sum: " + sum.info());
//
//        Box bigger = new Box(b1, b2);
//        System.out.println("bigger than b1+b2: " + bigger.info());



    }
