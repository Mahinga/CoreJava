/**
 * This is test file created by developer Mahinga Singh in public interest.
 */
package designPatterns.creationalDesignPatterns.abstractFactoryPattern;

/**
 * @author MAHINGA
 *
 */
public class Bus extends Vehicle{
	
	private String type;
	private String sittingCapacity;
	private String horsePower;
	
	public Bus(String type, String sittingCapacity, String horsePower){
		this.type=type;
		this.sittingCapacity=sittingCapacity;
		this.horsePower=horsePower;
	}
	

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public String getSittingCapacity() {
		return this.sittingCapacity;
	}

	@Override
	public String getHorsePower() {
		return this.horsePower;
	}
	

}
