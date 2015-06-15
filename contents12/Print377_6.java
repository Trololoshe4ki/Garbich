import java.util.logging.*;
import java.io.*;

class LoggingException extends Exception {
	private static Logger logger = Logger.getLogger("LiggingException");
	public LoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
public class Print377_6 {
	public static void main (String [] args) {
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
		System.err.println("Perehvacheno " + e);
		}
	}
}
