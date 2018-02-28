package DesignPatterns.Creational.FactoryPattern.Example2;

public class AbstractFactoryClient {

	public static void main(String[] args) {
		Computer computer;
		computer = new Computer ("PC001", new AMDFactory());
		computer = new Computer ("PC002", new IntelFactory());
		
		
		
		
	}

}
