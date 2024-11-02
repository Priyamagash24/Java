package collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;


public class Map_collection { 
	public static void main(String[] args) {
		//MAP-->5 types-->1.hashmap 2.linked hashmap 3.treemap 4.hash table 5.concurrent hashmap
		//syntax:Map<key,value> refname=new types of map<key,value>();
		Map<String,Integer> a=new TreeMap<String,Integer>();
		a.put("chocolate",50);
		a.put("null", 40);
		a.put("boost", 56);
		a.put("rice", null);
		a.put("sauce", 30);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.get("boost"));//it prints the value
		System.out.println(a.keySet());
		System.out.println(a.values());
		boolean b= a.containsKey("rice");
		System.out.println(b);
		boolean c = a.containsValue(70);
		System.out.println(c);
		
		
		
		
	}
	


}
