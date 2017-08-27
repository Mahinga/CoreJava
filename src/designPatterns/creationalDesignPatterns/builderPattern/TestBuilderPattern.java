/**
 * This is test file created by developer Mahinga Singh in public interest.
 */
package designPatterns.creationalDesignPatterns.builderPattern;

/**
 * @author MAHINGA
 *
 */
public class TestBuilderPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      Vehicle vehicle= new Vehicle.VehicleBuilder("Car", "5", "43").build();
      System.out.println("This Vehicle is a "+vehicle.getType()+", Its sitting capacity is "+vehicle.getSittingCapacity()+" and it's horse power is "+vehicle.getHorsePower());
	}

}
