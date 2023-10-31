public class fibonacciSeries{
	public static void main(String[] args){
		int first=0,second=1,third,n=10;
		int i=2;
		System.out.println("Fibonacci Series:");
		
		while(i<=n){
			System.out.println("First:");
		System.out.print(first+" "+"\n");
		System.out.println("Second:");
		System.out.print(" "+second+"\n");
			third=first+second;
			System.out.println("Third:");
			 System.out.print("\n "+third+"\n");    
			first=second;
			second=third;
			i++;
		}
	}
}