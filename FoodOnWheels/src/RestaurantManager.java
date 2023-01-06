
public class RestaurantManager extends Person {//Class
	
	//Attributes
	private static int managerNumber = 0;
	private int managerID;
	private String contactNumber;
	private String address;
	private String password;
	//Attributes
	
	//Constructors
	public RestaurantManager()
	{
		super();
		
		this.managerNumber++;
		this.managerID = managerNumber;
		this.contactNumber = "";
		this.address = "";
		this.password = "";
		
	}
	
	public RestaurantManager(String name, Date dateOfBirth, String CNIC, String contactNumber, String address, String password)
	{
		
		super(name, dateOfBirth,CNIC);
		this.contactNumber = contactNumber;
		this.address = address;
		this.managerNumber++;
		this.managerID = managerNumber;
		this.password = password;
		
	}
	//Constructors
	
	//Setters and getters
	public int getManagerID()
	{
		return managerID;
	}
	
	public void setManagerID(int managerID)
	{
		this.managerID = managerID;
	}

	public static int getManagerNumber() {
		return managerNumber;
	}

	public static void setManagerNumber(int managerNumber) {
		RestaurantManager.managerNumber = managerNumber;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//Setters and getters

}//class
