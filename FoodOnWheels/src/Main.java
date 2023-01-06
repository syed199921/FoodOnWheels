import java.util.Scanner;

public class Main {//class
	
	//You left at "View Food Orders" function


	public static void main(String[] args) {//main
		
		//Variables
		Scanner scan = new Scanner(System.in);
		int riderReturn = -1;
		int modeChoice = -1;
		int customerChoice = -1;
		int signupChoice = -1;
		int exitChoice1 = -1;
		int restaurantChoice = -1;
		int restaurantSigupChoice = -1;
		int managerID = -1;
		int restaurantChoice1 = -1;
		int addFoodChoice = -1;
		int restaurantLogInChoice = -1;
		int retryChoice = -1;
		int modifyChoice = -1;
		int displayChoice = -1;
		int endChoice = -1;
		FoodOnWheels foodOnWheels = new FoodOnWheels();
		Restaurant restaurant;
		int returnChoice = -1;
		int customerOption = -1;
		int orderReturn = -1;
		 int restaurantSelection = -1;
		 int orderChoice = -1;
		 int foodDisplayChoice = -1;
		 int restaurantSelection1 = -1;
		 int displayReturn = -1;
		 int riderModeChoice  = -1;
		 Rider rider = null;
		//Variables
		
		do
		{
			
		
		System.out.println("-----Welcome To Food On Wheels: The One-Stop Application For Ordering Your Favourite Food-----");
		System.out.println("Please select the user mode:");
		System.out.println("Enter 1: Customer Mode\nEnter 2: Admin Mode\nEnter 3: Restaurant's Manager Mode\nEnter 4: Rider Mode\nEnter 0: Exit");
        modeChoice = scan.nextInt();
        
        
        //User mode switch starts
        
        switch(modeChoice)
        {//Switch
        
     
        
        //Exit-starts
        
                case 0:
                {
        	
                	System.out.println("Thank you for visiting Food On Wheels. See you soon. Good Bye!");
                	System.exit(0);
        	
                }
        
      //Exit- ends
        
                break;  
                
                //Rider mode
                case 4:
                {//case 4
                	do
                	{
                
                	System.out.println("Welcome To Rider Mode");
                	System.out.println("Enter 1: Log In\nEnter 2: Sign Up\nEnter 0: Return");
                	riderModeChoice = scan.nextInt();
                	
                	//Rider switch
                	
                	switch(riderModeChoice)
                	{
                	
                	//Rider sign up
                	
                	case 2:
                	{
                		foodOnWheels.createRiderAccount();
                		System.out.println("Enter 0: Return");
                		riderReturn = scan.nextInt();
                	}
                	
                	//Rider sign up
                	
                	break;
                	
                	//Rider 
                	
                	//Return
                	case 0:
                	{
                		break;
                	}
                	//Return
                	
                	
                	
                	//Rider sign in
                	
                	case 1:
                	{
                		rider = foodOnWheels.riderSignIn();
                		
                		if(rider == null)
                		{
                			System.out.println("You are not registered on Food On Wheels\nEnter 0: Return");
                			 riderReturn = scan.nextInt();
                		}
                		
                		else
                		{
                			System.out.println("Welcome "+rider.getName());
                			System.out.println("Enter 1: View Orders");
                		}
                	}
                	
                	//Rider sign in
                	
                	break;
                	}
                	
                	//Rider switch
                	
                	if(riderModeChoice == 0)
                		break;
                	
                	}while(riderReturn == 0);
                	
                }// case 4
                
                //Rider mode
        
                break;
                
                //Customer mode starts
                
                case 1:
                {//case 1
                	
                	do
                	{
        	
        	      System.out.println("------------------Welcome To Customer Mode------------------");
        	      System.out.println("Enter 1: Log in\nEnter 2: Sign up\nEnter 0: Return to Main Menu");
        	      customerChoice = scan.nextInt();
        	      
        	      switch(customerChoice)
        	      {// case1 switch  starts
        	      
        	      //log in starts
        	      
        	      case 1:
        	      {
        	    	  
        	    	do
        	    	{
        	    		
        	    	
        	    	  System.out.println("Enter the customer ID");
        	    	  int customerID = scan.nextInt();
        	    	  System.out.println("Enter your password");
        	    	  String password = scan.next();
        	    	  
        	    	  Customer customer = foodOnWheels.CustomerLogIn(customerID, password);
        	    	  
        	    	  if(customer == null)
        	    	  {
        	    		  System.out.println("Enter 1: Retry\nEnter 0: Return to Customer Mode");
        	    	       exitChoice1 = scan.nextInt();
        	    	       
        	    	       
        	    	  }
        	    	  else if(!(customer == null))
        	    	  {
        	    		 
        	    		  do 
        	    		  {
        	    			  
        	    		  System.out.println("Welcome "+ customer.getName());
        	    		  System.out.println("Enter 1: Place An Order\nEnter 2: Cancel Order\nEnter 3: View Food Details\nEnter 0: Return");
        	    		  customerOption  = scan.nextInt();
        	    		  
        	    		  //Customer choice switch
        	    		  
        	    		  switch(customerOption) 
        	    		  {//Switch
        	    		  
        	    		  //View food details
        	    		  case 3:
        	    		  {
        	    			 if(foodOnWheels.getRestaurants().size() == 0)
        	    			 {
        	    				 System.out.println("There are no restaurants registered on Food On Wheels. Apologies\nEnter 0: Return");
        	    				 foodDisplayChoice = scan.nextInt();
        	    			 }
        	    			 
        	    			 else
        	    			 {
        	    				 do
        	    				 {
        	    				 foodOnWheels.displayAllRestaurantsDetails();
        	    				 System.out.println("Select A Restaurant");
        	    				 restaurantSelection1 = scan.nextInt();
        	    				 
        	    				 Restaurant restaurantChosen = foodOnWheels.getTheRestaurant(restaurantSelection1);
        	    				 
        	    				 restaurantChosen.displayFoodDetails();
        	    				 System.out.println("Enter 1: Display Food Details Of Another Restaurant\nEnter 0: Return");
        	    				 displayReturn = scan.nextInt();
        	    				 
        	    				 if(displayReturn == 0)
        	    					 break;
        	    				 
        	    				 }while(displayReturn == 1);
        	    			 }
        	    		  }
        	    		  //View food details
        	    		  
        	    		  break;
        	    		  
        	    		  //Cancel an order
        	    		  case 2:
        	    		  {
        	    			  if(foodOnWheels.getRestaurants().size() == 0)
        	    			  {
        	    				  System.out.println("You have not placed any order through Food On Wheels\nEnter 0: Return");
        	    				  orderReturn = scan.nextInt(); 
        	    			  }
        	    			  
        	    			  else
        	    			  {
        	    				  do
        	    				  {
        	    				  
        	    				 foodOnWheels.displayAllRestaurantsDetails();
        	    				  
        	    				  System.out.println("Select a restaurant");
        	    				  restaurantSelection1 = scan.nextInt();
        	    				  
        	    				  Restaurant restaurantSelected = foodOnWheels.getTheRestaurant(restaurantSelection1);
        	    				  
        	    				  restaurantSelected.cancelOrder(customer);
        	    				  
        	    				  
        	    				  System.out.println("Enter 1: Cancel another Order\nEnter 0: Return");
        	    				  orderReturn = scan.nextInt();
        	    				  
        	    				  if(orderReturn == 0)
        	    				  {
        	    					  break;
        	    				  }
        	    				  
        	    				  }while( orderReturn == 1);
        	    				 
        	    			  }
        	    		  }
        	    		  //Cancel an order
        	    		  
        	    		  break;
        	    		  
        	    		  // Return
        	    		  case 0: 
        	    		  {
        	    			
        	    			break;
        	    			
        	    		  }
        	    		  // Return
        	    		  
        	    		  //Place an order
        	    		  
        	    		  case 1:
        	    		  {
        	    			  
        	    			  if(foodOnWheels.getRestaurants().size() == 0)
        	    			  {
        	    				  System.out.println("There are no restaurants to order food from. Apologies\nEnter 0: Return");
        	    				  orderReturn = scan.nextInt(); 
        	    			  }
        	    			  
        	    			  else
        	    			  {
        	    				  do
        	    				  {
        	    				  
        	    				 foodOnWheels.displayAllRestaurantsDetails();
        	    				  
        	    				  System.out.println("Select a restaurant");
        	    				  restaurantSelection1 = scan.nextInt();
        	    				  
        	    				  Restaurant restaurantSelected = foodOnWheels.getTheRestaurant(restaurantSelection1);
        	    				  
        	    				  restaurantSelected.placeAnOrder(customer);
        	    				  
        	    				  
        	    				  System.out.println("Enter 1: Place Another Order\nEnter 0: Return");
        	    				  orderReturn = scan.nextInt();
        	    				  
        	    				  if(orderReturn == 0)
        	    				  {
        	    					  break;
        	    				  }
        	    				  
        	    				  }while( orderReturn == 1);
        	    				 
        	    			  }
        	    			  
        	    			  
        	    		  }
        	    		  
        	    		  //Place an order
        	    		  
        	    		  break;
        	    		  
        	    		  
        	    		  
        	    		  }//switch
        	    		  
        	    		  //Customer choice switch
        	    		  
        	    		  if(customerOption == 0)
           	    		   break;

        	    	  }while(orderReturn == 0 || orderChoice == 0||displayReturn == 0);
        	    	  
        	    	  }
        	    	  
        	    	   if(customerOption == 0)
        	    		   break;
        	    	   
        	    	}while(exitChoice1 == 1);
        	    	  
        	      }
        	      
        	      // log in ends
        	      
        	      break;
        	      
        	      //Sign up
        	      
        	      case 2:
        	      {
        	    	
        	    	foodOnWheels.createCustomerAccount();
        	    	
        	    	System.out.println("Enter 0: Return to Customer Mode ");
        	    	 signupChoice = scan.nextInt(); 
        	    	  
        	      }
        	      
        	      //Sign up
        	      
        	      break;
        	      
        	      //Return to main menu
        	      
        	      case 0:
        	    	  
        	    	  break;
        	    	  
        	    	//Return to main menu
        	      
        	      }// case1 switch ends
        	
        	      if(customerChoice == 0)
        	    	  break;
        	      
                	}while(exitChoice1 == 0 || signupChoice == 0 || customerOption == 0|| foodDisplayChoice == 0);
        	     
        	      
        	      
        	
                }//case 1
                
                break;
        
      //Customer mode ends
                
                //Restaurant Mode Starts
                
                case 3:
                {
                	
                	do
                	{
                		
                	
                	System.out.println("Welcome to Restaurant Mode");
                	System.out.println("Enter 1: Log In\nEnter 2: Sign Up\nEnter 3: Return To Main Menu");
                	restaurantChoice = scan.nextInt();
                	
                	switch(restaurantChoice)
                	{//Restaurant switch
                	
                	
                	
                	//Sign up
                	
                	case 2:
                	{
                		
                	foodOnWheels.restaurantSignUp();
                	System.out.println("Enter 0: Return To Restaurant Mode");
                	restaurantSigupChoice = scan.nextInt();
                	
                	
                	}
                	
                	//Sign up
                	
                	break;
                	
                	//Return to main menu
                	
                	case 3:
                	{
                		break;
                	}
                	
                	//Return to main menu
                	
                	//Log in
                	
                	case 1:
                	{
                		
                		do
                		{
                			
                		
                		System.out.println("Enter your ID");
                		managerID = scan.nextInt();
                		System.out.println("Enter your password");
                		String managerPassword = scan.next();
                		
                		restaurant = foodOnWheels.restaurantLogIn(managerID, managerPassword);
                		
                		if(restaurant == null)
                		{
                			System.out.println("\nEnter 1: Retry\nEnter 0: Return to Restaurant Manager Mode");
                		
                			restaurantChoice1 = scan.nextInt();
                			
                		}
                		
                		else if(restaurant != null)
                		{
                			
                			System.out.println("Welcome "+ restaurant.getRestaurantManager().getName());
                			
                			do
                			{
                				
                			
                			System.out.println("\nEnter 1: Add Food Details\nEnter 2: Update Food Details\nEnter 3: Remove Food");
                			System.out.println("Enter 4: View Food Items\nEnter 5: View Food Orders\nEnter 0: Return To Restaurant Mode");
                			restaurantLogInChoice = scan.nextInt();
                			
                			switch(restaurantLogInChoice)
                			{//restaurant log-in switch starts
                			
                			//View Food Orders
                			
                			case 5:
                			{
                				restaurant.viewFoodOrders();
                				System.out.println("Enter 0: Return");
                				returnChoice  = scan.nextInt();
                			}
             
                			//View Food Orders
                			 
                			break;
                				 
                			//Add food details-starts
                			case 1:
                			{
                			
                				do
                				{
                				System.out.println("Add Food Details:");
                				restaurant.addFoodDetails();
                				System.out.println("\nEnter 1: Add Another Food Item\nEnter 0: Return");
                				retryChoice = scan.nextInt();
                				
                				if(retryChoice == 0)
                				{
                					break;
//                					foodOnWheels.updateRestaurantInformation(restaurant);
                				}
                				
                				}while(retryChoice == 1);
                				//Continue from here
                			}
                			
                			//Add food details-ends
                			
                			break;
                			
                			//Return to restaurant mode
                			case 0:
                			{
                				break;
                			}
                			
                			//Return to restaurant mode
                			
                			//Update food's details
                			case 2:
                			{
                			
                				
                					
                				
                				restaurant.updateFoodDetail();
                				modifyChoice = scan.nextInt();
                				
                				
                			}
                			//Update food's details
                			
                			break;
                			
                			// View food items
                			case 4:
                			{
                				
                				restaurant.displayFoodDetails();
                				displayChoice = scan.nextInt();
                				
                			}
                			// View food items
                			break;
                			
                			// Remove food
                			case 3:
                			{
                				do
                				{
                				 endChoice = restaurant.removeFoodItem();
                				}while(endChoice == 1);
                			}
                			
                			// Remove food
                			
                			break;
                			
                			}//restaurant log-in switch ends
                			
                			if(restaurantLogInChoice == 0)
                				break;
                			
                			}while(retryChoice == 0 || modifyChoice == 0 || displayChoice == 0 || endChoice == 0 || returnChoice == 0 );
                			
                		}
                		

                		 if(restaurantLogInChoice == 0)
                			 break;
                		 
                		}while(restaurantChoice1 == 1);
                		
                	
                		foodOnWheels.updateRestaurantInformation(restaurant);
                	}
                	
                	//Log in
                	
                	break;
                	
                	
                	
                	}//Restaurant switch
                	
                	if(restaurantChoice == 3)
                		break;
                	
                	}while(restaurantSigupChoice == 0 || restaurantChoice1 == 0 || addFoodChoice == 0|| restaurantLogInChoice == 0 );
                	
                }
        
               //Restaurant Mode ends
                
                break;
        
        }//switch
		
      //User mode switch ends
        
		}while(customerChoice == 0 || signupChoice == 0 || restaurantChoice == 3 || restaurantChoice1 == 0 || riderModeChoice == 0);
	
	}//main
	

}//class
