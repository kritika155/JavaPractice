package CollectionClass;

import java.util.*;

public class SortingArraylistClass {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<String>();
	a.add("Kritika");
	a.add("Harshita");
	a.add("Vivaan");
	a.add("Volkswagen");   
	a.add("Toyota");   
	a.add("Porsche");   
	a.add("Ferrari");   
	a.add("Mercedes-Benz");   
	a.add("Audi");   
	a.add("Rolls-Royce");  
	a.add("BMW");  
//	 Iterator itr=a.iterator(); 
//	  while(itr.hasNext()){
//	   System.out.println(itr.next());  
//	  }  
	  for(String fruit:a)   { 
		    System.out.println(fruit);    
		  
		 }  
	  Collections.sort(a);
	  System.out.println("After sorting:");
	  Iterator it=a.iterator();//getting the Iterator  
	  while(it.hasNext()){//check if iterator has the elements  
	   System.out.println(it.next());//printing the element and move to next  
	  } 
	  Collections.sort(a,Collections.reverseOrder());
	  System.out.println("After sorting:");
	  Iterator ita=a.iterator();//getting the Iterator  
	  while(ita.hasNext()){//check if iterator has the elements  
	   System.out.println(ita.next());//printing the element and move to next  
	  } 
}
}
