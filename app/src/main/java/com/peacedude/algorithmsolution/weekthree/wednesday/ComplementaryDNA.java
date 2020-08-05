package com.peacedude.algorithmsolution.weekthree.wednesday;
//Task
//        You have function with one side of the DNA, you need to get the other complementary side.
//        The DNA strand may be empty if there is no DNA at all. In this case, you can simple return the empty string.


import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;
import java.util.stream.*;

class ComplementaryDNA {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static String dnaComplement(String dna) {
        HashMap<Character, Character> pairs = new HashMap<Character, Character>();
        pairs.put('C', 'G');
        pairs.put('G', 'C');
        pairs.put('A', 'T');
        pairs.put('T', 'A');
        return dna.chars()
                .mapToObj(i -> (char)i)
                .map(pairs::get)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}