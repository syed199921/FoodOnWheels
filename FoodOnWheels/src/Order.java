import java.util.ArrayList;

public class Order {
	
	//Attributes
	private static int orderNumber = 0;
	private int orderID;
	private ArrayList <OrderedFood> orderedFoodItems;
	private Customer customer;
	private Time timeOfDelivery;
	private Bill orderBill;
	private boolean isAssigned;
	//Attributes
	
	

	//Constructors
	public Order() {
		
		orderedFoodItems = new ArrayList<OrderedFood>();
		customer = new Customer();
		timeOfDelivery = new Time();
		orderID = ++orderNumber;
		orderBill = null;
		isAssigned = false;
		
	}
	
	public Order(Customer customer, Time timeOfDelivery, ArrayList<OrderedFood> foodItemsOrdered ) {
		
		this.customer = customer;
		this.timeOfDelivery = timeOfDelivery;
		this.orderedFoodItems = foodItemsOrdered;
		orderID = ++orderNumber;
		orderBill  = null;
		isAssigned = false;
		
	}
	//Constructors
	
	

	//Setters and getters
	
	public Bill getOrderBill() {
		return orderBill;
	}

	public void setOrderBill(Bill orderBill) {
		this.orderBill = orderBill;
	}
	
	public static int getOrderNumber() {
		return orderNumber;
	}

	public static void setOrderNumber(int orderNumber) {
		Order.orderNumber = orderNumber;
	}
	
	public void setTimeOfDelivery(Time timeOfDelivery) {
		this.timeOfDelivery = timeOfDelivery;
	}
	
	public Time getTimeOfDelivery() {
		return this.timeOfDelivery;
	}
	

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public ArrayList<OrderedFood> getOrderedFoodItems() {
		return orderedFoodItems;
	}

	public void setOrderedFoodItems(ArrayList<OrderedFood> orderedFoodItems) {
		this.orderedFoodItems = orderedFoodItems;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public boolean isAssigned() {
		return isAssigned;
	}

	public void setAssigned(boolean isAssigned) {
		this.isAssigned = isAssigned;
	}
	
	//Setters and getters

	

	//Display order details
	public void displayOrderDetails() {
		
		System.out.println("Order ID: "+this.orderID);
		System.out.println("Customer Name: "+this.getCustomer().getName());
		System.out.println("Customer ID: "+this.getCustomer().getCustomerID());
		System.out.println("Food Items Ordered:");
		for(int i = 0; i < orderedFoodItems.size();i++) {
			System.out.println("Food's Name: "+this.orderedFoodItems.get(i).getFoodName()+"\nFood's Price: Rs "+this.orderedFoodItems.get(i).getPrice());
			System.out.println("Food Quantity Ordered: "+this.orderedFoodItems.get(i).getFoodQuantity());
			System.out.println();
		}
	}
	//Display order details
	
	//Generate bill
	
	public void generateBill(Order order)
	{
		Bill orderBill = new Bill(order.getOrderedFoodItems(),order.getCustomer(),order.getOrderID());
		
		this.orderBill = orderBill;
		
		System.out.println("Order Bill has been generated successfully");
	}
	
	//Generate bill
	 
	//Display orderBill
	public void displayOrderBill()
	{
		try {
			this.orderBill.displayBillDetails();
			} catch (Exception e) {
			System.out.println("The bill has not been generated yet.");
			}
		
	}
	//Display orderBill
	
	
	
}
