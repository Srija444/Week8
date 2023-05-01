package practiceoncollections;
import java.util.*;
/*Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents a point of sale system. The class should have a list of products, and methods such as addProduct, removeProduct, and getTotalCost.*/

class Product{
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name,double price,int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
}


public class PointOfSale {
ArrayList<Product> products=new ArrayList<Product>();


public void addProduct(Product product) {
	products.add(product);
}


public void removeProduct(Product product) {
	//products.remove(product);
	/*for(Product pros: products) {
		if(pros.getName().equals(product.getName()) && pros.getPrice()==product.getPrice() && pros.getQuantity()==product.getQuantity()) {
			products.remove(pros);
			break;*/
	
	Iterator<Product> iter = products.iterator();
    while (iter.hasNext()) {
        Product p = iter.next();
        if (p.getName().equals(product.getName()) &&
            p.getPrice() == product.getPrice() &&
            p.getQuantity() == product.getQuantity()) {
            iter.remove();
            System.out.println("product removed successfully");
            return;
        }
    }
    System.out.println("product not found");
}
		

public void gettotalCost() {
	double totalCost=0.0;
	for(Product pro:products) {
		totalCost += pro.getPrice()*pro.getQuantity();
	}
	System.out.println(totalCost);
}




	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		PointOfSale pos=new PointOfSale();
		int option;
		do {
			System.out.println("Enter 1 to add product ");
			System.out.println("Enter 2 to remove product ");
			System.out.println("Enter 3 to get total cost ");
			System.out.println("Enter 4 to display the product details ");
			System.out.println("Enter 0 to quit ");
			option=s.nextInt();
			switch(option) {
			
			
			case 1:{
			s.nextLine();
			System.out.println("Enter the name of product");
			String name=s.nextLine();
			System.out.println("Enter the price of product");
		double price=s.nextDouble();
		 System.out.println("enter the quantity");
			 int quantity=s.nextInt();
			Product product=new Product(name,price,quantity);
			pos.addProduct(product);
			break;
			}
			
			
			
			case 2:{
				s.nextLine();
				System.out.println("Enter the name of product");
				String name=s.nextLine();
				System.out.println("Enter the price of product");
				double price=s.nextDouble();
				 System.out.println("entre the quantity");
				 int quantity=s.nextInt();
				Product product=new Product(name,price,quantity);
				pos.removeProduct(product);
				break;
				}
			
			
			case 3:{
				
				pos.gettotalCost();	
				
				break;
				}
				}
				}while(option!=0);
				}
				
			 

	}


