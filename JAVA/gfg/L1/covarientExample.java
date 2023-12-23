package gfg.L1;

class Animal{
	Animal giveBirth(){
		System.out.println(" this is animal");
		return new Animal();
		
	}
}
class Cat extends Animal{
	@Override
	 Cat giveBirth(){
		System.out.println(" this is cat");
		return new Cat();
		
	}
}

public class covarientExample {
 public static void main(String[] args) {
	
	 Cat c= new Cat();
	 c.giveBirth();
}
}
