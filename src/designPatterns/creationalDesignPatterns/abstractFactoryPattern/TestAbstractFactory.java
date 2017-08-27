/**
 * This is test file created by developer Mahinga Singh in public interest.
 */
package designPatterns.creationalDesignPatterns.abstractFactoryPattern;


/**
 * @author MAHINGA
 *
 *Factory Pattern provides approach to code for interfaces rather than implementation.
 *Factory Pattern removes the instantiation of actual implementation classes from client code.
 *Factory Pattern provides abstraction between implementation from client classes through inheritance.
 *Make code more robust, easy to extend and less coupled
 *java.util.Calendar, ResourceBundle and ValueOf() are few examples.
 */

public class TestAbstractFactory {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle vehicle1= VehicleFactory.getVehicle( new CarFactory("car","5","32"));
		Vehicle vehicle2= VehicleFactory.getVehicle( new BusFactory("bus","65","322"));
		System.out.println(vehicle1);
		System.out.println(vehicle2);
		

	}

}
