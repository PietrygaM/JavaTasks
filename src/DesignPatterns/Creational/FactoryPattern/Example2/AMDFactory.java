package DesignPatterns.Creational.FactoryPattern.Example2;

public class AMDFactory implements ProcessorFactory{

	@Override
	public Processor createProcessor() {
		return new AMDProcessor();
	}

	@Override
	public Cooler createCooler() {
		return new AMDCooler();
	}
}
