package GeeksForGeeksClass;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample5 {
	 public static void main(String [] args) {
	      String string = "Computer Science";
	      List<Character> chars = new ArrayList<>();
	      for (char ch : string.toCharArray()) {
	         chars.add(ch);
	      }
	      System.out.println(chars);
	   }
}
