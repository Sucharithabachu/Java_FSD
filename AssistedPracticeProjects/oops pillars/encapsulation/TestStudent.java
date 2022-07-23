package encapsulation;


public class TestStudent {
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Cherry");
		s1.setEmail("cherry@gmail.com");
		s1.setPassword("936358");
		s1.setMobile("9876598453");
		s1.setDivision("A");
		s1.setStd("12");
		
		System.out.println(s1);
		System.out.println("Id: "+s1.getId()+"\nName: "+s1.getName()+"\nEmail: "+s1.getEmail()+"\nPassword:"+s1.getPassword()+"\nMobile:"+s1.getMobile()+"\nStd:"+s1.getStd()+"\nDivision:"+s1.getDivision());
		 
		//employee class with string method
		
		Employee e1= new Employee();
		e1.setId(1);
		e1.setName("Cherry");
		e1.setEmail("cherry@gmail.com");
		e1.setPassword("1936358");
		e1.setMobile("9876598453");
		e1.setDesignation("Financial Advisor");
		
		System.out.println(e1);
	}

}