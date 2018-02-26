package DesignPatterns.Creational.SingletonPattern;

public class SingleObjectBillPugh {

	private SingleObjectBillPugh() {
	}

	public static SingleObjectBillPugh getInstance() {
		return SingleObjectBillPughHolder.instance;
	}

	private static class SingleObjectBillPughHolder {
		private static final SingleObjectBillPugh instance = new SingleObjectBillPugh();
	}

	public void showMessage() {
		System.out.println("Singleton (BillPugh) object message");
	}
	
}
