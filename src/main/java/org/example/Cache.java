package org.example;

import java.util.*;

public class Cache {

    Set<Integer> cache = new LinkedHashSet<>();

    int capacity;

    public Cache(int capacity) {
        this.capacity = capacity;
    }

    public boolean get(int element){

        if(!cache.contains(element))
            return false;
        cache.remove(element);
        cache.add(element);

        return true;
    }

    public void put(int element) {

        if(!get(element)) {
            if(cache.size() == capacity){
                int leastRecentlyUsed = cache.iterator().next();
                cache.remove(leastRecentlyUsed);
            }
            cache.add(element);
        }
    }

    public void printCache() {
        LinkedList<Integer> list = new LinkedList<>(cache);

        for(int i =0; i<list.size();++i) {
            System.out.println(list.get(i));
        }
    }




    private static Cache instance = null;

    private Cache() {

    }

    public static Cache getInstance() {

        if(instance == null) {
            synchronized (Cache.instance) {
                if(instance == null)
                    instance = new Cache();
            }
        }
        return instance;
    }

    public void getVowels(String data) {
        Map<Character, Integer> vowelMap = new HashMap<>();
        data = data.toLowerCase();
        for(int i=0; i<data.length();++i) {
            if(data.charAt(i) == 'a' || data.charAt(i) == 'e' || data.charAt(i) == 'i' || data.charAt(i) == 'o' || data.charAt(i) == 'u') {
                if (vowelMap.containsKey(data.charAt(i)))
                    vowelMap.put(data.charAt(i), vowelMap.get(data.charAt(i)) + 1);
                vowelMap.put(data.charAt(i), 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : vowelMap.entrySet()) {
            System.out.println("Vowel " + entry.getKey() + " count : " + entry.getValue());
        }
    }
























}
