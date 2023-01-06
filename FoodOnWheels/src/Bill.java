import java.util.ArrayList;

public class Bill {
	
	//Attributes
	private static int billNumber = 0;
	private int billID;
	private ArrayList<OrderedFood> foodItemsOrdered;
	private Customer customer;
	private int orderID;
	private double billAmount;
	
	//Attributes
	
	//Constructors
	public Bill()
	{
		billNumber++;
		billID = billNumber;
		foodItemsOrdered = new ArrayList<OrderedFood>();
		customer = new Customer();
		orderID = -1;
		billAmount = 0;
		
	}
	
	public Bill(ArrayList<OrderedFood> foodItemsOrdered, Customer customer, int orderID) 
	{
		
		billNumber++;
		billID = billNumber;
		this.foodItemsOrdered = foodItemsOrdered;
		this.customer = customer;
		this.orderID = orderID;
		
		for(int i = 0; i < this.foodItemsOrdered.size();i++)
		{
			billAmount += (this.foodItemsOrdered.get(i).getFoodQuantity())*(this.foodItemsOrdered.get(i).getPrice());
		}
		
		
		
		
	}
	//Constructors
	
	//Display bill Details
	public void displayBillDetails()
	{
		billAmount = 0;
		System.out.println("Bill ID: "+ this.billID);
		System.out.println("Order ID: "+ this.orderID+"\nCustomer Name: "+this.customer.getName()+"\nCustomer Contact Number: "+this.customer.getCustomerContactNumber()+"\nCustomer Address: "+ this.customer.getCustomerAddress());
		System.out.println("Food Ordered:");
		System.out.println("Food's Name                            Food's Quantity							Food's Price");
		for(int i = 0; i < this.foodItemsOrdered.size();i++)
		{
			System.out.println(""+foodItemsOrdered.get(i).getFoodName()+"                                    "+this.foodItemsOrdered.get(i).getFoodQuantity()+"							  "+this.foodItemsOrdered.get(i).getPrice());
		}
		
		
		System.out.println("Total Bill: "+ this.billAmount);
	}
	//Display bill Details
	

}
