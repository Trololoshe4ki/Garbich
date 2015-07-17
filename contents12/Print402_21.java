class MyException extends Exception {
	public MyException(String s) {
		System.out.println (s);
	}
}
class MyFirstClass {
	public MyFirstClass () 	throws MyException {
	throw new  MyException("Trololo");
	 }
}
class MySecondClass extends MyFirstClass {
	public MySecondClass () throws MyException {}

	public void p () {
	System.out.println ("SecondClass");
	}
}

public class Print402_21 {
	public static void main (String[] main) {
		try {
			MyFirstClass m2c = new MySecondClass();
		} catch (MyException e) {
			System.out.println (e);
		}
	}
}			
		
