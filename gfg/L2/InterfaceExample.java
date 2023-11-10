package gfg.L2;
interface Demo{
	int a=10;
	
	void m1();
	 
	
	
	default void defaultMethod () {
		System.out.println(" this is default method ");
	}
	
	 
}
 class DemoImpl implements Demo{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		System.out.println(" this is override default method ");
	}

}

public class InterfaceExample {
 public static void main(String[] args) {
	 DemoImpl d= new DemoImpl();
	 d.defaultMethod();
	 d.m1();
}
}
