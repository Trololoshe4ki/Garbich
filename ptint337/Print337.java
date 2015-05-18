import java.util.*;

public class Print337 {
	Print337 () {
		System.out.println ("This is LIFE");
	}


	public static void main (String[] args) {

		Print337[] massPrint337 = {new Print337(), new Print337(), new Print337(), new Print337(), new Print337()};
		System.out.println(massPrint337);
		
		ArrayList<Print337> countListPrint337 = new ArrayList<Print337> (Arrays.asList(massPrint337));
		System.out.println ("Лист"+countListPrint337);

		List <Print337> subCountPrint337 = countListPrint337.subList(1,4);
		System.out.println ("подмножество листа"+subCountPrint337);
		countListPrint337.removeAll(subCountPrint337);
		System.out.println ("удаление подмножества листа"+countListPrint337);
		System.out.println (countListPrint337);
	}
}	
