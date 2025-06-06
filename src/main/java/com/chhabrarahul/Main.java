package com.chhabrarahul;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // TODO: It uses the implementation of hashtable, Hashing is used to store values inside the hashtable
        Set<Integer> hashSet = new HashSet<Integer>();

        // TODO: It uses the implementation of Red Black Tree, which is a self balancing binary search tree
        Set<Integer> treeSet = new TreeSet<>();

        // TODO: It uses the implementation of Binary Search Tree
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        // TODO: hashset
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(10);
        hashSet.add(3);
        hashSet.add(20);
        System.out.println(hashSet);

        // TODO: treeSet
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(3);

        System.out.println(treeSet);


        // TODO: linkedHashSet
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(4);
        linkedHashSet.add(3);

        System.out.println(linkedHashSet);


        // TODO: check if set contains particular value or not
        if(hashSet.contains(1)) {
            System.out.println("Contains");
        }
        else {
            System.out.println("Not Contains");
        }

        String name = "anagram";

        Set<Character> myset = new HashSet<>();

        for(int index = 0; index < name.length(); index++) {
            if(myset.contains(name.charAt(index))) {
                System.out.println("Repeating Character " + name.charAt(index));
            }
            myset.add(name.charAt(index));
        }
    }
}