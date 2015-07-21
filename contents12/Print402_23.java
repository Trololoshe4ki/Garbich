import java.util.*;
class Trololo {
	ArrayList <String> olo = new ArrayList <String> ();
}
class Trololo2 {
	int number;
	public Trololo2 (int number) {
		this.number = number;
		System.out.print("i'm LIFE");
	}
	public void dispose () {
		System.out.println("dispose " + number);
	}
}
class FailingConstructor {
	Trololo2 t2_1;
	Trololo2 t2_2;
	public FailingConstructor (ArrayList al) {
		this.t2_1 = new Trololo2 (1);
		System.out.println(al.get(2));
		this.t2_2 = new Trololo2 (2);
	}
}
public class Print402_23 {
	public static void main (String [] args) {
		Trololo t = new Trololo();
		FailingConstructor fc =null;
		int i = 0;
		while (i == 0) {
		
			try {
				fc = new FailingConstructor(t.olo);
				i = 1;
				fc.t2_1.dispose();
				fc.t2_2.dispose();
				
			} catch (IndexOutOfBoundsException e) { 
				System.out.println ("Произошла ошибка " + e );
				t.olo.add("add");
				if (fc != null) {
					fc.t2_1.dispose();
				}
			} finally {
				
			}
		}	
	}
}

