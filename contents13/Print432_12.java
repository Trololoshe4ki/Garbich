import java.util.*;
import java.util.regex.*;
public class Print432_12 {
	static public final String POEM =
	"Twas brillig, and the slithy roves\n"+
	"Did gyre and gimble in the wabe\n"+
	"All mimsy were the borogovs,\n"+
	"And the mome raths outgrebe.\n"+
	"Bewaer the Jabberwock, myson,\n"+
	"The jaws that bite, the claws that catch.\n"+
	"Beware the Jubjub bird, and shun\n"+
	"The frumious Bandersnatch.";
	public static void main (String [] args) {
		Matcher m = Pattern.compile("\\s\\p{Lower}\\w+\\p{Punct}?")
			.matcher(POEM);
		LinkedHashSet <String> set = new LinkedHashSet <String> ();
		while(m.find()) {
			for (int j = 0; j <=m.groupCount(); j++)
				set.add(m.group());
			}
		System.out.println(set);
	}
}
