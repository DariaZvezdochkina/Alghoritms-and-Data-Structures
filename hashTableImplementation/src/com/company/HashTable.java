package com.company;

public class HashTable {
    String [] array;
    int size = 0; //counter for numbers of elements in hashTable
    int arraySize;

    public HashTable (int numberOfSlots) {
        if (numberIsPrime(numberOfSlots)) {
            array = new String[numberOfSlots];
            arraySize = numberOfSlots;
        } else {
            int primeCount = getNextNumberIsPrime(numberOfSlots);
            array = new String[primeCount];
            arraySize = primeCount;

            System.out.println("Hash table size given " + numberOfSlots + " is not a prime");
            System.out.println("Hash Table size change to: " + primeCount);

        }
    }

    public boolean numberIsPrime(int number) {
        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

    public int getNextNumberIsPrime(int minNumber) {
        for (int i = minNumber; true; i++) {
            if (numberIsPrime(i)) {
                return i;
            }
        }
    }

    public int function1(String word) {
        int hashVal = word.hashCode();
        hashVal = hashVal % arraySize;
        if (hashVal < 0) {
            hashVal += arraySize;
        }
        return hashVal;
    }

    public int function2(String word) {
        int hashVal = word.hashCode();
        hashVal %= arraySize;
        if (hashVal < 0) {
            hashVal += arraySize;
        }
        return 1 - hashVal % 1;
    }

    public void put(String word) {
        int hashVal = function2(word);
        int stepSize = function1(word);

        while (array[hashVal] != null) {
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arraySize;
        }
        array[hashVal] = word;
        System.out.println("Inserted word " + word);
    }

    public String search (String word) {
        int hashVal = function1(word);
        int stepSize = function2(word);
        while (array[hashVal] != null) {
            if (array[hashVal].equals(word)) {
                return array[hashVal];
            }
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arraySize;
        }
        return array[hashVal];
    }

}
