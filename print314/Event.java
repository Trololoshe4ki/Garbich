//: home/user/java/Garbich/print314/Event.java
//package garbich.print314;
//import garbich.print314.*;
public abstract class Event {
	private long eventTime;
	protected final long delayTime;
	public Event(long delayTime) {
		this.delayTime = delayTime;
		start();
	}
	public void start () {
		eventTime = System.nanoTime() + delayTime;
	}
	public boolean ready() {
		return System.nanoTime() >= eventTime;
	}
	public abstract void action ();
}

