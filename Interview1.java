public class Interview1 {
	public static void main (String [] args) {
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("Ezzy");
			} else if (i % 5 == 0 && i % 3 != 0) { 
				System.out.println("Fezzy");
			} else if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("EzzyFezzy");
			} else {
				System.out.println(i);
			}
		}
	}
}
