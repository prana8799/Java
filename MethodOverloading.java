public class Overloading1 {
	
	public static void main(int a, int b) {
		
		System.out.println(a);
		
	}
	
	public void add(int m, int n) {
		
		System.out.println(m+n);
	}
	
	
	public void sub(int p, int q) {
		
		System.out.println(q-p);
	}
	
	
	public void mul(int c, int d) {
		
		System.out.println(c*d);
	}
	
	
	public void div(int x, int y) {
		
		System.out.println(y/x);
	}
	
	
}


public class Overloading2 {

	public static void main(String[] args) {

          Overloading1 over=new Overloading1();
          
          over.add(8, 7);
          
          over.sub(18, 17);
          
          over.mul(13, 92);
          
          over.div(15, 2);
	}

}
