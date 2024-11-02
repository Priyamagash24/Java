package abstraction;

public class Action extends Abs_1{
	@Override
	public void method_1() {
		// TODO Auto-generated method stub
		System.out.println("this is abstract method");
	}
		
	
	public static void main(String[] args) {
		Action refAction=new Action();
		refAction.method_1();
		refAction.method_2();
		
	}
	

}
