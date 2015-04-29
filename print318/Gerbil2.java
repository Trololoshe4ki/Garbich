import java.util.*;
class Gerbil {
	int gerbilNumber;
	void hop () {
		System.out.println(gerbilNumber);
	}
}
public class Gerbil2 {
	public static void main (String args []) {
		ArrayList <Gerbil> gerbilList = new ArrayList <Gerbil> ();
		for (int i = 0; i <= 5; i++) {
			gerbilList.add(new Gerbil());
		}
		for (Gerbil g: gerbilList) {
			g.hop();
		}
		System.out.println("11");
		}
	}

