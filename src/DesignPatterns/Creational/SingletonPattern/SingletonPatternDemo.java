package DesignPatterns.Creational.SingletonPattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		SingleObjectSynchronized test = SingleObjectSynchronized.getInstance();
		test.showMessage();	
		
		SingleObjectBillPugh test2 = SingleObjectBillPugh.getInstance();
		test2.showMessage();
	}
}
