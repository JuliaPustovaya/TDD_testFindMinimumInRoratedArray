package training.SingleTon;

public class ONDEMAND {

	public static class SingletonHolder {
		public static final ONDEMAND HOLDER_INSTANCE = new ONDEMAND();
	}

	public static ONDEMAND getInstance() {
		return SingletonHolder.HOLDER_INSTANCE;
	}
}