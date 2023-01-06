import java.util.ArrayList;
import java.util.Scanner;



public class FoodOnWheels {//class

	//Attributes
	
	ArrayList <Customer> customers;
	ArrayList <Restaurant> restaurants;
	ArrayList <Rider> riders;
	
	Scanner scanner;
	
	//Attributes
	
	//Constructors
	
	public FoodOnWheels()
	{
		
		this.restaurants = new ArrayList<Restaurant>();
		this.customers = new ArrayList<Customer>();
		riders = new ArrayList<Rider>();
		
		scanner = new Scanner(System.in);
		
	}
	
	//Constructors
	
	
	
	//Sign up-Customer
	
	public void createCustomerAccount()
	{
		System.out.println("Welcome to Registration Process");
		
		System.out.println("Enter you name");
		String name = scanner.next();
		
		System.out.println("Date of birth details:");
		System.out.println("Enter the day");
		int day = scanner .nextInt();
		System.out.println("Enter the month");
		int month = scanner.nextInt();
		System.out.println("Enter the year");
		int year = scanner.nextInt();
		Date dateOfBirth = new Date(day,month,year);
		
		System.out.println("Enter your CNIC number");
		String CNICNumber = scanner.next();
		
		System.out.println("Enter your address");
		String address = scanner.next();
		
		System.out.println("Enter password for your Account");
		String password = scanner.next();
		
		System.out.println("Enter your contact number");
		String contactNumber = scanner.next();
		
		Customer newCustomer = new Customer(name,dateOfBirth,CNICNumber,address,contactNumber,password);
		customers.add(newCustomer);
		
		System.out.println("You have successfully registered on Food On Wheels");
		
		System.out.println("Account Details:\n\nYour Name: "+name+"\nYour ID: "+newCustomer.getCustomerID()+"\nYour Password: "+password);
		
		System.out.println("Kindly keep safe your credentials\nand remember them to successfully\nlog into the Food On Wheels system and\navail it's services!");
		
	}
	
	//Sign up-customer
	
	//Customer log in
	public Customer CustomerLogIn(int customerID, String password)
	{//method
		
		
		
		if(this.customers.size()==0)
			System.out.println("There are no customers currently registered on Food On Wheels");
		else
		{
			
		for(int i=0;i<this.customers.size();i++)
	 {
		 
		 if( customerID == this.customers.get(i).getCustomerID()) 
		 {
			 
			 if(password.equals(this.customers.get(i).getPassword()))
			 {
				 
			 return this.customers.get(i);
			 
			 }
			 
			 else if(!(password.equals(this.customers.get(i).getPassword())))
			 {
				 
				 System.out.println("Your password is not correct");
				 return null;
				 
			 }
			 
		 }
		 
		 else if( !(customerID == this.customers.get(i).getCustomerID())) 
		 {
			 
			 System.out.println("The Customer ID is not correct");
			 return null;
			 
		 }
		 
		 
	 }
	 
		}
		return null;
		
	}//method
	
	//Customer log in
	
	//Restaurant sign up
	
	public void restaurantSignUp() {
		System.out.println("Welcome To The Registration Process");
		System.out.println();
		System.out.println("Enter the name of the restaurant");
		String restaurantName = scanner.next();
		System.out.println("Enter the location of the restaurant");
		String location = scanner.next();
		System.out.println("Enter the contact number of the restauarnt");
		String contactNumber = scanner.next();
		System.out.println();
		
		System.out.println("Restaurant's Manager's Information\n");
		System.out.println("Enter the name of the restaurant manager");
		String managerName = scanner.next();
		System.out.println("Date Of Birth Information:");
		System.out.println("Enter the day");
		int day = scanner.nextInt();
		System.out.println("Enter the month");
		int month = scanner.nextInt();
		System.out.println("Enetr the year");
		int year = scanner.nextInt();
		Date dateOfBirth = new Date(day, month,year);
		System.out.println("Enter your contact number");
		String managerContactNumber = scanner.next();
		System.out.println("Enter your CNIC");
		String managerCNIC = scanner.next();
		System.out.println("Enter your address");
		String managersAddress = scanner.next();
		System.out.println("Enter your password");
        String managerPassword = scanner.next();
        
        RestaurantManager restaurantManager = new RestaurantManager(managerName,dateOfBirth,managerCNIC,managerContactNumber,managersAddress, managerPassword);
        
        Restaurant newRestaurant = new Restaurant(restaurantName,location,contactNumber,restaurantManager);
        restaurants.add(newRestaurant);
        
        System.out.println();
        System.out.println("Your Restaurant is successfully registered on Food On Wheels\n");
        System.out.println("Account Details:\n"+"Your Name: "+ newRestaurant.getRestaurantManager().getName()+ "\nYour ID: "+ newRestaurant.getRestaurantManager().getManagerID());
        System.out.println("Your Password: "+newRestaurant.getRestaurantManager().getPassword());
        System.out.println("Kindly keep safe your credentials\nand remember them to successfully\nlog into the Food On Wheels system and\navail it's services!");
	
	
	}
	//Restaurant sign up

