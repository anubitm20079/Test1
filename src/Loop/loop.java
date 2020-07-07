package Loop;

public class loop {

	public static void main(String[] args) {
		// for loop
		
		for(int i=1;i<20;i++)
		{
			System.out.println("Value for FOR loop " +i);
		}
		
		//while
		
		int count=10;
		while(count<20)
		{
			System.out.println("While loop value is " +count );
			count++;
		}

		// do while
		
		int Ticket = 100;
		
		do {
			System.out.println("Do While value is" + Ticket );
			Ticket++;
		}while (Ticket<102);
	}

}
