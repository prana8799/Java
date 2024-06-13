import java.util.Arrays;

public class JavaBubbleSort {

	public static void main(String[] args) {
		
		int[] values= {1,7,2,8,0,8,7};
		
		int n=values.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;i++) {
				if(values[j]>values[j+1]) {
					
					int temp=values[j];
					values[j]=values[j+1];
					values[j+1]=temp;
					
					
					
					
				}
			}
		}
		
		System.out.println(Arrays.toString(values));

	}

}
