package practiceoncollections;

import java.util.ArrayList;
import java.util.Scanner;

public class JoinTwoArrayLists {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<String>al=new ArrayList<String>();
		System.out.println("entre u r name: ");
		String name=s.next();
		al.add(name);
		System.out.println("work enter: ");
		String work=s.next();
		al.add(work);
		System.out.println(al);
		ArrayList<String>al1=new ArrayList<String>();
		System.out.println("entre u r name: ");
		String name1=s.next();
		al1.add(name1);
		System.out.println("work enter: ");
		String work1=s.next();
		al1.add(work1);
		System.out.println(al1);
		al.addAll(al1);
		System.out.println(al);
	}

}
