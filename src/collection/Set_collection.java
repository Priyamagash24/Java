package collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Set_collection {
	public static void main(String[] args) {
		//set-->3 types--->1.hash set 2.linked hash set 3.tree set
		//syntax: set<wrapper class> refname=new types of set<wrapper class>();
		Set a=new HashSet();
		a.add("apple");
		a.add("mango");
		a.add("mango");
		a.add("pineapple");
		System.out.println(a);
		Set b=new HashSet();
		b.add("Priya");
		b.add(null);
		System.out.println(b);
		a.addAll(b)	;
		System.out.println(a);
		System.out.println(a.size());	
		System.out.println(a.contains("mango"));
		a.retainAll(b);
		System.out.println(a);
		a.removeAll(b);
		System.out.println(a);
		
		
		
	}

}
