package StringExample;

public class StringReverse {
public static void main(String[] args) {
	String str="Kritika";
	char ch[]=new char[str.length()];
	int j=0;
	int length=str.length();
	while(j<length) {
		for(int i=length-1;i>=0;i--) {
			ch[j]=str.charAt(i);
			j++;
			
		}
	}
	System.out.println(ch);
}
}