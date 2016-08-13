package tr.org.linux.kamp2016.vehicle;

public class Car extends Vehicle {
	
	private String id;
	
	public Car(){
		
	}
	
	public Car(String brand, String model, int speed, String id){
		super(brand, model, speed);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public int getSpeed() {
	        return speed;
	    }

	    public void setSpeed(int speed) {
	        this.speed = speed;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }
	    
	    
	    public void printCar(){
	    	System.out.println("Marka: " + brand + " Model: " 
	    + model + "Hız: " + speed + " Plaka: " + id + "Otomatik pilotu var mı? " + hasAutoPilot);
	    	
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
