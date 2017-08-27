package designPatterns.creationalDesignPatterns.abstractFactoryPattern;

public abstract class Vehicle {
public abstract String getType();
public abstract String getSittingCapacity();
public abstract String getHorsePower();

@Override
public String toString(){
	return "This Vehicle is a "+this.getType()+", Its sitting capacity is "+this.getSittingCapacity()+" and it's horse power is "+this.getHorsePower();
}
}
