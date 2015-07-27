public class Print432_9 {
	public static void main (String [] args) {
		String s =
			 "Then, when you have found the shrubbery, you must" +
			 "cut down the mightiest tree in the forest ..." +
			"with... a herring!";
	System.out.println(s.replaceAll("a|o|y|u|","_"));
	}
}
