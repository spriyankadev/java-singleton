
//Thread safe singleton
public class SigletonMultithread {

	
	private static SigletonMultithread instance = null;

	private SigletonMultithread() {
	}

	public static synchronized SigletonMultithread getInstance() {
		if (instance == null) {
			instance = new SigletonMultithread();
		}
		return instance;
	}

	public void print() {
		System.out.println("Lazy Singleton method called!");
	}
}
