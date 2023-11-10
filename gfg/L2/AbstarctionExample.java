package gfg.L2;

abstract class Vehicle{
	public abstract int getNoOfWheels();
	public void m1() {
		System.out.println("this concrete method");
	}
}

abstract class Car extends Vehicle{
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("this child's concrete method");
	}
	
}
class Auto extends Car {

	@Override
	public int getNoOfWheels() {
		System.out.println("implemented method");
		return 8;
	}
	
}

public class AbstarctionExample {
 public static void main(String[] args) {
	 
	 Auto a= new Auto();
	 a.getNoOfWheels();
	
}
}
