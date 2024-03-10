package ncTestScripts;

public class MethodsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsEx m1 = new MethodsEx();
		String name = m1.getData();
		System.out.println(name);
		MethodsEx2 m2 = new MethodsEx2();
		String name2 = m2.getUserData();
		System.out.println(name2);
	}

	public String getData()
	{
		System.out.println("Hello world");
		return "Sajini Shaik";
	}
	
	
	
}
