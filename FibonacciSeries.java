import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonnacciSeriesJava {
	
	private static int n2;

	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n1=0;
		int n2=1;
		
		System.out.println("Enter the count of numbers:");
		
		int count=Integer.parseInt(br.readLine());
		
		System.out.println(n1+""+n2+"");
		
		for(int i=2;i<count;i++) {
			
			int n3=n1+n2;
			
			System.out.println(n3);
			
			n1=n2;
			n2=n3;
			}
	}

}
