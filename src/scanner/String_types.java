package scanner;

public class String_types {
	public static void main(String[] args) {
		//string--is a class
//		String a="Priya";
//		System.out.println(a);
//		System.out.println(System.identityHashCode(a));
//		
//		String b="Priya";
//		System.out.println(b);
//		System.out.println(System.identityHashCode(b));
//		
//		String c="Prabu";
//		System.out.println(c);
//		System.out.println(System.identityHashCode(c));
//		
//		String d="Magashwin"+c;
//		System.out.println(d);
//		System.out.println(System.identityHashCode(d));
//		
		
	//duplicate value--share the memory
	//concordination--create new memory
	//immutable--unchangeable--string
		
		//object creation is compulsory for string builder and string buffer
		
		StringBuilder aBuilder=new StringBuilder("java");
		System.out.println(aBuilder);
		System.out.println(System.identityHashCode(aBuilder));
		StringBuilder bBuilder=new StringBuilder("java");
		System.out.println(bBuilder);
		System.out.println(System.identityHashCode(bBuilder));
		
		StringBuilder c=aBuilder.append(" is a programming language");
		System.out.println(c);
		System.out.println(System.identityHashCode(c));
		//duplicate value--create new memory
		//append--share the memory
		//mutable--changeable--string buffer and builder
		
		
	}

}
