package StringExample;

import java.util.Arrays;

public class noOfCharactersOccuring {
public static void main(String[] args) {
	String str="KKritttikaa";
	int len=str.length();
	int count[]=new int[256];
	
	for (int i = 0; i < len; i++)
	{
		System.out.println(i+" is "+(int)str.charAt(i));
		System.out.println(
				"Number of Occurrence of count in first loop  "
				+ str.charAt(i)
				+ " is:" + count[str.charAt(i)]);
					count[(int)str.charAt(i)]++;

	}
	System.out.println(Arrays.toString(count));
	for (int i = 0; i < count.length; i++) {
	    if (count[i] > 0)
	        System.out.println("Number of " + (char) i + ": " + count[i]);
	}
	}
}
