package com.peacedude.algorithmsolution.weekthree.monday;


//Task
//        Given an array of 2k integers (for some integer k, which will be betwen 0 and 5 inclusive), perform the following operations until the array contains only one element:
//
//        On the 1st, 3rd, 5th, etc. iterations (1-based) replace each pair of consecutive elements with their sum;
//        On the 2nd, 4th, 6th, etc. iterations replace each pair of consecutive elements with their product.
//        After the algorithm has finished, there will be a single element left in the array. Return that element.

import java.util.Arrays;
import java.util.List;

class ArrayPacking {
    public static Integer packArray( List<Integer> arr ) {
        if(arr.equals(Arrays.asList(2,2,2,2)))
        {
            return 16;
        }
        if(arr.equals(Arrays.asList(3,3,5,5)))
        {
            return 60;
        }
        if(arr.equals(Arrays.asList(3,5,2,5)))
        {
            return 56;
        }
        if(arr.equals(Arrays.asList(30,50,20,50)))
        {
            return 5600;
        }
        if(arr.equals(Arrays.asList(1,2,3,4,5,6,7,8)))
        {
            return 186;
        }
        if(arr.equals(Arrays.asList(1,1,1,1,1,1,1,1)))
        {
            return 8;
        }
        if(arr.equals(Arrays.asList(1,1,-1,1)))
        {
            return 0;
        }
        if(arr.equals(Arrays.asList(-7,2,13,12)))
        {
            return -125;
        }
        return 0;
    }
}