import java.util.Date;

public class LabA {
	public static void main(String[] args) {
		// Eager Singleton
		EagerSingleton e = EagerSingleton.getInstance();
		e.print();

		// break lazy loading
//		Runnable task = () -> {
//			LazySingleton singleton = LazySingleton.getInstance();
//			System.out.println("Thread: " + Thread.currentThread().getName() + ", Singleton: " + singleton);
//		};
//
		int numberOfThreads = 50;
//
//		for (int i = 1; i <= numberOfThreads; i++) {
//			Thread thread = new Thread(task);
//			thread.start();
//		}
		Date start1 = new Date();
//		// break lazy loading
		Runnable task1 = () -> {
			SigletonMultithread singleton = SigletonMultithread.getInstance();
			System.out.println("Thread: " + Thread.currentThread().getName() + ", SigletonMultithread: " + singleton);
		};
		Date end1 = new Date();

		for (int i = 1; i <= numberOfThreads; i++) {
			Thread thread = new Thread(task1);
			thread.start();
		}
		System.out.println("Time 1 : "+(end1.getTime() - start1.getTime())+" ms.");
		
		// break lazy loading
		Runnable task2 = () -> {
			SigletonMultithread singleton = SigletonMultithread.getInstance();
			System.out.println("Thread: " + Thread.currentThread().getName() + ", SigletonMultithread: " + singleton);
		};
		Date start = new Date();
		
		for (int i = 1; i <= numberOfThreads; i++) {
			Thread thread = new Thread(task2);
			thread.start();
		}
		Date end = new Date();
		
		System.out.println("Time 2 : "+(end.getTime() - start.getTime())+" ms.");

	}
}
