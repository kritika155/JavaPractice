package gfg.L2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SigletonDesignPattern s1=  SigletonDesignPattern.getInstance();
		SigletonDesignPattern s2= SigletonDesignPattern.getInstance();

		System.out.println(s1.hashCode()+"      "+ s2.hashCode());
	}

}
