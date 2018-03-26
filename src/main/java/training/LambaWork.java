package training;
  /*
     1) Functional interface with ONLY ONE abstract method +plenty of defaults methods;
     2) There are a lot of lambda realizations for 1 method;
     3) Class variable can be read/changed. if the are used in lambdas they should be declared static;
     4) Method variables can be read/ Not changed. if the are used in lambdas they should be declared final
     5) Functional interface also can be Generic

   */

public class LambaWork {
	static int A = 10;
	static int B = 90;

	public static void main(String args[]) {
		int a = 800;
		int b = 900;
		InterfaceTemp interfaceTempClassMethods;
		InterfaceTemp interfaceTempLOcalVariables;
		InterfaceGeneric<Double> interfaceGenericDouble;
		InterfaceGeneric<Integer> integerInterfaceGenericInteger = (s, y) -> s * y;
		interfaceTempClassMethods = () -> {
			B = B + A;
			return B;
		};
		interfaceTempLOcalVariables = () -> b * a;
		interfaceGenericDouble = (x, y) -> {
			System.out.println("It's work generic interface " + (x + y));
			return x + y;
		};
		System.out.println(interfaceTempClassMethods.getMathOperation());
		System.out.println(interfaceTempLOcalVariables.getMathOperation());
		interfaceGenericDouble.getMathOperation(15.7, 16.7);
		integerInterfaceGenericInteger.getMathOperation(12, 13);
	}
}
