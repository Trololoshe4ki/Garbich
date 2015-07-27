import java.util.regex.*;

public class Print437_10 {
	public static void main (String [] args) {
		String [] masString = {"^Java", "\\Breg.+", "n.w\\s+h(a|i)s", "s?", "s*","s+","s{4}","s{1}","s{0,3}"};
		String s = "Java now has regular expressions";
		for (String reg : masString) {
			Pattern p = Pattern.compile(reg);
			Matcher m = p.matcher(s);
			System.out.println("matches: " + m.find());
		}
		System.out.println("test: " + s.matches(".+"));	
		System.out.println("test2: " + s.matches("^Java"));	
	}
}
