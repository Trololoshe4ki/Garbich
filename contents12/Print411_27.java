import java.util.*;

public class Print411_27 {
	public static void main (String [] args) {
		ArrayList<String> arrayString = new ArrayList<String> ();
		try {
			arrayString.get(1);
		} catch (IndexOutOfBoundsException ioobe) {
			throw new RuntimeException(ioobe);
		}	
	}
}	
