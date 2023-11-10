package gfg.L1;
class Plane{
	  protected  void typeOfPlane (int a) {
		System.out.println(" this is cargo parent's class plane ");
	}
}
class CargoPlane extends Plane {
	
	@Override
	 protected void  typeOfPlane(int a ) {
		System.out.println(" this is mini - cargo  child 's class plane ");
	}
}


public class OverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

	}

}
