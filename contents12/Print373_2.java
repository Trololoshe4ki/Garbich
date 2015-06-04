public class Print373_2 {
	public static void main(String[] args) {
		Object ob = new Object();
		ob = null;
		try {
			ob.toString();
		} catch (NullPointerException npe) {
			System.out.println (npe);
		}
	}
}
	
