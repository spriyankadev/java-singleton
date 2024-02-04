
public class SingletonDoubleCheck {

	private static SingletonDoubleCheck instance = null;

	private SingletonDoubleCheck() {
	}

	public static SingletonDoubleCheck getInstance() {
		//t3
		if (instance == null) {
			//t1, t2
			synchronized (SingletonDoubleCheck.class) {
				if (instance == null) {
					instance = new SingletonDoubleCheck();
				}
			}
		}
		return instance;
	}

	public void print() {
		System.out.println("Singleton Double Check method called!");
	}

}
