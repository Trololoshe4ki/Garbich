class MyException extends Exception {
        String str;
        public MyException (String s) {
                this.str = s;
        }
        public String toString  () {
                return(str);
        }
}
class MyException2 extends RuntimeException {
        String str;
        public MyException2 (String s) {
                this.str = s;
        }
        public String toString  () {
                return(str);
        }
}



public class Print386_11 {
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
                                throw new RuntimeException(e1);

                        }
                } catch (RuntimeException e2) {
                        System.out.println("perehvacheno " + e2);
                        for(StackTraceElement ste : e2.getStackTrace()) {
                                        System.out.println(ste);
                        }

                }
        }
}

