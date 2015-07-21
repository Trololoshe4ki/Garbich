import java.util.*;

class InfiniteRecursion {
	public String toString () {
		return "InfiniteRecursion: " + super.toString() + "\n";
	}
}		
public class Pritn420_2 {
	 public static void main (String [] atgs ) {
                List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
                for (int i = 0; i<10; i++)
                        v.add(new InfiniteRecursion());
                System.out.println(v);
        }
}
