package com.anjan.lru;

public class MainClass {
	
	public static void main(String args[]) {
		
		LRUCache<String, String> lru = new LRUCache<String, String>(3);
		System.out.println("Initial LRU Cache :: "+lru);
	
		lru.put("a", "1");
		lru.put("b", "2");
		lru.put("c", "3");
		lru.put("d", "4");
		System.out.println("LRU Cache :: "+lru);
		
		lru.get("c");
		System.out.println("LRU Cache After Access :: "+lru);
		
		lru.put("e", "5");
		System.out.println("LRU Cache After Insertion :: "+lru);
	}

}
