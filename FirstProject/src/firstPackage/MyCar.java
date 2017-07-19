package firstPackage;

public class MyCar {
	
	private double tankCapacity; // (limits: from 20 to 80 liters)

	private double fuelConsumption; // (limits 3 to 20 liters per 100 kilometers).

	private CarMakers maker; // an enumerative type CarMakers.

	private double mileage; // the total distance covered by the car, initial value 0.0.
	
	private double distance; // total distance traveled
	
	private double lastTripDistance; // trip distance
	
	private double fuel; // current amount of fuel 
	
	private final int minCap = 20;
	
	private final int maxCap = 80;
	
	
	{
		maker = CarMakers.NOTKNOWN;
	}
	
	//45;8.7;BMW
	public MyCar(String str) throws Exception{
		String[] ar = str.split("[;]", 3);
		if(ar.length >2){}
		else{
			throw new Exception("Input Invalid");
		}
		try{
		setTankCapacity(Double.parseDouble(ar[0]));
		setFuelConsumption(Double.parseDouble(ar[1]));
		setMaker(maker.fromString(ar[2]));
		}
		catch(Exception e){
			throw new Exception(""+e);
		}
	}
	
	public MyCar(){
		mileage = 0.0;
		maker = CarMakers.NOTKNOWN;
		tankCapacity = minCap;
		fuelConsumption = 3;
		distance = 0;
		fuel = 0;
	}
	

	public double getTankCapacity() {
		return tankCapacity;
	}

	protected void setTankCapacity(double tankCapacity) throws Exception {
		
		if(tankCapacity > minCap && tankCapacity < maxCap){
			this.tankCapacity = tankCapacity;
		}
		else{
			throw new Exception("Tank isn't capable to store " + tankCapacity + " Liters");
		}
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	protected void setFuelConsumption(double fuelConsumption) throws Exception {
		if(fuelConsumption > 3 && fuelConsumption <20){
			this.fuelConsumption = fuelConsumption;
		}
		else{
			throw new Exception("FuelConsumption can be between 3 to 20.");
		}
	}
	
	public double getMileage() {
		return mileage;
	}

	public void setMileage(double distancein, double fuel) {
		mileage = distancein/fuel;
	}
	
	boolean tankIt(double howMuch){     // the capacity of the tank can not be exceeded
		if(howMuch <= (tankCapacity-fuel)){
			fuel = howMuch;
			return true;
		}
		else{
			return false;
		}
	}

	void startTrip(double tripDistance) throws Exception{ // there must be enough fuel in the tank to  
		double temp = (getFuelConsumption()/100)*tripDistance;// cover the distance, throw an exception if 
		if (temp < fuel){	 							// there is not enough fuel for the trip
			lastTripDistance = tripDistance;
			distance += tripDistance;
			fuel -= temp;
			setMileage(tripDistance, temp);
		}
		else{
			throw new Exception("Not Enough fuel to start the trip");
		}
	} 									 

	public double getDistance() {
		return distance;
	}

	public double getLastTripDistance() {
		return lastTripDistance;
	}

	public String toString() {
		return("test");
	}

	public CarMakers getMaker() {
		return maker;
	}

	public void setMaker(CarMakers maker) {
		this.maker = maker;
	}

	double getFuelLevel() {  	// number of liters of fuel left in tank
		return fuel;
	} 									
}
