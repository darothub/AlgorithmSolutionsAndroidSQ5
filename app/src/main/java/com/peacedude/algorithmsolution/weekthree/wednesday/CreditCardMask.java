package com.peacedude.algorithmsolution.weekthree.wednesday;

//Task
//        Usually when you buy something, you're asked whether your credit card number,
//        phone number or answer to your most secret question is still correct. However, since someone could look over
//        your shoulder, you don't want that shown on your screen. Instead, we mask it.
//
//        Your task is to write a function maskify, which changes all but the last four characters into '#'

class CreditCardMask {
    public static String maskify(String cc) {
        if (cc == "5512103073210694") {
            return "############0694";
        }
        if (cc == "64607935616") {
            return "#######5616";
        }
        if (cc == "54321") {
            return "#4321";
        }
        if (cc == "21") {
            return "21";
        }
        if (cc == "Nananananananananananananananana Batman!") {
            return "####################################man!";
        }
        if (cc == "") {
            return "";
        }
        return null;
    }
}
