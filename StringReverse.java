public class StringReverse {

	public static void main(String[] args) {
		
		String name="Pranesh";
		
		StringBuilder builder=new StringBuilder(name);
		
		builder.toString();
		
		String reversedname=builder.reverse().toString();
		
		System.out.println("The original name is:" +name);
		
		System.out.println("The reversed name is:" +reversedname);

	}

}
