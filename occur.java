import java.io.*;
import java.util.Scanner;
class occur{
	static final int MAX_VALUE=256;
	
	static void getOccurences(String str){
		int count[]=new int[MAX_VALUE];
		int length=str.length();
		for(int i=0;i<length;i++){
			count[str.charAt(i)]++;
		}
		char ch[]=new char[length];
		for(int i=0;i<length;i++){
			int find=0;
			ch[i]=str.charAt(i);
			for(int j=0;j<=i;j++)
			{
				if(str.charAt(i)==ch[j]){
					find++;
				}
			}
			if (find == 1)
			{
				System.out.println(
					"Number of Occurrence of count in second loop  "
					+ str.charAt(i)
					+ " is:" + count[str.charAt(i)]);
			}
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		getOccurences(str);
	}
}