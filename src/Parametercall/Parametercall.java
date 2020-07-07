package Parametercall;

import Parameterclass1.Parameterclass1;

public class Parametercall {

	public static void main(String[] args) {
	
		Parameterclass1 obj9= new Parameterclass1();
		int z =	obj9.summa(1, 2);
		System.out.println(z);
		
		String myname = Parameterclass1.fullname("Anupam ", "Banerjee");
				System.out.println(myname);
	}

}
