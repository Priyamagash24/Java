package casting;

public class Child extends Parent{
	public void name() {
		super.name();
		System.out.println("this is child class");
		
	}
	public static void main(String[] args) {
		Parent aParent=new Child(); //parent---reference , memory--child--upcasting
		aParent.name();
		
		//child--reference , memory--parent
		
		//child bchild=new parent();----downcasting is impossible
	}
	
		
	

}
