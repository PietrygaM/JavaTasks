package DesignPatterns.Creational.FactoryPattern.Example2;

public class Computer {

	private String serialNumber;
	private Processor processor;
	private Cooler cooler;

	
	public Computer(String serialNumber, ProcessorFactory processorFactory) {
		this.serialNumber = serialNumber;
		this.processor = processorFactory.createProcessor();
		this.cooler = processorFactory.createCooler();
		process();
	}

	private void process() {
		System.out.println("Preparing computer with serial number: "+serialNumber);
		processor.process();
		cooler.process();
		System.out.println("Computer was build");
	}

	
	
}
