package firstPackage;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Boolean var;
		MyCar car = new MyCar("50;10;fiat");
		var = car.tankIt(50);
		if(var.equals("false")){
			System.out.println("You are running on low capacity");
		}
		car.startTrip(10);	
		System.out.println("Car Maker : " + car.getMaker().toString());
		System.out.println("Fuel Consumption : " + car.getFuelConsumption());
		System.out.println("Tank Capacity : " + car.getTankCapacity());
		System.out.println("Fuel Level : " + car.getFuelLevel());
		System.out.println("Last Trip Distance : " + car.getLastTripDistance());
		System.out.println("Mileage : " + car.getMileage());
		
		
		//car.startTrip(100);
		//System.out.println(cm.toString());
		
		
	}

}
