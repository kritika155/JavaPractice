import java.io.IOException;
import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
		String reverseStr="";
        String input = "";
		int length;
		System.out.println("Enter a input");
         //so we can check multiple inputs (optional)
            input = scan.nextLine();

            boolean isInt = true; //introduce boolean to check if input is of type Integer
			int remainder,reverse=0,temp;
            try { // surround with try/catch
                int integer = Integer.parseInt(input); //boolean is still true if it works
            } catch (NumberFormatException e) {
                isInt = false; //changed to false if it doesn't
            }

            boolean isDouble = true; //same story
            try {
                double dbl = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                isDouble = false;
            }

            if (isInt) {
                System.out.printf("%s is integer type%n", input);
				
                int integer = Integer.parseInt(input); //boolean is still true if it works
				temp=integer;
		  while(integer>0){    
		  remainder=integer%10;  //getting remainder  
		  reverse=(reverse*10)+remainder;    
		  integer=integer/10;    
  }  
		if(reverse==temp){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
            } else if (isDouble) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.length() == 1) { //this could be useless depending on your case
                System.out.printf("%s is character type%n", input);
            } else if ("true".equals(input.toLowerCase()) || "false".equals(input.toLowerCase())) {
                System.out.printf("%s is boolean type%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
					length=input.length();
		      for ( int i = length - 1; i >= 0; i-- ) 
			  {				  
         reverseStr = reverseStr + input.charAt(i);  
  }  
		if(input.equals(reverseStr))    
   System.out.println("palindrome string ");    
  else    
   System.out.println("not palindrome string");    
	
            }
        
    }
}