package GeeksForGeeksClass;

import java.util.ArrayList;
public class ArrayListExample4{
   public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(7);
      list.add(8);
      list.add(9);

      Integer[] array = {};
      array = list.toArray(array);
      for (int elem : array) {
         System.out.println(elem);
      }
   }
}