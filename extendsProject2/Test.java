package extendsProject2;

public class Test {
	public static void main(String []args){
	Vehicle vehicle=new Vehicle();
	vehicle.setWheels(4);
	vehicle.setWeight(5000);
	System.out.println(vehicle.getWeight()+","+vehicle.getWheels());
	Vehicle vehicle2=new Vehicle(45,5000);
	System.out.println(vehicle2.toString());
	Car car=new Car();
	car.setWheels(4);
	car.setWeight(10000);
	car.setLoader(6);
	System.out.println(car.getWheels()+","+car.getWeight()+","+car.getLoader());
	Car car2=new Car(4,10000,6);
	System.out.println(car2.toString());
	Truck truck=new Truck();
	truck.setWheels(8);
	truck.setWeight(50000);
	truck.setLoader(4);
	truck.setPayload(60000);
	System.out.println(truck.getWheels()+""+truck.getWeight()+", "+truck.getLoader()+","+truck.getLoader());
	Truck truck2=new Truck(8,50000,1,60000);
	System.out.println(truck2.toString());
	
	}
	

}
