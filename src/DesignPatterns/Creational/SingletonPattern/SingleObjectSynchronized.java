// Synchronized method

package DesignPatterns.Creational.SingletonPattern;

public class SingleObjectSynchronized {

	private static SingleObjectSynchronized instance;

	private SingleObjectSynchronized() {
	}

	public static SingleObjectSynchronized getInstance() {
		if (instance == null) {
			synchronized (SingleObjectSynchronized.class) {
				if (instance == null) {
					instance = new SingleObjectSynchronized();
				}
			}
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Singleton (Synchronized) object message");
	}
	
	
	

}
