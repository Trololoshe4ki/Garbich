import java.util.*;


public class Print373_5 {
	public static void main (String [] args) {
		List<String> listS = new ArrayList<String> ();
		int i = 0 ;
		while (i  == 0 ) {
			System.out.println("Массив: " + listS);
			try {
				System.out.println(listS.get(5));
				i = 1; 
			} catch (IndexOutOfBoundsException err) {
				listS.add("ololo");
				i = 0;
			}
		}	
	}
}
