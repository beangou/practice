package com.beangou.day0510;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveOfMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		for(int i = 0; i < 10; i++){
            map.put(i, "value" + i);
        }
		
		Collection<String> values = map.values();
		Iterator<String> valueIterator = values.iterator();
		while(valueIterator.hasNext()) {
			String val = valueIterator.next();
			if("value3".equals(val)) {
				valueIterator.remove();
			}
		}
		
//		testValues(map);
		
		System.out.println(map.size());
		
//		testKeySet(map);
		
		//Set<>
//		testEntrySet(map);
		
//		map.rem
	}

	/**
	 * @param map
	 */
	private static void testValues(Map<Integer, String> map) {
		Collection<String> values = map.values();
		for (String value : values) {
			if("value3".equals(value)) {
				// map remove 方法参数是key
				values.remove(value);
			}
		}
	}

	/**
	 * @param map
	 */
	private static void testKeySet(Map<Integer, String> map) {
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			if(key % 2 == 0) {
				keys.remove(key);
//				map.remove(key);
			}
		}
	}

	/**
	 * @param map
	 */
	private static void testEntrySet(Map<Integer, String> map) {
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			if(entry.getKey() % 2 == 0) {
				map.remove(entry.getKey());
			}
		}
	}

}
