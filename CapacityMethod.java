package practiceoncollections;
import java.util.*;
public class CapacityMethod {

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
		System.out.println("the values are: ");
		for(int in: al) {
			System.out.println(in);
		}
	}

}
