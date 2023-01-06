import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
	
	//Attributes
	private static final int maximumFoodItems = 15;
	private String restaurantName;
	private String location;
	private String contactNumber;
	private RestaurantManager restaurantManager;
	private ArrayList<Food> foodItems;
	private String restaurantMenu;
	private ArrayList<Order> ordersRecieved;
	private ArrayList<Order> ordersHistory;
	Scanner scan;
	//Attributes
	
	//Constructors
	public Restaurant()
	{
		this.restaurantName = "";
		this.location = "";
		this.contactNumber = "";
		this.restaurantManager = new RestaurantManager();
		this.foodItems = new ArrayList<Food>();
		this.restaurantMenu = "";
		this.ordersRecieved = new ArrayList<Order>();
		scan = new Scanner(System.in);
		ordersHistory = new ArrayList<Order>();
	}
	
	public Restaurant(String restaurantName, String location, String contactNumber, RestaurantManager restaurantManager)
	{
		
		this.restaurantName = restaurantName;
		this.location = location;
		this.contactNumber = contactNumber;
		this.restaurantManager = restaurantManager;
		this.restaurantMenu = "";
		scan = new Scanner(System.in);
		this.foodItems = new ArrayList<Food>();
		ordersRecieved = new ArrayList<Order>();
		ordersHistory = new ArrayList<Order>();
		
	}
	//Constructors
	
	//Setters and getters
	
	public ArrayList<Order> getOrdersHistory()
	{
		return this.ordersHistory;
	}
	
	public void setOrdersHistory(ArrayList<Order> ordersHistory) {
		this.ordersHistory = ordersHistory;
	}
	
	public String getRestaurantName()
	{
		return restaurantName;
	}
	
	public void setRestaurantName(String restaurantName)
	{
		this.restaurantName = restaurantName;
		
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public RestaurantManager getRestaurantManager() {
		return restaurantManager;
	}

	public void setRestaurantManager(RestaurantManager restaurantManager) {
		this.restaurantManager = restaurantManager;
	}

	public ArrayList<Food> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(ArrayList<Food> foodItems) {
		this.foodItems = foodItems;
	}

	public String getRestaurantMenu() {
		return restaurantMenu;
	}

	public void setRestaurantMenu(String restaurantMenu) {
		this.restaurantMenu = restaurantMenu;
	}

	public ArrayList<Order> getOrdersRecieved() {
		return ordersRecieved;
	}

	public void setOrdersRecieved(ArrayList<Order> ordersRecieved) {
		this.ordersRecieved = ordersRecieved;
	}

	public static int getMaximumfooditems() {
		return maximumFoodItems;
	}
	
	//Setters and getters
	
	//Add food details
		public void addFoodDetails()
		{
			
			if(this.foodItems == null)
			{
				System.out.println("Adding Food Details:");
				System.out.println("Enter the name of the food");
				String foodName = scan.next();
				System.out.println("Enter the price of the food");
				double foodPrice = scan.nextDouble();
				
				Food foodItem1 = new Food(foodName,foodPrice);
				
				this.foodItems.add(foodItem1);
				
				System.out.println("Food Item Successfully Added");
				System.out.println("Details Of Food Added:");
				foodItem1.displayFoodDetails();	
			}
		
			else if(this.foodItems.size() == this.maximumFoodItems)
				System.out.println("The Food Limit of 15 Has Been Reached.\nYou Cannot Added Any Further Food Items.");
			
			else if(foodItems.size() >=0 && foodItems.size() < this.maximumFoodItems  )
			{
				
			System.out.println("Adding Food Details:");
			System.out.println("Enter the name of the food");
			String foodName = scan.next();
			System.out.println("Enter the price of the food");
			double foodPrice = scan.nextDouble();
			
			Food foodItem1 = new Food(foodName,foodPrice);
			
			this.foodItems.add(foodItem1);
			
			System.out.println("Food Item Successfully Added");
			System.out.println("Details Of Food Added:");
			foodItem1.displayFoodDetails();
			
			}
			
		}
		
	
		
		//Add food details
		
		//Update Food Details
		public void updateFoodDetail()
		{
			if(this.foodItems.size() == 0)
				System.out.println("There are no food items\nEnter 0: Return");
			else
			{
				
				
				
				System.out.println("Food Details:\n");
				for(int i=0;i<foodItems.size();i++)
				{
					System.out.println("Food Item "+(i+1)+":");
					foodItems.get(i).displayFoodDetails();
				}
				
				System.out.println("Select A Food To Change Its Details");
				int modifyChoice = scan.nextInt();
				
				System.out.println("What would you like to change about the food");
				System.out.println("Enter 1: Food's Name\nEnter 2: Food's Price");
				int modifyChoice1 = scan.nextInt();
				 
				switch(modifyChoice1)
				{//Switch
				
				//Change food's name-start
				case 1:
				{
					System.out.println("Enter the new name of the food");
					String newFoodName = scan.next();
					foodItems.get(modifyChoice-1).setFoodName(newFoodName);
					System.out.println("Food's name sucessfully changed");
					System.out.println("Enter 0: Return");
					
				}
				
				break;
				//Change food's name-end
				
				//Change Food's Price-start
				
				case 2:
				{
					System.out.println("Enter the new price of the food");
					double newFoodPrice = scan.nextDouble();
					this.foodItems.get(modifyChoice-1).setPrice(newFoodPrice);
					System.out.println("Food's price successfully changed");
					System.out.println("Enter 0: Return");
				}
				
				break;
				
				//Change Food's Price-end
				
				}//Switch
				
				
				
			}
			
		}
		//Update Food Details
		
		//View All the food items
		public void displayFoodDetails()
		{
			
			     if(this.foodItems.size() == 0)
			    	 System.out.println("There are no food items\nEnter 0: Return");
			     
			     else if(this.foodItems.size() != 0)
			     	{
			    	 	System.out.println("Food Items Details:");
				
			    	 	for(int i = 0; i< foodItems.size();i++)
			    	 	{
					System.out.println("Food Item "+ (i+1)+":");
					foodItems.get(i).displayFoodDetails();
			    	 	}
				
			    	 	System.out.println("Enter 0: Return");
				
			     	}
			
			
			
		}
		//View All the food items
		
		//Remove a food item
		
		public int removeFoodItem()
		{
			int endChoice = -1;
			
			if(this.foodItems.size() == 0)
			{
				System.out.println("There are no food items to remove\nEnter 0 : Return");
				endChoice = scan.nextInt();
			
			}
			else if(this.foodItems.size() != 0)
			{
				System.out.println("Food Items Details:");
				
	    	 	for(int i = 0; i< foodItems.size();i++)
	    	 	{
	    	 		System.out.println("Food Item "+ (i+1)+":");
	    	 		foodItems.get(i).displayFoodDetails();
	    	 	}
	    	 	System.out.println("\nWhich food item would you like to remove?");
	    	 	int removeChoice = scan.nextInt();
				this.foodItems.remove( removeChoice -1 );
				System.out.println("Food item successfully removed.\nEnter 1: Remove Another Food Item\nEnter 0: Return");
				endChoice = scan.nextInt();
			}
			
			return endChoice;
		}
		
		//Remove a food item
		
		//View Orders
		public void viewFoodOrders() {
			
			if(this.ordersRecieved.size() == 0) {
				System.out.println("There are no orders received yet.");
				
			}
			
			else if(this.ordersRecieved.size() != 0) {
				
				for(int i = 0; i<this.ordersRecieved.size();i++) {
					
					this.ordersRecieved.get(i).displayOrderDetails();
					System.out.println("<---------------------------------------------------->");
					
				}
			}
		
		}
		//View Orders
		
		//Place an order
		
		public void placeAnOrder(Customer customer)
		{
			ArrayList <OrderedFood> orderedFoodItems = new ArrayList<OrderedFood>();
			int endChoice = -1;
			Time timeOfDelivery = null;
			boolean isDeliveryTimeSame = false;
			
			do
			{
			
			System.out.println("Food Items:");
			
			for(int i = 0; i< foodItems.size();i++)
			{
				
				System.out.println("Food Item "+(i+1)+":");
				foodItems.get(i).displayFoodDetails();
				
			}
			
			System.out.println("Which food item would you like to order");
			int foodChoice = scan.nextInt();
			System.out.println("Quantity of food you would like to order");
			int foodQuantity = scan.nextInt();
			
			OrderedFood foodOrdered = new OrderedFood(foodItems.get(foodChoice-1).getFoodName(),foodItems.get(foodChoice-1).getPrice(),foodQuantity);
			
			orderedFoodItems.add(foodOrdered);
			
			System.out.println("Would you like to order another food item\nEnter 1: Yes\nEnter 0: No");
			
			endChoice = scan.nextInt();
			
			}while(endChoice == 1);
			
			
			do
			{
				isDeliveryTimeSame = false;
			System.out.println("At what time would you like your order to be delivered to you");
			System.out.println("Hours?");
			int hours = scan.nextInt();
			System.out.println("Minutes?");
			int minutes = scan.nextInt();
			System.out.println("AM or PM");
			String amORpm = scan.next();
			
			timeOfDelivery = new Time(hours,minutes,amORpm);
			
			if(this.ordersRecieved.size() != 0)
			{
				for(int i = 0;i < this.ordersRecieved.size();i++)
				{
					if( (timeOfDelivery.getHours() == this.ordersRecieved.get(i).getTimeOfDelivery().getHours() ) && ( timeOfDelivery.getMinutes() == this.ordersRecieved.get(i).getTimeOfDelivery().getMinutes() ) && ( timeOfDelivery.getAmORpm().equalsIgnoreCase(this.ordersRecieved.get(i).getTimeOfDelivery().getAmORpm()) ))
					{
						isDeliveryTimeSame  = true;
						System.out.println("This time of delivery is already taken, kindly chose another time");
						break;
					}
				}
			}
			
			}while(isDeliveryTimeSame == true);
			
			
			Order order = new Order(customer, timeOfDelivery,orderedFoodItems);
			
			
			
			ordersRecieved.add(order);
			ordersHistory.add(order);
			System.out.println("Order Successfully Placed");
			System.out.println("Order Details:");
			System.out.println("Customer Name: "+order.getCustomer().getName()+"\nCustomer ID: "+order.getCustomer().getCustomerID());
			System.out.print("Time Of Delivery: ");
			order.getTimeOfDelivery().displayTime();
			order.generateBill(order);
			order.displayOrderBill();
			
			
		
		}
		//Place an order
		
		//Display restaurant details
		public void displayRestaurantDetails()
		{
			System.out.println("Restaurant Name: "+this.restaurantName+"\nRestaurant Contact Number: "+this.contactNumber+"\nRestaurant Location: "+ this.location);
		}
		//Display restaurant details
		
		//Display the menu
		public int displayMenu()
		{
			int customerChoice = -1;
			if(foodItems.size() == 0)
			{
				System.out.println("There are no food items\nEnter 0: Return");
				customerChoice = scan.nextInt();
			}
			else
			{
				this.restaurantMenu = "Menu:\n\nFood's Name										Food's Price\n";
				for(int i = 0; i < this.foodItems.size();i++)
				{
					this.restaurantMenu = ""+foodItems.get(i).getFoodName()+"										"+this.foodItems.get(i).getPrice()+"\n";
				}
				
				System.out.println(this.restaurantMenu);
				System.out.println("Enter 0: Return");
				
			
			}
			
			
			
			return customerChoice;
		}
		//Display the menu
		
		//Cancel an order
		public void cancelOrder( Customer customer)
		{
			boolean areOrdersPresent = false;
			
			
			if(this.ordersRecieved.size() == 0)
			{
				System.out.println("You have no orders with this restaurant");
			}
			
			else
			{
				
				for(int i = 0; i<this.ordersRecieved.size();i++)
				{
					if(this.ordersRecieved.get(i).getCustomer().getCustomerID() == customer.getCustomerID())
					{
						areOrdersPresent = true;
						break;
					}
				}
				
				if(areOrdersPresent == true)
				{
					System.out.println("Your Orders:");
					for(int i = 0,j = 1; i<this.ordersRecieved.size();i++)
					{
						if(this.ordersRecieved.get(i).getCustomer().getCustomerID() == customer.getCustomerID())
						{
							
							System.out.println("Order "+ (j)+":");
							this.ordersRecieved.get(i).displayOrderDetails();
							
							j++;
						}
					}
					
					System.out.println("Which order would you like to cancel\nPlease enter the Order ID");
					int orderCancelChoice = scan.nextInt();
					
					for(int i = 0; i<this.ordersRecieved.size();i++)
					{
						if(orderCancelChoice == this.ordersRecieved.get(i).getOrderID())
						{
							this.ordersRecieved.remove(orderCancelChoice -1);
							System.out.println("Order Successfully Cancelled.\nEnter 0: Return");
							break;
						}
					}
				}
				
				else
				{
					System.out.println("You have no orders with this restaurant");
				}
			}
		}
		//Cancel an order
		
		//Generate bill
		public void generateBill()
		{
			if(this.ordersRecieved.size() == 0)
			{
				System.out.println("Orders have not been received yet.");
			}
			else
			{
				
				for(int i = 0; i < this.ordersRecieved.size();i++)
				{
				
					this.ordersRecieved.get(i).displayOrderDetails();
				
				}
				System.out.println("\nSelct an order to generate bill for it");
				int orderSelected = scan.nextInt();
				
				if(this.ordersRecieved.get(orderSelected-1).getOrderBill() != null)
					System.out.println("Bill for this order has already been generated");
				else
				{
					
					this.ordersRecieved.get(orderSelected-1).generateBill(this.ordersRecieved.get(orderSelected-1));
					
				}
				
			}
			
		}
		//Generate bill
		
		
		

}
