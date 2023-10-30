import java.util.Scanner;
public class printName{
	public static void B(String name){
		System.out.println("Printing your name:");
		System.out.println(name);
	}
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name:");
	String name=sc.nextLine();
		B(name);
	}
}