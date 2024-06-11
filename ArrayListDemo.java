import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> employees=new ArrayList<>();
		
		employees.add("Pranesh");
		
		employees.add("Gowtham");
		
		employees.add("Manick");
		
		employees.add("Senthil");
		
		employees.add("Justin");
		
		for(String employees1:employees) {
			
			System.out.println(employees1);
			
			}
		
		for(int i=0;i>employees.size();i++) {
			System.out.println(employees.get(i));
		}

	}

}
