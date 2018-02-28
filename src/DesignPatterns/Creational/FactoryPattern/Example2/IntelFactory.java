package DesignPatterns.Creational.FactoryPattern.Example2;

public class IntelFactory implements ProcessorFactory {

	@Override
	public Processor createProcessor() {
		return new IntelProcessor();
	}

	@Override
	public Cooler createCooler() {
		return new IntelCooler();
	}
	
}
