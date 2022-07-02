package com.bilgeadam.boost.course02;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MyCache {
	private HashMap<Object, Object> objects;  // raw type olarak kullanım ile aynı. Hani Hashmap'e hiç veri türü vermemekle
	//private HashMap objects;
	public void addToCache(Object key, Object value) {
		this.getObjects().put(key, value);
	}

	public Object getFromCache(Object key) {
		return this.getObjects().get(key);
	}
	
	public Set<Entry<Object, Object>> listCacheContents () {
		return this.getObjects().entrySet();
	}

	private HashMap<Object, Object> getObjects() {
		if (this.objects == null)
			this.objects = new HashMap<>();
		return this.objects;
	}
}
