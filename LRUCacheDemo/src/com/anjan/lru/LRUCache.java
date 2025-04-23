package com.anjan.lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This class is implementation for LRU Cache
 * @author Anjan Arun Bhowmick
 *
 * @param <K>
 * @param <V>
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int capacity;
	
	public LRUCache() {
		super();
		this.capacity = 3;
	}
	
	public LRUCache(int capacity) {
		super(capacity, 0.75f, true);
		this.capacity = capacity;
	}

	@Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > this.capacity;
    }
}
