package training.Lambda;

@FunctionalInterface
public interface InterfaceTemp {
	default public int getDefaultMathOpereation(int a, int b) {
		return a / b;
	}

	//public int getMathOperatiom(int a, int b);
	public int getMathOperation();
}
