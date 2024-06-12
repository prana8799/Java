public class Array {

	public static void main(String[] args) {
		
		String[][] array=new String[3][2];
		array[0][0]="Pranesh";
		array[0][1]="Bala";
		array[1][0]="Murugan";
		
		for(String[] arr:array) {
			for(String str:arr) {
				if(str!=null)
			System.out.println(arr);
		}
		
			System.out.println();
	}

}
}
