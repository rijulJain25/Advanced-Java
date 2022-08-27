package Inheritance;

public class VehicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("White", 120);
		v.color = "Black";
		v.setMaxSpeed(180);
		v.print();
		
		
//		even if we are calling the constructor of the derieved class then also the base class constructor will be called itself 
		CarVehicle c1 = new CarVehicle("BMW", 6, "White", 200);
		c1.setName("Lamborgini");
		c1.color = "Red";
		c1.setNumGears(6);
		c1.setMaxSpeed(200);
		c1.print();
		
		//vehicle object can access CarVehicle as car is also a vehicle meanse base class object can assign to derieved class constructor 
		Vehicle v2 = new CarVehicle("BMW", 6, "White", 200);
		
	}

}
