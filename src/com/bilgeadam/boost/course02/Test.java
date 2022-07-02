package com.bilgeadam.boost.course02;

import java.util.ArrayList;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		badCache();
		goodCache();
		bestCache();
		someClass();
	}

	private static void someClass() {
		SomeClass<String, Integer, MyBeautifulCache> some = new SomeClass<>("Babür", 55, "black");
		
	}

	private static void bestCache() {
		MyMostBeautifulCache<String, Integer> stringKeycache = new MyMostBeautifulCache<>();
		MyMostBeautifulCache<Integer, String> integerKeycache = new MyMostBeautifulCache<>();
		
		integerKeycache.addToCache(1, "Birinci"); 
		stringKeycache.addToCache("Birinci", 5);
		
//		cache.addToCache(Boolean.TRUE, new ArrayList<>()); bu tür öğeler eklenemez
		
		for (Entry<String, Integer> entry : stringKeycache.listCacheContents()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		int x = stringKeycache.getFromCache("Birinci"); 
		System.out.println(++x);
//		if (obj instanceof Integer) {   buna ihtiyaç kalmadı
//			int x = (Integer)obj;
//			System.out.println(++x);
//		}
	}	
	
	private static void goodCache() {
		MyBeautifulCache cache = new MyBeautifulCache();
//		cache.addToCache(1, "Birinci"); bu tür öğeler eklenemez
		cache.addToCache("Birinci", 5);
//		cache.addToCache(Boolean.TRUE, new ArrayList<>()); bu tür öğeler eklenemez
		
		for (Entry<String, Integer> entry : cache.listCacheContents()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		int x = cache.getFromCache("Birinci"); 
		System.out.println(++x);
//		if (obj instanceof Integer) {   buna ihtiyaç kalmadı
//			int x = (Integer)obj;
//			System.out.println(++x);
//		}
	}	
	
	private static void badCache() {
		MyCache cache = new MyCache();
		cache.addToCache(1, "Birinci");
		cache.addToCache("Birinci", 5);
		cache.addToCache(Boolean.TRUE, new ArrayList<>());
		
		for (Entry<Object, Object> entry : cache.listCacheContents()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
//		int x = cache.getFromCache("Birinci"); // hata verir obje <==> integer mismatch
		Object obj = cache.getFromCache("Birinci");
		if (obj instanceof Integer) {
			int x = (Integer)obj;
			System.out.println(++x);
		}
	}
}
