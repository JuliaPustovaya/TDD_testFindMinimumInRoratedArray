package training.Stream;

/*
Локальный класс без имени. Наследует какой-то класс, или имплиментирует какой-то интерфейс.
Из него видны:
— все (даже private) свойства и методы OuterClassа обычные и статические.
— public и protected свойства и методы родителя OuterClassа обычные и статические. То есть те, которые видны в OuterClassе.

Его видно:
— только в том методе где он определён.

Не может быть наследован

Может содержать:
— только обычные свойства и методы (не статические).

 */
public class InnerClassMain {
	public static void main(String[] args) {
		Person person = new Person();
		person.printInform("basic maethod");
		Person mobile = new Person() {
			@Override
			public void printInform(String s) {
				System.out.println(s);
			}
		};
		mobile.printInform("extended class method");
		PersonInterface personInterface = new PersonInterface() {
			@Override
			public void printStatus() {
				System.out.println("implemented interface");
			}
		};
		personInterface.printStatus();
		// using lambda instead of anonumus class;
		PersonInterface personInterface1 = () -> System.out.println("Bla-bla");
		personInterface1.printStatus();
	}
}

interface PersonInterface {
	void printStatus();
}

class Person {

	String name;

	int year;

	public Person() {
	}

	public void printInform(String text) {
		System.out.println(text);
	}
}