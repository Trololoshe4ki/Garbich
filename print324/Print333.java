import java.util.*;
	
class Generator {
	int numberPerson = -1 ;
	ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Иван", "Владимир", "Костя", "Николай", "Пётр"));
	 String next() { 
		 if (numberPerson ==  namesList.size()-1)
			numberPerson = -1;
		numberPerson++;
		return namesList.get(numberPerson);
	}
}
public class Print333 {
	public static void  main (String[] args) {
		Generator Gen = new Generator();
		Collection<String>  a = new ArrayList<String>();
		Collection<String>  b = new LinkedList<String>();
		Collection<String>  c = new HashSet<String>();
		Collection<String>  d = new LinkedHashSet<String>();
		String e[] = new String[5];
		for (int i = 0; i < Gen.namesList.size(); i++){
			e[i] = Gen.next();	
		}
		for (int i = 0; i < Gen.namesList.size(); i++){
			a.add(Gen.next());
		}
		for (int i = 0; i < Gen.namesList.size(); i++){
			b.add(Gen.next());
		}
		for (int i = 0; i < Gen.namesList.size(); i++){
			c.add(Gen.next());
		}
		for (int i = 0; i < Gen.namesList.size(); i++){
			d.add(Gen.next());
		}
		System.out.println(Gen.namesList);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		for (int i = 0; i < e.length; i++)
			System.out.println(e[i]);
	}
}
