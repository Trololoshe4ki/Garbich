class MyException extends Exception {
        public MyException (String s) {
                this.str = s;
        }
        String str;
        public void strPrint () {
                System.out.println(str);
        }
}

public class Print378_8 { 
	public static  void f() {
	throw new MyException("stroka");
        }
        public static void main(String [] args) {
		 try {
                        f();
                } catch (MyException myE) {
                        myE.strPrint();
                }	
	}
}
