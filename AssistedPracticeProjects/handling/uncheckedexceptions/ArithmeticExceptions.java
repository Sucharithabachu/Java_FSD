package uncheckedexceptions;

import java.util.Scanner;

//runtime  : Arithmetic Exception
public class ArithmeticExceptions {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		
		int num1=  sc.nextInt();
		int num2= sc.nextInt();
		
		int divide=  num1/num2; //risky code: 
		
		System.out.println("Division is: "+divide);
		
		System.out.println("End of Program");
		
		
	}

}