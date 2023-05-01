package practiceoncollections;
import java.util.*;
public class GetMethod {

	public static void main(String[] args) {
		ArrayList<Integer>al =new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number: ");
		int fnum=s.nextInt();
		al.add(fnum);
		System.out.println("enter second number: ");
		int snum=s.nextInt();
		al.add(snum);
		
		System.out.println("the value is in zero index position is: : "+al.get(0));
System.out.println("the value in first index position is:  "+al.get(1));
	}

}
