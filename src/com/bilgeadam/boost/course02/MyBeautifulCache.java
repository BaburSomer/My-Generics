package com.bilgeadam.boost.course02;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MyBeautifulCache {
	private HashMap<String, Integer> objects;  
	
	public void addToCache(String key, int value) {
		this.getObjects().put(key, value);
	}

	public int getFromCache(String key) {
		return this.getObjects().get(key);
	}
	
	public Set<Entry<String, Integer>> listCacheContents () {
		return this.getObjects().entrySet();
	}

	private HashMap<String, Integer> getObjects() {
		if (this.objects == null)
			this.objects = new HashMap<>();
		return this.objects;
	}
}
