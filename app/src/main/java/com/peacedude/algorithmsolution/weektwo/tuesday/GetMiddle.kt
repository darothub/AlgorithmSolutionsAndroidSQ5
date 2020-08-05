package com.peacedude.algorithmsolution.weektwo.tuesday

fun getMiddle(word: String): String {
    val n = word.length
    return word.substring(n / 2 - (n + 1) % 2, n / 2 + 1)
}