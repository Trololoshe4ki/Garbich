public class FullError {
	public Destination dest (String s) {
		class PDestination implements Destination { 
			private String label;
			private PDestination (String whereTo) {
				label = whereTo;
			}
			public String readLabel () {
				return label;}
		}
		System.out.println(s);
		return new PDestination(s);
	}
	public static void main (String[] args) {
		FullError p = new FullError ();
		Destination d = p.dest("Tasmania");
		p.dest("Tasmania2");
	}
}
