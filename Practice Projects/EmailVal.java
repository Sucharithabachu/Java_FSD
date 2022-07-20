package EmailValidation;
import java.util.LinkedHashSet;
import java.util.*;
import java.util.regex.*;
public class EmailVal {
	public static void main(String[] args) {
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		lh.add("abc.efg@xyz.com");
		lh.add("asdfgh@xyz.com");
		lh.add("vamsi@xyz.com");
		lh.add("ramu@mno.com");
		lh.add("somu@mno.com");
		lh.add("shyamu@mno.com");
		lh.add(null);
		while(true) {
		System.out.println("Enter the Email Address: ");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		String email = "^(.+)@(.+)$"; 
		Pattern pat = Pattern.compile(email);
		Matcher mat = pat.matcher(str);
		
		if(mat.matches())
		{
			if(lh.contains(str))
			{
				System.out.println("the entered Email Id '"+str+"' is found");
			}
			else
			{
				System.out.println("the entered Email Id '"+str+ "' is not found\nPlease register the email address");
			}
		}
		else
		{
			System.out.println("Please enter a valid email address");
		}
		
	}
	}
}