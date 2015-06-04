public class Print373_1 {
	public static void  main(String[] args) {
		try {
			throw new Exception("sss");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("ololo");
		}
	}
}
