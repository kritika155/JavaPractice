package gfg.L2;

@FunctionalInterface
interface sayable{
	void say (String msg);
	
}

public class FunctionalInterfaceExample implements sayable {
 public static void main(String[] args) {
	 FunctionalInterfaceExample f= new FunctionalInterfaceExample();
	 f.say("hello geeks ");
}

@Override
public void say(String msg) {
	// TODO Auto-generated method stub
	System.out.println(msg);
}
}
