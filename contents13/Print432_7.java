class ChekString {
	String s = "Trololo zakonchil tchk.";
}
public class Print432_7 {
	public static void main (String [] args) {
		ChekString cs = new ChekString ();
		System.out.println(cs.s.matches("\\p{Upper}.+\\."));
	}
}
