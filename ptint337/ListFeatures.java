//import typeinfo.pets.*;
import java.util.*;

public class ListFeatures {
	static class Pets {
		ArrayList<Integer>  arrayList () {
			ArrayList<Integer> outArrayList = new  ArrayList<Integer>();
			Collections.addAll(outArrayList, 1, 2, 3, 4, 5, 6, 7);
			return outArrayList;
		}
	}
			
	public static void main (String[] args) {
		Pets ololo = new Pets();
		Random rand = new Random(47);
		List<Integer> pets = ololo.arrayList();
		System.out.println("1: " + pets);
		Integer h =101;
		pets.add(h); 
		System.out.println("2: " + pets);
		System.out.println("3: " + pets.contains(h));
		pets.remove(h);
		Integer p = pets.get(2);
		System.out.println("4: " + p + " " + pets.indexOf(p));
		Integer cymric = 202;
		System.out.println("5: " + pets.indexOf(cymric));
		System.out.println("6: " + pets.remove(cymric));
		System.out.println("7: " + pets.remove(p));
		System.out.println("8: " + pets);
		pets.add(3, 303);
		System.out.println("9: " + pets);
		List<Integer> sub = pets.subList(1, 4);
		System.out.println("10: " + pets.containsAll(sub));
		Collections.sort(sub);
		System.out.println("Posle sortirovki: " + sub);
		System.out.println("11: " + pets.containsAll(sub));
		Collections.shuffle(sub, rand);
		System.out.println("Posle peremeshivaniya: " + sub);
		System.out.println("12: " + pets.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(pets);
		sub = Arrays.asList(pets.get(1), pets.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<Integer>(pets);
		copy.remove(2);
		System.out.println("14: " + copy);
		copy.removeAll(sub);
		System.out.println("15: " + copy);
		copy.set(1, 404);
		System.out.println("16: " + copy);
		copy.addAll(2, sub);
		System.out.println("17: " + copy);
		System.out.println("18: " + pets.isEmpty());
		pets.clear();
		System.out.println("19: " + pets);
		System.out.println("20: " + pets.isEmpty());
//		pets.addAll();
//		System.out.pritnln("21: " + pets);
		//Object[] o = pets.toArray();
	//	System.out.println("22: " + o[1]);
		
//		Integer[] pa = pets.toArray(Integer[0]);
//		System.out.println("23: " + pa[3].id());
	}
}
		
