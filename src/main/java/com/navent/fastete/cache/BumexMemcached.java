package com.navent.fastete.cache;


public class BumexMemcached {

	private static BumexMemcached instance;
	
	private BumexMemcached() {
	}
	
	public static BumexMemcached getInstance() {
		if(null == instance) {
			instance = new BumexMemcached();
		}
		
		return instance;
	}
	
	public void set(String key, Object value) {
		
	}
	
	public Object get(String key) {
		return null;
	}
	
	public void delete(String key) {
		
	}
}
