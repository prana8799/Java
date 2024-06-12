public class SwapNumbersWithTemp {

	public static void main(String[] args) {
		
		int a=8;
		int b=18;
		
		System.out.println("The value of 'a' before swapping:" +a);
		System.out.println("The value of 'b' before swapping:" +b);
		
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The value of 'a' after swapping:"+a);
		System.out.println("The value of 'b' after swapping:"+b);

	}


}
