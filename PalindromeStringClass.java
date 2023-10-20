import java.util.*;

class PalindromeStringClass{
	public static void main(String[] args){
		String reverse="";
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int length=str.length();
		      for ( int i = length - 1; i >= 0; i-- ) 
			  {				  
         reverse = reverse + str.charAt(i);  
  }  
		if(str.equals(reverse))    
   System.out.println("palindrome string ");    
  else    
   System.out.println("not palindrome string");    
	}
}
			