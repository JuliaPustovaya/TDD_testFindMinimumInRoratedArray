package training.Patterns;

/*creational pattern   https://www.journaldev.com/1425/builder-design-pattern-in-java

in JDK :
    java.lang.StringBuilder#append() (unsynchronized)
    java.lang.StringBuffer#append() (synchronized)

Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object
step-by-step and provide a method that will actually return the final Object.

  1)  First of all you need to create a static nested class and then copy all the arguments from the outer class to the Builder class. We
  should follow the naming convention and if the class name is Computer then builder class should be named as ComputerBuilder.
  2) Java Builder class should have a public constructor with all the required attributes as parameters.
  3) Java Builder class should have methods to set the optional parameters and it should return the same Builder object after setting the
   optional attribute.
  4) The final step is to provide a build() method in the builder class that will return the Object needed by client program. For this we
   need to have a private constructor in the Class with Builder class as argument.

  */
class Computer {

	//required parameters
	private String HDD;
	private String RAM;

	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	//Builder Class
	public static class ComputerBuilder {

		// required parameters
		private String HDD;
		private String RAM;

		// optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}
}

public class BuilderMainClass {
	public static void main(String[] args) {
		Computer comp = new Computer.ComputerBuilder(
				"500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
	}
}
