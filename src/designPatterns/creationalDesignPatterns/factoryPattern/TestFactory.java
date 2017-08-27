/**
 * This is test file created by developer Mahinga Singh in public interest.
 */
package designPatterns.creationalDesignPatterns.factoryPattern;

import designPatterns.creationalDesignPatterns.factoryPattern.Vehicle;
import designPatterns.creationalDesignPatterns.factoryPattern.VehicleFactory;

/**
 * @author MAHINGA
 *
 */

public class TestFactory {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle vehicle1= VehicleFactory.getVehicle("car","5","32");
		Vehicle vehicle2= VehicleFactory.getVehicle("bus","65","322");
		Vehicle vehicle3= VehicleFactory.getVehicle("train","1165","3224");
		System.out.println(vehicle1);
		System.out.println(vehicle2);
		System.out.println(vehicle3);
		

	}

}
