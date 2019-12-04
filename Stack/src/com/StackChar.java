package com;

public class StackChar {

    int maxSizeOfArray;
    char[] stackArray2;
    int top;

    public StackChar(int size) {
        this.maxSizeOfArray = size;
        this.stackArray2 = new char[size];
        this.top = -1;
    }

    public void Push(char k) {
        if (isFull()) {
            System.out.println("this is already full");
        } else {
            top++;
            stackArray2[top] = k;
        }

    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("tis is already empty");
            return '0';
        } else {
            int oldTop = top;
            top--;
            return stackArray2[oldTop];
        }

    }

    public char peak() {
        return stackArray2[top];
    }

    public boolean isFull(){
        return (maxSizeOfArray-1==top);
    }

    public boolean isEmpty() {
        return (top== -1);
    }
}


