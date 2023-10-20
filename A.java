import java.util.Scanner;
public class A {

    public static void main(String[]s){
		Scanner sc=new Scanner(System.in);
		Object var=sc.nextInt();
        show(var);
        show(var);
    }
    public static void show(Object obj){
        if(obj instanceof Integer){
            System.out.println((Integer)obj);
        }else if(obj instanceof String){
            System.out.println((String)obj);
        }
    }
}
