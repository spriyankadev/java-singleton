
public class EagerSingleton {

	// 1. private constructor to restrict initialization of object
	private EagerSingleton() {
	}

	private static EagerSingleton INSTANCE = null;

	// 2. private static variable only instance of this class
//	private static final EagerSingleton instance = new EagerSingleton();

	static {
		try {
			INSTANCE = new EagerSingleton();
		} catch (Exception e) {
			System.out.println("Exception while creating singleton object");
		}
	}

	// 3. public static method so that outer world/or any class can get the instance
	// of the class with class name
	public static EagerSingleton getInstance() {
//		return instance;
		return INSTANCE;
	}

	public void print() {
		System.out.println("Eager Singleton class print method called!");
	}

}
