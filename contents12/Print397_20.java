class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
	public Inning () throws BaseballException {}
	public void event () throws BaseballException {
	//фактически возбуждать исключение не нужно
	}
	public abstract void atBat() throws Strike, Foul;
	public void walk() {} 
	// Не возбуждает контролируемых исключений 
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
	public void event () throws RainedOut;
	public void rainHard () throws RainedOut;
}

public class Print397_20 extends Inning implements Storm {
	//можно добавлять новые исключиня для конструкторов, но вы должны обрабатывать и исключения базового конструктор:
	public Print397_20 ()
		throws RainedOut, BaseballException {}
	public Print397_20 (String s )
		throws Foul, BaseballException {}
	/* обычные методы должны соответствовать правилам базового класса:
	! void walk () throws PopFoul {} 
	Интерфейс не может добавлять исключения к сузествующим методам базового класса 
	! public void event () throws RainedOut {}
	Если метод не был определён в базовом классе, исключения допускаеся:
	*/
	public void rainHard() throws RainedOut {}
	//Вы можете не возбуждать исключений вообще, даже если базовая весия это делает :
	public void event () {}
	//Переопределенённые метооды могут возбуждать унаследованные исключения:
	public void atBat() throws PopFoul {}
	public static void main (String [] args) {
		try {
			Print397_20 si = new Print397_20();
			si.atBat();
			} catch(PopFoul e) {
				System.out.println (" Pop foul");
			} catch (RainedOut e) {
				System.out.println (" Rained out");
			} catch (BaseballException e) {
				System.out.println ("Generic baseball exception");
			}
			// Stike не возбуждается в унаследованной версиию
			try {
			// Что произойдёт при восходящем преобразовании ?
				Inning i = new Print397_20();
				i.atBat();
				//Вы долджны перехватывать исключеня из базовой версии метода :
			} catch (Strike e) {
				System.out.println("Strike");
			} catch (Foul e) {
				System.out.println("Foul");
			} catch (RainedOut e) {
				System.out.println("Rained out");
			} catch  (BaseballException e) {
				System.out.println ("Общее исключение");
			}
		}
	}

	

