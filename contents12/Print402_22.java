import java.util.*;
class Trololo {
	ArrayList <String> olo = new ArrayList <String> ();
}
class FailingConstructor {
	public FailingConstructor (ArrayList al) {
		System.out.println(al.get(2));
	}
}
public class Print402_22 {
	public static void main (String [] args) {
		Trololo t = new Trololo();
		try {
			FailingConstructor fc = new FailingConstructor(t.olo);
		} catch (Exception e) { 
			System.out.println ("Произошла ошибка " + e );
		}
	}
}
