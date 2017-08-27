package designPatterns.creationalDesignPatterns.builderPattern;

public class Vehicle {
	private String type;
	private String sittingCapacity;
	private String horsePower;
	
	public String getType() {
		return type;
	}

	public String getSittingCapacity() {
		return sittingCapacity;
	}

	public String getHorsePower() {
		return horsePower;
	}

	private Vehicle(VehicleBuilder vehicleBuilder){
		this.type=vehicleBuilder.type;
		this.sittingCapacity=vehicleBuilder.sittingCapacity;
		this.horsePower=vehicleBuilder.horsePower;
	}
	
	public static class VehicleBuilder{
		private String type;
		private String sittingCapacity;
		private String horsePower;
		
		public VehicleBuilder(String type, String sittingCapacity, String horsePower){
			this.type=type;
			this.sittingCapacity=sittingCapacity;
			this.horsePower=horsePower;
		}
			
		public Vehicle build(){
			return new Vehicle(this);
		}
	}

}
