package polymorphism;
class Parent{
	public void test() {
		System.out.println("This is the Parent Class");
	}
}
class Child extends Parent{
	public void test() {
		super.test(); //can call parent method
		System.out.println("This is the Child Class");
	}
}
public class MethodOverRiding {
	//in java method overriding occurs when a  subclass (Child class) 
	//has  same method as that of parent
	public static void main(String[] args) {
		Child c= new Child();
		
		c.test();
		
		
		Parent p= new Parent();
		p.test();
		
		
		 Parent p1= new Child();
		
		//this type of initialization is used to access  only the members 
		//present in parent class and methods are  overridden in the child class
		// this is called  up casting
		 p1.test();
	}
}