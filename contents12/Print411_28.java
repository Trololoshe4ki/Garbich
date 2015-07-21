class MyException extends RuntimeException {
	public MyException (String s) {
		this.str = s;
	}
	String str;
	public void strPrint () {
		System.out.println(str);
	}
}
	
public class Print411_28 {
	public static void main(String [] args) {
//		try {
			throw new MyException("stroka");
//		} catch (MyException myE) {
//			myE.strPrint();
//		}
	}
}
		
