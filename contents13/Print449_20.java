public class Print449_20 {
	int i;
	long l;
	float f;
	double d;
	String s;
	Print449_20 (String str) {
		String[] test = str.split(" ");
		i = Integer.parseInt(test[0]);
		l = Long.parseLong(test[1]);
		f = Float.parseFloat(test[2]);
		d = Double.parseDouble(test[3]);
		s = test[4];
	}
	public String  toString() {
		System.out.format("double %d%n long %d%n float %f%n double %f%n String %s", i, l, f, d, s);
		return ("vot i vse rebyata");
	}
	public static void main (String [] args) {
		Print449_20 p = new Print449_20("23 3989879879879987987 1.899797 9 sobaken");
		System.out.println(p);
	}
}

	
	
