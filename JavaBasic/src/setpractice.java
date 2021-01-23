import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setpractice {

public static void main(String[] args) {
// TODO Auto-generated method stub

ArrayList<String> names = new ArrayList<String>();
names.add("swaraj");
names.add("Rahul");
names.add("Boys");
names.add("swaraj");

Set<String> s = new HashSet<>();

Iterator<String> itr = names.iterator();
//for(String name : names)
while(itr.hasNext())
{

	 String s1 = itr.next();     //s1 holds the value of current element iterating through the list
   if(s.add(s1) ==false)
   {
	  
	   System.out.println(s1);
   }

}
}

}









/*
 * import java.util.ArrayList; import java.util.HashSet; import
 * java.util.Iterator; import java.util.Set;
 * 
 * public class setpractice {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * ArrayList<String> names = new ArrayList<String>(); names.add("swaraj");
 * names.add("Rahul"); names.add("Boys"); names.add("swaraj");
 * 
 * Set<String> s = new HashSet<>();
 * 
 * for(String name : names) {
 * 
 * if(s.add(name) ==false) System.out.println(name); } }
 * 
 * }
 */