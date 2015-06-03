import java.util.*;

class Command {
	String commandString;
	Command (String s) {
	this.commandString = s;
	}
	public void operation () {
		System.out.println(commandString);
	}
}
class Zapolnenie {
	Queue <Command> forZapolnenie = new LinkedList <Command> ();
	public void zapolnit () {
		forZapolnenie.offer(new Command("listen"));
		forZapolnenie.offer(new Command("jump"));
		forZapolnenie.offer(new Command("slow"));
		forZapolnenie.offer(new Command("prised"));
		System.out.println("обект очередь в классе заполнение заполнена" + forZapolnenie);
	}
}
public class Print352_27 {
	public static void main (String[] args) {
		Zapolnenie zapolnenieClass = new Zapolnenie();
		zapolnenieClass.zapolnit();
		for (Command c: zapolnenieClass.forZapolnenie) {
			c.operation();
		}
	}
}
	
		
