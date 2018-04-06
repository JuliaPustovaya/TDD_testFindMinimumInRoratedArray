package training.SingleTon;

public class LAZY {
	private static LAZY instance;

	public static synchronized LAZY getInstance() {
		if (instance == null) {
			instance = new LAZY();
		}
		return instance;
	}
}