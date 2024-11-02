package looping;

public class Types_Of_Variables {
	int i=5;
	String d="priya";
	static int r=30;
	public static void main(String[] args) {
		int i=10;
		System.out.println("Local Variable:"+" "+i);
		Types_Of_Variables ref_of_variable=new Types_Of_Variables();
		System.out.println("Instance Variable:"+" "+ref_of_variable.i);
		System.out.println("Instance Variable:"+" "+ref_of_variable.d);
		System.out.println("Static Variable:"+" "+r );
	//	System.out.println("Static Variable:"+" "+ref_of_variable.r);
	//	System.out.println("Static Variable:"+" "+Types_Of_Variables.r);
	}

}
