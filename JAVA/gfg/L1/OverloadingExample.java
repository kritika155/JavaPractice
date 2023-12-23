package gfg.L1;


class Test {
	void m1() {
		System.out.println(" zero args method");
	}
	void m1(int a) {
		System.out.println(" Int  args method");
	}
	void m1(int b, float a) {
		System.out.println(" int , flaot args method");
	}
	void m1(Double f) {
		System.out.println(" Double args method");
	}
}

public class OverloadingExample {
	
	public void m1(int ...i) {
		System.out.println("Var arg method");
	}
	void m1(int a) {
		System.out.println(" Int  args method");
	}
	
 public static void main(String[] args) {
	 
	 OverloadingExample o= new OverloadingExample();
	 o.m1(10);
	 o.m1();
	 o.m1(10,20,30);
	 
		/*
		 * Test t= new Test(); t.m1();t.m1(4); // t.m1(3, 4.4); t.m1(33.44);
		 */
	 
 }
}
