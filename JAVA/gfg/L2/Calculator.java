package gfg.L2;
@FunctionalInterface
interface Operation{
	int mathOper(int a, int b);
	
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Operation add = new Operation() {
		 * 
		 * @Override public int mathOper(int a, int b) { // TODO Auto-generated method
		 * stub return a+b; } }; Operation sub= new Operation() {
		 * 
		 * @Override public int mathOper(int a, int b) { // TODO Auto-generated method
		 * stub return a-b; } };
		 */
		
		Operation add = (int a,int b)->a+b;
		Operation mul= (int a,int b)-> a*b;
		
		
		System.out.println("add : "+ add.mathOper(12, 10));
		System.out.println("mul : "+ mul.mathOper(12, 10));
	}

}
