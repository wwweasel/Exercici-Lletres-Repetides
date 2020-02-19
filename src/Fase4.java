import java.util.*;

public class Fase4 {

	public static void main(String[] args) {
		// 
		//char[] name = {'a','p','e','l','l','i','d','o'};
		List<String> apellido = Arrays.asList("s","u","r","n","a","m","e");
		List<String> name = Arrays.asList("n","a","m","e");
		List<String> fullname = new ArrayList<String>();
		
		fullname.addAll(0,name);
		fullname.add(fullname.size()," ");
		fullname.addAll(fullname.size(),apellido);
		
		System.out.println(fullname);
	}

}
