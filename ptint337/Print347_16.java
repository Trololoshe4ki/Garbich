import java.util.*;
public class Print347_16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String scannerString = sc.next();
		Set<Character> scannerword = new TreeSet<Character>();
		Set<Character> simbol = new TreeSet<Character>();
		simbol.add('a');
		simbol.add('b');
		simbol.add('z');	
		simbol.add('s');
		simbol.add('3');
		simbol.add('d');		
		int colichestvo = 0;
		for (char cSimbol : simbol) {
			for (int i = 0; i<scannerString.length(); i++) {
	                        if (cSimbol == scannerString.charAt(i)) {
				colichestvo++;
                		}
			}
		}
		for (int i = 0; i<scannerString.length(); i++) {
			scannerword.add(scannerString.charAt(i));
		}
		System.out.println(colichestvo);
	}
}

	
