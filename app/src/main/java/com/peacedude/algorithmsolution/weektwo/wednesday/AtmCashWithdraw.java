package com.peacedude.algorithmsolution.weektwo.wednesday;

//        Task
//        An ATM only has 100, 50 and 20 dollar bills (USD) available to be dispensed.
//
//        Given an amount between 40 and 10000 dollars (inclusive) and assuming that the ATM wants to use as few bills as possible, determinate the minimal number of 100, 50 and 20 dollar bills the ATM needs to dispense (in that order).
//
//        Here is the specification for the withdraw method you'll complete:

public class AtmCashWithdraw {
    public static int[] withdraw(int n) {
        int n50 = 0;
        int n20 = n / 20;
        int rem = n % 20;

        if (rem == 10) {
            n20 -= 2;
            n50 += 1;
        }

        int n100 = n20 / 5;
        n20 %= 5;
        return new int[]{n100, n50, n20};
    }
}