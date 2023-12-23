package GeeksForGeeksClass;
import java.util.Scanner;

class Prime{
	public static void main(String[] args){
		int n;
		System.out.println("Enter a  Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(isPrime(n)){
			System.out.println("Prime Number");
		}
		else{
			System.out.println("Not a Prime Number");
		}
		
	}
	  static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }
}