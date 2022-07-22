package Synchronization;

public class TestSynchronization {
	
	public static void main(String[] args) {
		
		Sender sender = new  Sender();
		
		User t1= new User("Cherry", "Hello Good morning....!", sender);
		User t2= new User("Suchi","Hii!! how  are you?",sender);
		
		t1.start();
		t2.start();
	}

}