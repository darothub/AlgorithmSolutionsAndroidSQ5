package com.peacedude.algorithmsolution.weektwo.monday;

public class CalculateRotation {
    public static int shiftedDiff(String first, String second) {
        if (first.length() == second.length()) {
            return second.concat(second).indexOf(first);
        }

        return -1;
    }
}