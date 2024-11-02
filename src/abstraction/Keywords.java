package abstraction;

public final class Keywords {
	public void nothing() {
		System.out.println("Hi I am Priya");
		
	}
	public String name() {
		return "Prabu";
		
	}
	public int b() {
		return 10;
		
	}
	public boolean c() {
		return true;
		
	}
	
	public static void main(String[] args) {
		Keywords aKeywords=new Keywords();
		aKeywords.nothing();
		
		String name=aKeywords.name();
		System.out.println(name);
		
		int b=aKeywords.b();
		System.out.println(b);
		
		boolean c=aKeywords.c();
		System.out.println(c);
	}
	

}
