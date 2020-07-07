package conditionalStatement;

public class conditionalStatement {
	public static void main(String[] args) {
		//if-else statement
		int a=90;
		if(a<80)
		{
			System.out.println("if condition value is "+a);
		}
		
		else
		{
		System.out.println("else value is "+a);
		}
		
		String browser="chrome";
		if (browser.equalsIgnoreCase("firefox"))
		{
			System.out.println("Executed on"+browser);
			
		}
		else
		{
			System.out.println("Executed on "+browser);
		}
		
		//nested if else
		
		String bw="ie";
		if(bw.equalsIgnoreCase("chrome"))
		{
			System.out.println("Nested if else "+bw);
		}
		else if(bw.equalsIgnoreCase("firefox"))
		{
			System.out.println("Nested if else "+bw);
		}
		else 
		{
			System.out.println("Nested if else "+bw);
		}
		
		//Switch statement
		
		int x=60;
		switch(x)
		{
		case 10:
			System.out.println("X value is"+x);
			break;
		case 20:
			System.out.println("X value is"+x);
			break;
		case 30:
			System.out.println("X value is"+x);
			break;
			
			default:
			System.out.println("default value is Null");
		
		
		
		}
		
	}
}
