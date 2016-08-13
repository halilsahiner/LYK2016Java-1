package tr.org.linux.kamp2016.vehicle;

public class Plane extends Vehicle{
	
	protected int maximumFeet;
	protected String flightCode;
	protected boolean isAutoPilotActive;
	
	
	public Plane(){
		
		
	}
	
	public Plane(String brand, String model, int speed, int capacity, int numberOfWheels, boolean hasAerofoil, boolean hasAutoPilot,
            int maximumFeet, String flightCode, boolean isAutoPilotActive){
   super(brand, model, speed, capacity, numberOfWheels, hasAerofoil, hasAutoPilot);
   this.maximumFeet = maximumFeet;
   this.flightCode = flightCode;
   this.isAutoPilotActive = isAutoPilotActive; }
	
	
	public enum liftOffType {
		
		LIFTOFF_HORIZONTAL, LIFTOFF_VERTICAL
	}
	
	public void printPlane(){
		System.out.println("Marka: " + brand + " Model: " 
			    + model + "Hız: " + speed + "Maksimum feet " + maximumFeet + "Uçuş Kodu: " + flightCode + "Otomatik pilotu aktif mi? " + isAutoPilotActive);
			    			
		
	}
	
	@Override
	public void executeMotor() {
		System.out.println("Motor çalıştırılıyor");			
	}

	@Override
	public void processGas() {
		System.out.println("Gaz veriliyor");
	}

	@Override
	public void enableSteeringWhellControls() {
		System.out.println("Direksiyon kontrolleri açık");
		
	}


}
