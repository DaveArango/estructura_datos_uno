// src/main/java/edu/uniquindio/co/ejercicio12_lrucache/LRUCache.java
package edu.uniquindio.co.ejercicio13_cachelrumini;

import java.util.LinkedHashMap;
import java.util.Map;
/**
 * Implementation of cache LRU (Least Recently Used) using LinkedHashMap.
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private final int capacity; //n entries 

    //constructor
    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
        
    }

    @Override 
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity; //if return true remove of eldest xd, if return false don't remove anything
                                  //Si retorna true borra el elemento mas viejo del cache, si retorna falso no borra nada           

    }
}
