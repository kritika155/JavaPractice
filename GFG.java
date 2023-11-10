// Java Program to demonstrate Immutable String in Java
import java.io.*;

class GFG {
	public static void main(String[] args)
	{
		String s = "Sachin";
	
		// concat() method appends
		// the string at the end
		String ch=s.concat(" Tendulkar");
	
		// This will print Sachin
		// because strings are
		// immutable objects
		System.out.println(ch);
	}
}
