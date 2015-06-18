class Switch {
        private boolean state = false;
        public boolean read () {return state; }
        public void on() {
                throw new RuntimeException();
		//state =true; System.out.println(this);
}
        public void off() {state = false; System.out.println(this);}
        public String toString() {return state ? "oNN" : "OFF" ; }
}

class OnOffException1 extends Exception {}
class OnOffException2 extends Exception {}
public class PRint392_15 {
        private static Switch sw = new Switch();
        public static void f()
        throws OnOffException1, OnOffException2 {}
        public static void main (String [] args) {
                try {
                        sw.on();
                        f();
                        sw.off();
//                      throw new RuntimeException();
                } catch (OnOffException1 e) {
                        System.out.println("OnOffException1");
                } catch (OnOffException2 e) {
                        System.out.println("OnOffException2");
                }finally {
			System.out.println("finally");
		
        	}

	}
}
