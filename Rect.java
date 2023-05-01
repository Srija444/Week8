package practiceoncollections;
import java.util.*;



/*1. Create a class called "Rectangle" that has two instance variables, "length" and "width". Include a method called "calculateArea" that returns the area of the rectangle.*/
class Rectangle{
private int length;
private int width;

public Rectangle(int length,int width) {
	this.length=length;
	this.width=width;
}
	public int getLength() {
		
		return length;
	}
	public int getWidth() {
		
		return width;
	}
	public int calculateArea() {
		return length*width;
	}
	
}

public class Rect{
	
	ArrayList<Rectangle>al=new ArrayList<Rectangle>();
	
	
	public void addRectangle(Rectangle r) {
		al.add(r);
	}
	public void removeRectangle(Rectangle r) {
		al.remove(r);
	}
	
	public void calculateArea() {
		System.out.println("the area is: ");
		for(Rectangle r: al) {
		System.out.println(r.calculateArea());
		}
	}
	
	public void displayinfo() {
		System.out.println("the rectangles: ");
		for(Rectangle r: al) {
			System.out.println("length: "+r.getLength()+"--"+r.getWidth()+"--"+r.calculateArea());
			
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Rect rec=new Rect();
		int option;
		do {
			System.out.println("Enter 1 to add values ");
			System.out.println("Enter 2 to remove values");
			System.out.println("Enter 3 to get area ");
			System.out.println("Enter 4 to display values info ");
			System.out.println("Enter 0 to quit ");
			option=s.nextInt();
			switch(option) {
		case 1:{
			s.nextLine();
			System.out.println("Enter the length");
			int length=s.nextInt();
			System.out.println("Enter the width");
			int width=s.nextInt();
			 
					Rectangle r=new Rectangle(length,width);
			rec.addRectangle(r);
//			Item item=new Item(name,price);
//			shopping.addItem(item);
			 
			 
			break;
			}
		case 2:{	
		s.nextLine();
		System.out.println("Enter the length");
		int length=s.nextInt();
		System.out.println("Enter the width");
		int width=s.nextInt();
		 
				Rectangle r=new Rectangle(length,width);
		rec.removeRectangle(r);
		System.out.println("removed successfully");
	}
		case 3: {
			rec.calculateArea();
			break;
		}
		
		case 4:{
			rec.displayinfo();
			break;
		}

}
	}while(option != 0);
	}
}
