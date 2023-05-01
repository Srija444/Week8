package practiceoncollections;
import java.util.*;

class Item{
	private String name;
	private double price;
	
	public Item(String name,double price) {
		this.name=name;
		this.price=price;
	}
	public String  getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
	public String toString(){
		return "Item: "+name+", price: "+price;
	}
	
}
public class ShoppingProjectUsingArrayList {
	//Generic type this is ArrayList
ArrayList<Item> ai=new ArrayList<Item>();
public void addItem(Item i) {
	ai.add(i);
}

public void removeItem(Item i) {
	ai.remove(i);
}

public void display() {
	if(ai.isEmpty()) {
		System.out.println("The cart is empty");
		}else {
		for(Item it: ai) {
		System.out.println(it);
		}
		}
}


public void getTotal() {
	double totalCost=0.0;
	for(Item it: ai) {
		totalCost=totalCost+it.getPrice();
		
	}
	System.out.println(totalCost);
}


	public static void main(String[] args) {
		/*Shopping Cart: Create a class called ShoppingCart that stores a collection of items in a ArrayList. The class should have methods to add, remove, and display items in the cart, as well as to calculate the total cost of the items in the cart. Create Item class also.*/
		Scanner sc=new Scanner(System.in);
		ShoppingProjectUsingArrayList shopping=new ShoppingProjectUsingArrayList();
		int option=10;
		do {
		System.out.println("Enter 1 to add items ");
		System.out.println("Enter 2 to remove item ");
		System.out.println("Enter 3 to get total price ");
		System.out.println("Enter 4 to display the cart ");
		System.out.println("Enter 0 to quit ");
		option=sc.nextInt();
		 
		switch(option) {
		
		
		case 1:{
		sc.nextLine();
		System.out.println("Enter the name of item");
		String name=sc.nextLine();
		System.out.println("Enter the price of item");
		double price=sc.nextDouble();
		 
		Item item=new Item(name,price);
		shopping.addItem(item);
		 
		break;
		}
		
		
		case 2:{
		sc.nextLine();
		System.out.println("Enter the name of item");
		String name=sc.nextLine();
		System.out.println("Enter the price of item");
		double price=sc.nextDouble();
		 
		Item item=new Item(name,price);
		shopping.removeItem(item);
		System.out.println("Item removed successfully");
		break;
		}
		
		
		case 3:{
		
		shopping.getTotal();	
		
		break;
		}
		
		
		
		case 4:{
		System.out.println("===============Items in cart are================");
		shopping.display();
		break;
		}
		 
		}
		}while(option!=0);
		}
		}
		
		
		
		
		
		
		
		
	


