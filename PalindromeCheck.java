import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeCheck {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the text:");
		
		String text=br.readLine();

		   StringBuilder sb=new StringBuilder(text);
		   
		   sb.toString();
		   
		   String reversedtext=sb.reverse().toString();
		   
		   System.out.println(text);
		   
		   System.out.println(reversedtext);
		   
		   if(text.equalsIgnoreCase(reversedtext)) {
			   System.out.println("The entered string is palindrome");
		   }
		   
		   else
			   System.out.println("The entered string is not a palindrome");

	}

}
