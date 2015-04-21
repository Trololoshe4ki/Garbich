public class GreenhouseControls extends Controller {
	private boolean light = false;
	public class LightOn extends Event {
		public LightOn(long delayTime) { 
			super(delayTime); 
			System.out.println("LightOn");
		}
		public void action () {
			light = true;
		}
		public String toString() {return "Svet On";}
	}
	public class LightOff extends Event {
		public LightOff(long delayTime) {super(delayTime);}
		public void action () { 
			light = false;
		}
		public String toString() {return "Svet Off";} 
	}
	private boolean water = false;
	public class WaterOn extends Event {
		public WaterOn(long delayTime) {super(delayTime);}
		public void action () {
			water = true;
		}
		public String toString() {
			return "Poliv ON";
		}
	}
	public class WaterOff extends Event {
		public WaterOff(long delayTime) { super(delayTime);}
		public void action () {
			water = false;
		}
		public String toString() {
			return "Poliv off";
		}
	}
	private String thermostat = "Day";
	public class ThermostatNight extends Event {
		public ThermostatNight(long delayTime) {
			super(delayTime);
		}
		public void action() {
		thermostat = "Nighat";
		}
		public String toString() {
			return "Thermostat Night";
		}
	}
	public class ThermostatDay extends Event {
		public ThermostatDay (long delayTime) {
			super (delayTime);
		}
		public void action () {
			thermostat = "Day";
		}
		public String toString () {
			return "Thermostat Day";
		}
	}
	public class Bell extends Event {
		public Bell (long delayTime) {super(delayTime);}
		public void action () {
			addEvent(new Bell(delayTime));
		}
		public String toString() {return "Balllll!!!!!!11111";}
	}
	public class Restart extends Event {
		private Event [] eventList;
		public Restart(long delayTime, Event[] eventList) {
			super (delayTime);
			this.eventList = eventList;
			for (Event e : eventList)
				addEvent(e);
		}
		public void action() {
			for (Event e : eventList) {
				e.start();
				addEvent(e);
			}
			start(); 
			addEvent(this);
		}
		public String toString() {
			return "Restart System";
		}
	}
	public static class Terminate extends Event {
		public Terminate(long delayTime) {super(delayTime);}
		public void action() {System.exit(0); }
		public String toString() {return "Off";}
	}
	public static void main(String args[]) {
		GreenhouseControls gc = new GreenhouseControls();
	GreenhouseControls.Bell b = gc.new Bell(9);
		System.out.println(b.toString());
	}	
		
}
	
