package Handson;
import java.util.Scanner;
class Calculator{
	//stores two numbers
	double num1,num2;
	Calculator(double num1, double num2){
		//this acts as a reference variable
		this.num1=num1;
		this.num2=num2;
	}
		//add function to perform Addition operation
		double add() {
			return num1 + num2;
		}
		//subtract function to perform subtraction operation
		double subtract() {
			return num1 - num2;
		}
		//multiply function to perform multiplication operation
		double multiply() {
			return num1 * num2;
		}
		//division function to perform division operation
		double division() {
			return num1/num2;
		}
	}
public class ArithmeticCalculator {
	public static void main(String[] args) {
		//Takes user input
		Scanner input = new Scanner(System.in);
		while(true) {
		//Asks first input
		System.out.println("Enter the First number: ");
		double num1 = input.nextDouble();
		//Asks second input
		System.out.println("Enter the Second number");
		double num2 = input.nextDouble();
		Calculator calc= new Calculator(num1,num2);
		double result=0;
		//Asks the operator 
		System.out.println("Enter the operator (+,-,*,/): ");
		String operator = input.next();
		switch(operator)
		{
		case "+" :result=calc.add();
				  break;
		case "-" :result=calc.subtract();
				  break;
		case "*" :result=calc.multiply();
				  break;
		case "/" :result=calc.division();
				  break;
		default:System.out.println("Invalid Operation");
				break;
		}
		//Provides output
		System.out.println(num1+operator+num2+"="+result);
	}
	}
}
