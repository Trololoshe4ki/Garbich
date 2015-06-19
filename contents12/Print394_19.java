class VeryImportantException extends Exception {
        public String toString () {
                return "Ochen vajnoe Isklychenie!";
        }
}
class HoHumException extends Exception {
        public String toString() {
                return "Vtoroe Iskl";
        }
}
class ThreeException extends Exception {
        public String toString () {
                return "Tretee Iskl";
        }
}

public class Print394_19 {
        void f() throws VeryImportantException {
                throw new VeryImportantException();
        }
        void dispose() throws HoHumException {
                throw new HoHumException();
        }
        void d() throws ThreeException {
                throw new ThreeException();
        }
        public static void main (String[] args) {
                try {
                        Print394_19 lm = new Print394_19();
                        try {
                                try {
                                        lm.f();
                                        } finally {
                                        lm.dispose();
                                        }
	                      } catch (Exception e) {
	      		      System.out.println(e);
                        } finally {
                                System.out.println ("ololol");
                         lm.d();
                        }
                } catch (Exception e) {
                        System.out.println(e);
                }

        }
}

