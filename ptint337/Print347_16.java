import java.util.*;
public class Print347_16 {
	public static void main(String[] args) {
//		System.out.println(simbol);
		Scanner sc = new Scanner(System.in);
		String scannerString = sc.next();
		Set<Character> scannerword = new TreeSet<Character>();
		Map<Character,Integer> simbol = new HashMap<Character,Integer>();
		simbol.put('a',0);
		simbol.put('b',0);
		simbol.put('z',0);	
		simbol.put('s',0);
		simbol.put('3',0);
		simbol.put('d',0);		
//		int colichestvo = 0;
//		List<Character> scannerStringList = new ArrayList<Character>(Arrays.asList(scannerString.toCharArray()));
		for (int i = 0; i < scannerString.length(); i++) {
			char cScannerString = scannerString.charAt(i);
			for (char cSimbol : simbol.keySet()) {
				if (cScannerString == cSimbol) {
				int valueSimbol = simbol.get(cSimbol);
				valueSimbol++;
				simbol.put(cSimbol, valueSimbol);
				}
			}
		}
	System.out.println(simbol);
	}
}



/*

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
*/


	
