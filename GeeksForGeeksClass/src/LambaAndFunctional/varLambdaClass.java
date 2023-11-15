package LambaAndFunctional;
 // Java Program Illustrating Difference between 
//Effectively final and Mutable Local Variables 

//Importing required classes 
import java.io.*; 
//An example of capturing a local variable from the 
//enclosing scope 

//Interface 
interface MyFunction { 

	// Method inside the interface 
	int func(int n); 
} 

//Main class 
class varLambdaClass { 

	// Main driver method 
	public static void main(String[] args) 
	{ 

		// Custom local variable that can be captured 
		int number = 10; 

		MyFunction myLambda = (n) -> 
		{ 

			// This use of number is OK It does not modify 
			// num 
			int value = number + n; 

			// However, the following is illegal because it 
			// attempts to modify the value of number 

			// number++; 
			return value; 
		}; 
		System.out.println(myLambda.func(100));
		// The following line would also cause an error, 
		// because it would remove the effectively final 
		// status from num. number = 9; 

		System.out.println("GFG!"); 
	} 
}

