package abstraction;

public class Inter_class implements Interface_1,Interface_2,Interface_3 {
	@Override
	public void method_4() {
		// TODO Auto-generated method stub
	System.out.println("this is method 4");	
	}

	@Override
	public void method_3() {
		// TODO Auto-generated method stub
		System.out.println("this is method 3");
	}

	@Override
	public void method_1() {
		// TODO Auto-generated method stub
	System.out.println("this is method 1");	
	}

	@Override
	public void method_2() {
		// TODO Auto-generated method stub
		System.out.println("this is method 2");
	}

	public static void main(String[] args) {
		
		Inter_class aclass=new Inter_class();
		aclass.method_1();
		aclass.method_2();
		aclass.method_3();
		aclass.method_4();
	}

	
}
