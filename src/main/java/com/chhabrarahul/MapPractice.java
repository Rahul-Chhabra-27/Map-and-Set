package com.chhabrarahul;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class MapPractice {

    public static boolean checkForAnagram(String A,String B) {

        Map<Character,Integer> freA = new HashMap<>();

        int valueA = freA.get('a');
        for(int index = 0; index < A.length(); index++) {
            if(!freA.containsKey(A.charAt(index))) {
                freA.put(A.charAt(index),1);
            }
            else {
                freA.put(A.charAt(index),freA.get(A.charAt(index)) + 1);
            }
        }
        for(int index = 0; index < B.length(); index++) {
            if(!freA.containsKey(B.charAt(index))) {
                return false;
            }
            else {
                freA.put(B.charAt(index),freA.get(B.charAt(index)) - 1);
            }
        }
        AtomicBoolean allZeros = new AtomicBoolean(true);
        freA.forEach((key,value) -> {
            System.out.println(key +  " " + value);
            if(value != 0) allZeros.set(false);
        });
        return allZeros.get();
    }
    public static void main(String[] args) {

        System.out.println(checkForAnagram("anagram","aanrgma"));
        // TODO: HashMap
        Map<String,Integer> hasMap = new HashMap<String,Integer>();

        // TODO: TreeMap
        Map<String,Integer> treeMap = new HashMap<String,Integer>();

        // TODO: LinkedHashMap
        Map<String,Integer> linkedHashMap = new HashMap<String,Integer>();
    }
}
