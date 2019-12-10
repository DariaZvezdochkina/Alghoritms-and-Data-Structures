package com.company;

import java.util.Hashtable;

public class App {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(8);
        hashTable.put("Hello");
        hashTable.put("Hello1");
        hashTable.put("Hello2");
        hashTable.put("Hello3");
        hashTable.put("Hello3");
        hashTable.put("Hello4");

        //find
        System.out.println("FIND");
        System.out.println(hashTable.search("Hello1" ));
        System.out.println(hashTable.search("Hello"));


    }
}
