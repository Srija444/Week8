package practiceoncollections;
import java.util.*;
public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(4);
		al.add(6);
		al.add(9);
		al.add(11);
		System.out.println("the elements are: "+al);
		Object array[]=al.toArray();
for(Object obj: array) {
	System.out.println(obj);
}
	}

}
