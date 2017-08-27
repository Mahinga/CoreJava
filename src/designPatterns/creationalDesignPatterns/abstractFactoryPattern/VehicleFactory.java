/**
 * This is test file created by developer Mahinga Singh in public interest.
 */
package designPatterns.creationalDesignPatterns.abstractFactoryPattern;


/**
 * @author MAHINGA
 *
 */
public class VehicleFactory {

	/**
	 * With the help of abstract factory, ifelse logic from factory has been removed.
	 * We have separate factories of each subtype and this factory returns another specific factory.
	 * hence this factory is a factory of factories.
	 * @param abstractFactory
	 * @return
	 */
	public static Vehicle getVehicle(VehicleAbstractFactory abstractFactory){
		
		return abstractFactory.createVehicle();
	}
}
