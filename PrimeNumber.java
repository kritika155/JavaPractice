import java.io.*;

class PrimeNumber{
public static void main(String[] args) throws IOException {
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
String var=bf.readLine();
int number=Integer.parseInt(var);
if(isPrime(number)){
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