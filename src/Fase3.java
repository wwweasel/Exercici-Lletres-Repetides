import java.util.*;
public class Fase3 {

	public static void main(String[] args) {
		//
		char[] name = {'s','o','m','e','b','o','d','y'};
		List<String> name_list = new ArrayList<String>();
		for (char c : name) {name_list.add(Character.toString(c));}
		
		HashMap<String,Integer> letters = new HashMap<String,Integer>();
		
		for (String n : name_list) {
			if(letters.containsKey(n)) {
				int tmp = letters.get(n);
				tmp = tmp + 1;
				letters.put(n, tmp);
			}else {
				letters.put(n, 1);
			}
			
		}
		
		System.out.println(letters);
		
	}

}
