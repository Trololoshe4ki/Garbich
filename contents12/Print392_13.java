class MyException1 extends Exception {
        public String toString () {
                return("MyException1");
        }
}
class MyException2 extends Exception {
        public String toString () {
                return("MyException2");
        }

}
class MyException3 extends Exception {
        public String toString () {
                return("MyException3");
        }

}
public class Print392_13 {
        public static void f1() throws MyException1 {
                throw new MyException1();
//              throw new MyException2();
//              throw new MyException3();
        }
        public static void f2() throws MyException2 {
//                throw new MyException1();
              throw new MyException2();
//              throw new MyException3();
        }
        public static void f3() throws MyException3 {
//                throw new MyException1();
//              throw new MyException2();
              throw new MyException3();
        }
        public static void main (String [] args) {
                for (int i = 0; i <=  3; i++) {
                        try  {
				throw new NullPointerException ();
/*                                if (i == 0) {
/                                f1();
                                } else if (i == 1)  {
                                f2();
                                } else {
                                f3();
                                }
*/                        } catch (Exception e) {
                                System.out.println(e);
			} finally {
				System.out.println("finally ");
			
                        }
                }
        }
}


