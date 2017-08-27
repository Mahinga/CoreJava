/**
 * This is test file created by developer Mahinga Singh in public interest.
 */
package designPatterns.creationalDesignPatterns.factoryPattern;


/**
 * @author MAHINGA
 *
 */
public class VehicleFactory {

	public static Vehicle getVehicle(String type, String sittingCapacity, String horsePower){
		if(("car").equalsIgnoreCase(type))
		{
			return new Car(type,sittingCapacity,horsePower);
		}
		else if(("bus").equalsIgnoreCase(type))
		{
			return new Bus(type,sittingCapacity,horsePower);
		}
		return null;
	}
}
