import java.util.ArrayList;
import java.util.Scanner;

public class Rider extends Person {

	//Attributes
	private static int riderNumber = 0;
	private int riderID;
	private String contactNumber;
	private String riderAddress;
	private ArrayList <Order> ordersToDeliver;
	private boolean isBooked;
	private String password;
	Scanner scan;
	
	//Attributes
	
	//Constructors
	public Rider()
	{
		super();
		this.riderNumber++;
		this.riderID = riderNumber;
		this.ordersToDeliver = new ArrayList<Order>();
		this.isBooked = false;
		this.contactNumber = "";
		this.riderAddress = "";
		this.scan = new Scanner(System.in);
		
	}
	public Rider(String name, Date dateOfBirth, String CNIC, String contactNumber, String riderAddress, String password)
	{
		super(name, dateOfBirth,CNIC);
		this.riderNumber++;
		this.riderID = riderNumber;
		this.ordersToDeliver = new ArrayList<Order>();
		this.riderAddress = riderAddress;
		this.isBooked = false;
		this.contactNumber = contactNumber;
		this.password = password;
		this.scan = new Scanner(System.in);
	}
	//Constructors
	
	//Setters and getters
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPassword()
	{
		return this.password;
	}
	public static int getRiderNumber() {
		return riderNumber;
	}
	public static void setRiderNumber(int riderNumber) {
		Rider.riderNumber = riderNumber;
	}
	public int getRiderID() {
		return riderID;
	}
	public void setRiderID(int riderID) {
		this.riderID = riderID;
	}
	public ArrayList<Order> getOrdersToDeliver() {
		return ordersToDeliver;
	}
	public void setOrdersToDeliver(ArrayList<Order> ordersToDeliver) {
		this.ordersToDeliver = ordersToDeliver;
	}
	public boolean isBooked() {
		return isBooked;
	}
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getRiderAddress() {
		return riderAddress;
	}
	public void setRiderAddress(String riderAddress) {
		this.riderAddress = riderAddress;
	}
	
	
	//Setters and getters
	
	//View orders
	public void viewOrders( ArrayList<Order> recievedOrders)
	{
		
		if(recievedOrders == null)
			System.out.println("There are no orders");
		else
		{
			int orderNumber = -1;
			int retry = -1;
			do
			{
			
				retry  = -1;
			
				for(int i = 0; i < recievedOrders.size(); i++)
				{
					System.out.println("Order "+(i+1)+":");
					recievedOrders.get(i).displayOrderDetails();
				}
				System.out.println("Select Order To Deliver It");
				orderNumber = scan.nextInt();
				if(recievedOrders.get(orderNumber-1).isAssigned() == true)
				{
					System.out.println("This Order Has Been Taken\nEnter 1: Select Another Order\nEnter 0: Return");
					retry = scan.nextInt();
				
					switch(retry)
					{
						case 1:
								break;
					
						case 0:
								return;
					
					}
				
			
			    }
				
				
			
			
			
			}while(retry == 1);
			
		}
	}
	//View orders
	
	
}
