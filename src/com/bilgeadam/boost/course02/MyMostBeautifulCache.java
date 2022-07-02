package com.bilgeadam.boost.course02;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MyMostBeautifulCache<K, V> {
	
	private HashMap<K, V> objects;  
	
	public void addToCache(K key, V value) {
		this.getObjects().put(key, value);
	}

	public V getFromCache(K key) {
		return this.getObjects().get(key);
	}
	
	public Set<Entry<K, V>> listCacheContents () {
		return this.getObjects().entrySet();
	}

	private HashMap<K, V> getObjects() {
		if (this.objects == null)
			this.objects = new HashMap<>();
		return this.objects;
	}
}
