package Handson;
import java.util.Scanner;
public class Calc {
	public static void main(String[] args) {
		
		Scanner input_number1=new Scanner(System.in);
		Scanner input_number2=new Scanner(System.in);
		Scanner input_operator=new Scanner(System.in);
		double number1,number2;
		String op;
		while(true) {
			//Asks first input
			System.out.println("Enter the First number: ");
			number1 = input_number1.nextDouble();
			//Asks second input
			System.out.println("Enter the Second number");
			number2 = input_number2.nextDouble();
			System.out.println("Enter the operator (+,-,*,/): ");
			op = input_operator.next();
			if (op.equals("+")) {
				System.out.println(number1+number2);
			}
			else if(op.equals("-")) {
				System.out.println( number1 - number2 );
			}
			else if(op.equals("*")) {
				System.out.println(number1*number2);
			}
			else if(op.equals("/")) {
				System.out.println(number1/number2);
			}
		}
	}
}





