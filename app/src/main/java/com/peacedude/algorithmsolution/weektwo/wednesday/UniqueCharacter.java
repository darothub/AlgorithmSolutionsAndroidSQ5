package com.peacedude.algorithmsolution.weektwo.wednesday;

//        Task
//        Write a program to determine if a string contains all unique characters.
//        Return True/true if it does and False/false otherwise.
//
//        The string may contain any of the 128 ASCII characters.

class UniqueCharacter {
    public static boolean hasUniqueChars(String str) {
        java.util.HashSet<Character> seen = new java.util.HashSet<>();

        for (char c : str.toCharArray()) seen.add(c);

        return str.length() == seen.size();
    }
}