	//Restaurant log in
	public Restaurant restaurantLogIn(int managerID, String managerPassword)
	{
		
		if(this.restaurants.size() == 0)
			System.out.println("There are no restaurants curently registered on Food On Wheels");
		
		else
		{
			
			for(int i=0; i < this.restaurants.size();i++)
			{
				
			if(managerID == this.restaurants.get(i).getRestaurantManager().getManagerID())
			{
				
				if(managerPassword.equals(this.restaurants.get(i).getRestaurantManager().getPassword()))
					return this.restaurants.get(i);
				else
				{
					System.out.println("Your password is not correct");
					return null;
				}
					
			}
			
			else if(!(managerID == this.restaurants.get(i).getRestaurantManager().getManagerID()))
			{
				System.out.println("The manager ID is not correct");
				return null;
			}
			
			}
			
		}
		
		return null;
		
	}
	//Restaurant log in
	
	//Rider sign up
	public void createRiderAccount()
	{
		System.out.println("Rider Sign Up");
		System.out.println("Enter your name");
		String riderName = scanner.next();
		System.out.println("Enter your CNIC");
		String riderCNIC = scanner.next();
		System.out.println("Date Of Birth Details:");
		System.out.println("Enter the day");
		int day = scanner.nextInt();
		System.out.println("Enter the month");
		int month = scanner.nextInt();
		System.out.println("Enter the year");
		int year = scanner.nextInt();
		
		Date dateOfBirth = new Date(day,month,year);
		System.out.println("Enter your address");
		String riderAddress = scanner.next();
		System.out.println("Enter your contact number");
		String contactNumber = scanner.next();
		System.out.println("Enter your password");
		String password = scanner.next();
		
		Rider newRider = new Rider(riderName,dateOfBirth,riderCNIC,contactNumber,riderAddress,password);
		
		riders.add(newRider);
		
		System.out.println("You have successfully registerred on Food On Wheels");
		System.out.println("Your Account Details:");
		System.out.println("Name: "+newRider.getName()+"\nID: "+newRider.getRiderID()+"\nPassword: "+newRider.getPassword());
		
	}
	//Rider sign up
	
	// Rider sign in
	public Rider riderSignIn()
	{
		Rider riderUser = null;
		
		if(this.riders.size() == 0)
		{
			System.out.println("You are not regiestered with Food On Wheels");
			return riderUser;
			
		}
		
		else
		{
			
			
			
			System.out.println("Enter your ID");
			int riderID = scanner.nextInt();
			System.out.println("Enter your password");
			String password = scanner.next();
			
			for(int i = 0; i < this.riders.size();i++)
			{
				
				if( ( riderID == this.riders.get(i).getRiderID() ) && (password.equals(this.riders.get(i).getPassword())) )
				{
					riderUser = this.riders.get(i);
					break;
				}
				
			}
			
			
			
			
		}
		return riderUser;
	}
	//Rider sign in
	
	//Setters and getters

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public ArrayList<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(ArrayList<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public ArrayList<Rider> getRiders() {
		return riders;
	}

	public void setRiders(ArrayList<Rider> riders) {
		this.riders = riders;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	
	
	//Setters and getters
	
	//Update restaurant details

	public void updateRestaurantInformation(Restaurant restaurant) {
		
		for(int i= 0;i<this.restaurants.size();i++)
		{
			if(this.restaurants.get(i).getRestaurantManager().getManagerID() ==  restaurant.getRestaurantManager().getManagerID())
			{
				
				this.restaurants.remove(i);
				this.restaurants.add(restaurant);
				
			}
		}
			
		
	}
	
	
	//Update restaurant details
	
	//Get the specified restaurant
	public Restaurant getTheRestaurant(int restaurantNumber)
	{
		return this.restaurants.get(restaurantNumber-1);
	}
	//Get the specified restaurant
	
	//Display the details of all the registered restaurants
	public void displayAllRestaurantsDetails()
	{
		System.out.println("Restaurants Availible:\n");
		for(int i= 0;i < this.restaurants.size();i++)
		{
			System.out.println("Restaurant "+(i+1)+":");
			this.restaurants.get(i).displayRestaurantDetails();
		}
	}
	//Display the details of all the registered restaurants
	
	
	
	
	
	
}//class
