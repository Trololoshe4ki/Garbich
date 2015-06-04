import java.util.*;

public class Print373_3 {
	public static void main (String [] args) {
		ArrayList<String> arrayString = new ArrayList<String> ();
		try {
			arrayString.get(1);
		} catch (IndexOutOfBoundsException ioobe) {
			System.out.println("массив слишком мал для вашего запроса");
	
		}	
	}
}	
