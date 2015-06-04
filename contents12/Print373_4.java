class MyException extends Exception {
	public MyException (String s) {
		this.str = s;
	}
	String str;
	public void strPrint () {
		System.out.println(str);
	}
}
	
public class Print373_4 {
	public static void main(String [] args) {
		try {
			throw new MyException("stroka");
		} catch (MyException myE) {
			myE.strPrint();
		}
	}
}
		
