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
			
            } else if (isDouble) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.length() == 1) { //this could be useless depending on your case
                System.out.printf("%s is character type%n", input);
            } else if ("true".equals(input.toLowerCase()) || "false".equals(input.toLowerCase())) {
                System.out.printf("%s is boolean type%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
					length=input.length();    
	
            }
        
    }
}