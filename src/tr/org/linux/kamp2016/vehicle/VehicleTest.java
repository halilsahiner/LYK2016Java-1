package tr.org.linux.kamp2016.vehicle;

public class VehicleTest {
	
	
	public static void main(String args[]){
	
	Plane boeing1 = new Plane("Boeing", "666", 700, 300, 2, true, true, 4000, "CEYHUN400",true);
	
	Car car1 = new Car("Ferrari", "California",400, "06 CYHN 666" );
	
	boeing1.executeMotor();
	boeing1.processGas();
	boeing1.enableSteeringWhellControls();
	boeing1.printPlane();
	System.out.println("Uçağın yakıt tipi "+ Vehicle.GasType.JET_FUEL);
	
	car1.executeMotor();
	car1.processGas();
	car1.enableSteeringWhellControls();
	car1.printCar();
	System.out.println("Arabanın yakıt tipi " + Vehicle.GasType.LPG);

}
}
