class MyException extends Exception {
        String str;
	public MyException (String s) {
                this.str = s;
        }
        public String toString  () {
                return(str);
        }
}
class MyException2 extends Exception {
        String str;
        public MyException2 (String s) {
                this.str = s;
        }
        public String toString  () {
                return(str);
        }
}



public class Print386_10 {
	public void f() throws MyException {
		throw new MyException("vizov iz f()");
	}
	public void g() throws MyException {
		f();
	}
	public static void main (String [] args) {
	 Print386_10 test = new Print386_10();
		try {
			try{
				test.g();
			} catch (MyException e1) {
				System.out.println("Perehvacheno " + e1);
				for(StackTraceElement ste : e1.getStackTrace()) {
					System.out.println(ste);
				}
				throw new MyException2("vizov iz catch");
			
			}
		} catch (MyException2 e2) {
			System.out.println("perehvacheno " + e2);
			for(StackTraceElement ste : e2.getStackTrace()) {
                                        System.out.println(ste);
                	}
		
		}
	}
}
				
