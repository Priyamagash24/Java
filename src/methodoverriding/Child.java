package methodoverriding;



public class Child extends Parent{
	
	public void wish() {
		
		super.wish();
		
		System.out.println("i want to become a software tester");
		
		
		
	}
	
	public static void main(String[] args) {
		
		Child aChild=new Child();
		aChild.wish();
	    
	
		
		
		
	

	
		
		
	}

}
