package LambaAndFunctional;

public class Main {

	public static void main(String[] args) {
		Greet mayor=new Mayor();
		Greet vip=new Vip();
		
		Main.Greetings(mayor);
		Main.Greetings(vip);
		
		Greet var=()->{
			System.out.println("Hello hi");
		};
//		var.msg();
		Greetings(var);
		 
		multiply var1=(int a)->  a*2;
	}
	public static void Greetings(Greet greet) {
		greet.msg();
	}
}
