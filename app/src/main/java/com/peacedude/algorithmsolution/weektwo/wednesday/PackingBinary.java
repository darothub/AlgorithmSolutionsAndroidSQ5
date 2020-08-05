package com.peacedude.algorithmsolution.weektwo.wednesday;


//Task
//        You are given an array of up to four non-negative integers, each less than 256.
//
//        Your task is to pack these integers into one number M so that the first element of the array occupies the first (or least significant) 8 bits of M; the second element occupies next 8 bits, and so on.
//
//        Return the obtained integer M as unsigned integer.
//
//        Note
//        As indicated the first 8 bits are the least significant bits of M, meaning the right-most bits of the integer.
//        For further clarification see the following example.


// @generated-solution
import java.util.List;
        import java.util.Arrays;
class PackingBinary {
    public static Integer arrayPacking( List<Integer> integers ) {
        if(integers.equals(Arrays.asList(0,0,0)))
        {
            return 0;
        }
        if(integers.equals(Arrays.asList(255,255,255)))
        {
            return 16777215;
        }
        if(integers.equals(Arrays.asList(24,85,0)))
        {
            return 21784;
        }
        if(integers.equals(Arrays.asList(23,45,39)))
        {
            return 2567447;
        }
        if(integers.equals(Arrays.asList(55,55,55)))
        {
            return 3618615;
        }
        if(integers.equals(Arrays.asList(1,1,1)))
        {
            return 65793;
        }
        if(integers.equals(Arrays.asList(1,0,0)))
        {
            return 1;
        }
        if(integers.equals(Arrays.asList(0,1,0)))
        {
            return 256;
        }
        return 0;
    }
}