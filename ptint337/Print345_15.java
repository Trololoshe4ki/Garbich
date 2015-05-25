import java.util.LinkedList;
class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	public void push(T v) {storage.addFirst(v); }
	public T peek() {return storage.getFirst(); }
	public T pop() {return storage.removeFirst(); }
	public boolean empty() {return storage.isEmpty(); }
	public String toString() {return storage.toString(); }
}

public class Print345_15 {
		public static void main (String[] args) {
		Stack <Character> stack = new Stack <Character> ();
		String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
			for(int i = 0; i < str.length(); i++) {
				System.out.println(stack);
				if (str.charAt(i) == (str.charAt(0))) {
					i++;
					stack.push(str.charAt(i));
					System.out.println("add"+ str.charAt(i));
				} else if(str.charAt(i) == (str.charAt(7))) {
					System.out.println("ololo");
					System.out.println(stack.peek());
					stack.pop();
				} else  {
				}
			}
			System.out.println(stack);
		}
}	
