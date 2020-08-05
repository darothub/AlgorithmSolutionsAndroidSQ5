package com.peacedude.algorithmsolution.weektwo.tuesday

//Task
//
//You are given an array (which will have a length of at least 3, but could be very large)
//containing integers. The array is either entirely comprised of odd integers or entirely comprised
//of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

fun find(integers: Array<Int>): Int {
    val (a, b, c) = integers
    val startRem = Math.abs(a) % 2
    if (startRem != Math.abs(b) % 2 && startRem != Math.abs(c) % 2) {
        return a
    }
    var i = 1
    while (true) {
        if (startRem != Math.abs(integers[i]) % 2) {
            return integers[i]
        }
        i++
    }
}