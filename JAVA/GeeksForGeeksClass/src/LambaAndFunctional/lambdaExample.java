package LambaAndFunctional;
 

//Java Program Illustrating Difference between 
//Effectively final and Mutable Local Variables 

//Importing input output classes 
import java.io.*; 

//Interface 
interface MyInterface { 

	// Method inside the interface 
	void myFunction(); 
} 

//Main class 
class lambdaExample { 

	// Custom initialization 
	int data = 170; 

	// Main driver method 
	public static void main(String[] args) 
	{ 

		// Creating object of this class 
		// inside the main() method 
		lambdaExample gfg = new lambdaExample(); 

		// Creating object of interface 
		// inside the main() method 
		MyInterface intFace = () -> 
		{ 
			System.out.println("Data : " + gfg.data); 
			gfg.data += 500; 

			System.out.println("Data : " + gfg.data); 
		}; 

		intFace.myFunction(); 
		gfg.data += 200; 

		System.out.println("Data : " + gfg.data); 
	} 
}

