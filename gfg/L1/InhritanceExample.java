package gfg.L1;

class Parent {
	int a= 10;
	public void m1() {
		System.out.println(" this is m1 parent's method ");
	}
}

class Child extends Parent {
	int a= 20;
	public void m2() {
		System.out.println(" this is m2 child's method=======>  " + super.a);
		System.out.println(" this is m2 child's method=======>  " + a);
	}
}

public class InhritanceExample {
 public static void main(String[] args) {
	
	 Child c= new Child();
	 c.m2();c.m1();
	 
		/*
		 * Parent p= new Parent(); p.m1();
		 * 
		 * Parent p1= new Child(); p1.m1();
		 */

 
 
 }
}
