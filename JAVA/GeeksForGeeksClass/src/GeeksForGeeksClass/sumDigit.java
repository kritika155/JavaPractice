package GeeksForGeeksClass;

import java.util.*;
import java.io.*;
class sumDigit{
	public static void main(String[] args){
		System.out.println("Enter 10 digits:");
		int i=0;
		int sum=0;
		 int temp = 0;  
		int[] arr = new int[10];  
		int max;
		while(i<10)
		{
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			arr[i]=a;
			sum=sum+a;
				
				i++;
		}
		
		max=arr[0];
		System.out.println(max);
		for(int j=1;j<10;j++){
			if(arr[j]>max){
				max=arr[j];
			}
		}
	   for (int x = 0; x < arr.length; x++) {     
            for (int y = x+1; y< arr.length; y++) {     
               if(arr[x] > arr[y]) {    
                   temp = arr[x];    
                   arr[x] = arr[y];    
                   arr[y] = temp;    
               }     
            }     
        }   
		System.out.println("MAX IS :");
		System.out.println(max);
	
	System.out.println("SUM IS :");
	System.out.println(sum);
	
	    System.out.println("Elements of array sorted in ascending order: ");    
        for (int k = 0; k < arr.length; k++) {     
            System.out.print(arr[k] + " ");    
        }  
	}
}