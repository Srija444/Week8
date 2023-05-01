package practiceoncollections;
import java.util.*;
public class IndexPositions {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.ensureCapacity(20);
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number: ");
		int fnum=s.nextInt();
		al.add(fnum);
		System.out.println("enter second number: ");
		int snum=s.nextInt();
		al.add(snum);
		al.trimToSize();
		System.out.println("the values are: ");
		for(int in: al) {
			System.out.println(in);
		}
		
		System.out.println("index positon is:"+al.indexOf(snum));
System.out.println("the last index psition is: "+al.lastIndexOf(fnum));
	}

}
