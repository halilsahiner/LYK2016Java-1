package tr.org.linux.kamp2016.vehicle;

public abstract class Vehicle implements Driveable{

	protected String brand;
	protected String model;
	protected int speed;
	protected int capacity;
	protected int numberOfWheels;
	protected boolean hasAerofoil;
	protected boolean hasAutoPilot;

	public Vehicle() {

	}

	public Vehicle(String brand, String model, int speed) {

		this.brand = brand;
		this.model = model;
		this.speed = speed;

	}

	public Vehicle(String brand, String model, int speed, int capacity, int numberOfWheels, boolean hasAerofoil,
			boolean hasAutoPilot) {

		this.brand = brand;
		this.model = model;
		this.speed = speed;
		this.capacity = capacity;
		this.numberOfWheels = numberOfWheels;
		this.hasAerofoil = hasAerofoil;
		this.hasAutoPilot = hasAutoPilot;
	}
	
	
	public enum GasType{
		GASOLINE, LPG, DIESEL_FUEL, JET_FUEL
		
		
	}
}