/**
 * This is test file created by developer Mahinga Singh in public interest.
 */
package designPatterns.creationalDesignPatterns.abstractFactoryPattern;

/**
 * @author MAHINGA
 *
 */
public class CarFactory implements VehicleAbstractFactory {
	
	private String type;
	private String sittingCapacity;
	private String horsePower;
	
	public CarFactory(String type, String sittingCapacity, String horsePower){
		this.type=type;
		this.sittingCapacity=sittingCapacity;
		this.horsePower=horsePower;
	}

	/* (non-Javadoc)
	 * @see designPatterns.creationalDesignPatterns.abstractFactoryPattern.VehicleAbstractFactory#createVehicle()
	 */
	@Override
	public Vehicle createVehicle() {

		return new Car(type,sittingCapacity,horsePower);
	}

}
