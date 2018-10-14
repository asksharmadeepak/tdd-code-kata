package map;

public class MyHashMap<K,V> {

	private int size=0;
	private Entry[] entryArray;
	
	
	public MyHashMap(int length) {
		// TODO Auto-generated constructor stub
		entryArray=new Entry[length];
	}
	public MyHashMap() {
		// TODO Auto-generated constructor stub
		
		this.entryArray=new Entry[16];
	}
	public int size() {
		return size;
	}
	
	public V put(K key, V value) {
		Entry<K,V> entry=new Entry<K,V>(key,value);
		entryArray[size]=entry;
		size++;
		return value;
	}
	
	class Entry<K,V>{
		K key;
		V value;
		public Entry(K key, V value) {
			super();
			this.key = key;
			this.value = value;
		}
		
	
		
	}

}
