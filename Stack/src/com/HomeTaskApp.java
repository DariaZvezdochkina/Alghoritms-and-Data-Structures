package com;

public class HomeTaskApp {
    public static void main(String[] args) {
        StackChar stackChar = new StackChar(6);
        stackChar.Push('h');
        stackChar.Push('e');
        stackChar.Push('l');
        stackChar.Push('l');
        stackChar.Push('o');

        while (!stackChar.isEmpty()) {
            char value = stackChar.pop();
            System.out.println(value);
        }

        //System.out.println(reverseString("Hello"));


    }

    /*public static String reverseString (String str) {
        int stackSize = str.length();
        StackChar stackChar = new StackChar(stackSize);
        for (int j=0; j<str.length(); j++) {
            char ch = str.charAt(j);
            stackChar.Push(ch);
        }
        String result ="";
        while (!stackChar.isEmpty()) {
            char ch = stackChar.pop();
            result = result + ch;
        }

        return result;
    }*/
}
