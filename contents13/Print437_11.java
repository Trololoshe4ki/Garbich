import java.util.regex.*;


public class Print437_11 {
	public static void main (String [] args) {
		Pattern p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
		Matcher m = p.matcher("Arline ate eight apples and one orange while Anita hadn't any");
		System.out.println(m.matches());
	}
}
