package ClassObject1;

public class ClassObject1 {
	
	int x=30;
	int y=40;

	public static void main(String[] args) {

		ClassObject1 obj1 = new ClassObject1();
		obj1.sum();
		System.out.println("x attribute value is"+obj1.x);
		System.out.println("x attribute value is"+obj1.y);
		
	}
	
	public void sum()
	{
		int a =10;
		int b=20;
		int c=a+b;
		System.out.println("Sum of behaviour attribute is "+c);
	}
}