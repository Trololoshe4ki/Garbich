

public class GreenhouseControler {
	public static void main (String [] args) {
		GreenhouseControls gc = new GreenhouseControls();
		System.out.println(1);
		gc.addEvent(gc.new Bell(900));
		System.out.println(200);
		Event[] eventList = {
			gc.new ThermostatNight(0),
			gc.new LightOn(200),
			gc.new LightOff(400),
			gc.new WaterOn(600),
			gc.new WaterOff(800),
			gc.new ThermostatDay(1400)
		};
		System.out.println(3);
		gc.addEvent(gc.new Restart(200, eventList));
		System.out.println(4);
		if(args.length == 1)
			gc.addEvent(
				new GreenhouseControls.Terminate(
					new Integer(args[0])));
		System.out.println(5);
		gc.run();
		System.out.println(6);
	}
}
