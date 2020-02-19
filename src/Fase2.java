import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Fase2 {

	public static void main(String[] args) {
		//
		char[] name = {'s','1','m','e','b','o','d','y'};
		List<String> name_list = new ArrayList<String>();
		for (char c : name) {
			name_list.add(Character.toString(c));
		}
				
		
		String[] vocals = {"a","e","i","o","u"};
		List<String> vocals_list = Arrays.asList(vocals);
		
		String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
		List<String> numbers_list = Arrays.asList(numbers);
		
		for (String n : name_list) {
			if(numbers_list.contains(n)) {
				System.out.println("Peoples names dont contain numbers!");
			}else {
				
				if(vocals_list.contains(n)) {
					System.out.println(n + " is a Vocal.");
				}else {
					System.out.println(n + " is a Consonant.");
				}
			}
			
		}
		
	}

}
