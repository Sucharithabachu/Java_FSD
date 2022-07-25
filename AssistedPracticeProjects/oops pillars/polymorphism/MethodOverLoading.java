package polymorphism;


public class MethodOverLoading {
	public int sum(int x,int y) {
		return x+y;
	}
	public int sum(int x,int y,int z) {
		return x+y+z;
	}
	public static void main(String[] args) {
		MethodOverLoading m=new MethodOverLoading();
		System.out.println("sum: "+m.sum(5,7));
		System.out.println("sum: "+m.sum(5,7,9));
	}


}
