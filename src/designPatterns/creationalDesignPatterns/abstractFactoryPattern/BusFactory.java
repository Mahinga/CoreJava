/**
 * This is test file created by developer Mahinga Singh in public interest.
 */
package designPatterns.creationalDesignPatterns.abstractFactoryPattern;

/**
 * @author MAHINGA
 *
 */
public class BusFactory implements VehicleAbstractFactory {

	private String type;
	private String sittingCapacity;
	private String horsePower;
	
	public BusFactory(String type, String sittingCapacity, String horsePower){
		this.type=type;
		this.sittingCapacity=sittingCapacity;
		this.horsePower=horsePower;
	}

	/* (non-Javadoc)
	 * @see designPatterns.creationalDesignPatterns.abstractFactoryPattern.VehicleAbstractFactory#createVehicle()
	 */
	@Override
	public Vehicle createVehicle() {

		return new Bus(type,sittingCapacity,horsePower);
	}

}
