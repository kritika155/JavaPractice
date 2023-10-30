import java.io.*;
import java.util.Scanner;
class DataFinderClass{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a input");
		String charValue=sc.nextLine();
		boolean isInt=true;
		try{
			int i=Integer.parseInt(charValue);
		}
		catch(NumberFormatException e){
			isInt=false;
		}
	}
}