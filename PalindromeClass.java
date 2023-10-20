import java.util.Scanner;

class PalindromeClass{
	public static void main(String[] args){
		int remainder,reverse=0,temp;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		temp=number;
		  while(number>0){    
		  remainder=number%10;  //getting remainder  
		  reverse=(reverse*10)+remainder;    
		  number=number/10;    
  }  
		if(reverse==temp){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}
			