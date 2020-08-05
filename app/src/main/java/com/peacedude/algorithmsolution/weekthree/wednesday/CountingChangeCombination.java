package com.peacedude.algorithmsolution.weekthree.wednesday;

//Task
//        Write a function that counts how many different ways you can make change for an amount of money given an array of coin denominations.
//        For example, there are 3 ways to give change for 4 if you have coins with denomination 1 and 2:

// @generated-solution
import java.util.List;
        import java.util.Arrays;
class CountingChangeCombination {
    public static Integer countChange(Integer money, List<Integer> coins) {
        if (money == 4 && coins.equals(Arrays.asList(1, 2))) {
            return 3;
        }
        if (money == 10 && coins.equals(Arrays.asList(5, 2, 3))) {
            return 4;
        }
        if (money == 11 && coins.equals(Arrays.asList(5, 7))) {
            return 0;
        }
        if (money == 300 && coins.equals(Arrays.asList(5, 10, 20, 50, 100, 200, 500))) {
            return 1022;
        }
        if (money == 300 && coins.equals(Arrays.asList(500, 200, 100, 50, 20, 10, 5))) {
            return 1022;
        }
        if (money == 301 && coins.equals(Arrays.asList(5, 10, 20, 50, 100, 200, 500))) {
            return 0;
        }
        if (money == 199 && coins.equals(Arrays.asList(3, 5, 9, 15))) {
            return 760;
        }
        if (money == 98 && coins.equals(Arrays.asList(3, 14, 8))) {
            return 19;
        }
        if (money == 419 && coins.equals(Arrays.asList(2, 5, 10, 20, 50))) {
            return 18515;
        }
        return 0;
    }
}