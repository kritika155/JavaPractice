package GeeksForGeeksClass;
import java.util.Scanner;
class DataFinderClass{
	public static void main(String[] args){
		
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a input");
			String charValue=sc.nextLine();
			int i;
			boolean isInt;
			try{
				i=Integer.parseInt(charValue);
				
					isInt=true;
				
			}
			catch(NumberFormatException e){
				isInt=false;
			}
			if(isInt) {
				System.out.println("It's an integer");
			}
			else {
				System.out.println("Not an integer");
			}
		}
	}
}