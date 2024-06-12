public class PrimenumberCheck {
	
	public static boolean isprime(int num) {
		if (num==1){
		return false;
		}
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;

}
	
	public static void main(String args[]) {
		int begin=10;
		int end=100;
		
		System.out.println("The prime numbers between:"+begin+"and"+end);
		
		for(int i=begin;i<=end;i++) {
			if(isprime(i)) {
				System.out.println(i);
			}
		}
			
	}
	}
