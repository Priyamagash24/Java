package collection;


import java.util.LinkedList;


public class List_collection {
	public static void main(String[] args) {
		//collection-->2 types-->1.list 2.set
		//1.list-->3 types-->1.Arraylist 2.linked list 3.vector list
		//syntax: list<wrapper class> refname=new types of list<wrapper class>();
	LinkedList a=new LinkedList();
		a.add(30);
		a.add(10);
		a.add(15);
		System.out.println(a);
	LinkedList b=new LinkedList();
		b.add("Priya");
		b.add("Priya");
		System.out.println(b);
	a.addAll(b)	;
	System.out.println(a);
	System.out.println(a.size());	
	System.out.println(a.get(3));
	System.out.println(a.remove(2));
	a.set(1, 20);
	System.out.println(a);
	int i = a.indexOf("Prabu");
	System.out.println(i);
	System.out.println(a.contains(30));
	a.retainAll(b);
	System.out.println(a);
	a.removeAll(b);
	System.out.println(a);
		
	}

}
