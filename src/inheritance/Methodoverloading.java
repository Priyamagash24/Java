package inheritance;

public class Methodoverloading {
	public void method_1() {
		System.out.println("there is no parameter");
	}
	public void method_1(int a) {
		System.out.println(a);
		
	}
	public void method_1(String b) {
		System.out.println(b);
		
	}	
public void method_1(int c,int d) {
	System.out.println(c+d);
	
}
public void method_1(boolean e) {
	System.out.println(e);
}
public void method_1(int f,String g) {
	
	System.out.println(f+g);
	
}		
public static void main(String[] args) {
	Methodoverloading ref=new Methodoverloading();
			
	ref.method_1(3);
	ref.method_1("Priya");
	ref.method_1(4, 5);
	ref.method_1(true);
	ref.method_1(6,"Prabu");
	ref.method_1();
}	

}
