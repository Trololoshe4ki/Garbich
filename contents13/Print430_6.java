class A {
	String s = "ololo";
	long l = 2;
	float f = 3.44f;
	double d = 55;
	public String toString() {
		return String.format(" int = %33.2s long = %d%n float = %f%n double = %f%n", s, l, f, d);
	}
}
public class Print430_6 {
	public static void main (String [] args) {
		A a = new A();
		System.out.println(a);
	}
}
