package gfg.L2;

public class SigletonDesignPattern {
	
	public static SigletonDesignPattern sigletonDesignPattern= null;//creating var of this object
	
	private SigletonDesignPattern() {
		
	}
	
	public static SigletonDesignPattern getInstance() {
		if(sigletonDesignPattern==null) {
			sigletonDesignPattern = new SigletonDesignPattern();// creating only one object
		}
		return sigletonDesignPattern;
		
	}

	public static void main(String[] args) {
	 
		SigletonDesignPattern s1=  SigletonDesignPattern.getInstance();
		SigletonDesignPattern s2=  SigletonDesignPattern.getInstance();
		System.out.println(s1.hashCode()+"      "+ s2.hashCode());

	}

}
