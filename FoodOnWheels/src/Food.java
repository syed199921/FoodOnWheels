
public class Food {
	
	//Attributes
	
	private String foodName;
	private double price;
	
	
	//Attributes

	//Constructors
	
	public Food()
	{
		this.foodName = "";
		this.price = 0.0;
	
	}
	
	public Food(String foodName, double price)
	{
		this.foodName = foodName;
		this.price = price;
		
	}
	
	//Constructors
	
	//Setters and getters 
	
	public String getFoodName()
	{
	return this.foodName;
	}
	
	public void setFoodName(String foodName)
	{
		this.foodName = foodName;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	public void setPrice(double foodPrice)
	{
		this.price = foodPrice;
	}
	
	
	//Setters and getters
	
	//Display Food Details
	public void displayFoodDetails() {
		
		System.out.println("Food Name: "+this.foodName+"\nFood's Price: Rs "+this.price);
	}
	//Display Food Details
	
	
}
