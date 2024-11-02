package constructor;

public class Super_market {
	public Super_market() {
		System.out.println("product 1");
		
	}
	public Super_market(String a) {
		this();
		System.out.println("product name:"+a);
		
	}
	public Super_market(int b) {
		
		this("chocolate");
		
		System.out.println("product price:"+b);
	}	
	
	public static void main(String[] args) {
		Super_market aSuper_market=new Super_market(100);
		
	}

}
