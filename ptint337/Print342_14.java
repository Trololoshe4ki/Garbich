import java.util.*;

public class Print342_14 {
	public static void main (String[] args) {
		List<Integer> list = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,1,1));
		ListIterator<Integer> iterList = list.listIterator();
		System.out.println(list);
		list.add(list.size() / 2, 666);
		System.out.println(list);
		list.add(list.size() / 2, 666);
		System.out.println(list);
		list.add(list.size() / 2, 666);
		System.out.println(list);
		list.add(list.size() / 2, 666);
		System.out.println(list);

	}
}
