import java.util.*;
public class Print341_11 {
	public static void main (String[] args) {
		ArrayList<Integer> list1 = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8));
		ArrayList<Integer> list2 = new ArrayList(Arrays.asList(11,22,33,44,55,66,77,88));
		ListIterator<Integer> intList1 = list1.listIterator();
		ListIterator<Integer> intList2 = list2.listIterator(list2.size());
		System.out.println(list1);
		System.out.println(list2);		

		while (intList1.hasNext() & intList2.hasPrevious()) {
		intList2.previous();	
//		intList1.next();	
		intList2.set(intList1.next());
//		intList2.previous();
//		for (int i=0; i <= list1.size(); i++) {
	 	//	while (intList1.hasNext()) {
//			System.out.println();
			System.out.println(list2);
			
		//		list2.set(intList1.next());
		//	}
		}
		System.out.println(list1);
                System.out.println(list2);

	}
}
			

