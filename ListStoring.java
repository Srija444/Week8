package practiceoncollections;
import java.util.*;
/*2. Write a program that reads in a list of integers from the user and stores them in an ArrayList. Then, find the average of the integers in the list.*/
class List{
	private int num;
	
	public  List(int num) {
		this.num=num;
				
	}
	public int getNum() {
		return num;
	}
	
	}

public class ListStoring {
ArrayList<List>al=new ArrayList<List>();
public void addnum(List l) {
	al.add(l);
}



public void removenum(List l) {
	al.remove(l);
}



public double sum() {
	int sum=0;
	for(List l:al) {
		 sum += l.getNum();
	}
	return sum;
}



public double average() {
	if(al.isEmpty()) {
		return 0;
	}
	return  sum() / al.size();
}



public void display() {
	System.out.println("the numbers are: ");
	
	for(List l:al) {
		System.out.println(l.getNum());
	}
		System.out.println("the average is: "+average());
	}




	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ListStoring ls=new ListStoring();
		int option=10;
		do {
			System.out.println("1. add numbers");
			System.out.println("2. remove numbers");
			System.out.println("3. sum");
			System.out.println("4. average");
			System.out.println("5. display");
			System.out.println("6. exit");
			 option=s.nextInt();
			 switch(option ) {
			 case 1:{
				 System.out.println("enter numbers: ");
				 int num=s.nextInt();
				 List l=new List(num);
				 ls.addnum(l);
				 break;
			 }
			 case 2:{
				 if (ls.al.isEmpty()) {
                     System.out.println("List is empty.");
                 } else {
                     System.out.println("Enter the index of the number to remove: ");
                     int index = s.nextInt();
                     if (index >= 0 && index < ls.al.size()) {
                         List removed=ls.al.remove(index);
                        System.out.println("successfully removed : "+removed.getNum());
                     } else {
                         System.out.println("Invalid index.");
                     }
                 }
                 break;
			 }
             case 3:
                 System.out.println("The sum is: " + ls.sum());
                 break;
             case 4:
                 System.out.println("The average is: " + ls.average());
                 break;
             case 5:
                 ls.display();
                 break;
             case 6:
                 System.out.println("Goodbye!");
                 break;
             default:
                 System.out.println("Invalid option.");
                 break;
         }
      
	}while (option != 6);
	}

}
