
public class OrderedFood extends Food {

	//Attributes
	private int foodQuantity;
	//Attributes
	
	//Constructors
	public OrderedFood(){
		super();
		this.foodQuantity = 0;
		
	}
	
	public OrderedFood(String foodName, double foodPrice, int foodQuantity)
	{
		super(foodName,foodPrice);
		this.foodQuantity = foodQuantity;
	}
	
	//Constructors
	
	//Setters and getters
	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}
	
	public int getFoodQuantity() {
		return this.foodQuantity;
	}
	//Setters and getters
}
