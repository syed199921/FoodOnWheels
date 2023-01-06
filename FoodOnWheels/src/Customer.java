
public class Customer extends Person {

	//Attributes
	private static int customerNumber = 0;
	private int customerID;
	private String customerAddress;
	private String customerContactNumber;
	private String password;
	//Attributes
	
	//Constructors
	public Customer()
	{
		super();
		this.customerAddress ="";
		this.customerContactNumber = "";
        this.customerNumber++;
		this.customerID = customerNumber;
		this.password ="";
		
	}
	
	public Customer(String name, Date dateOfBirth, String CNIC, String customerAddress, String customerContactNumber, String password)
	{
		super(name, dateOfBirth,CNIC);
		this.customerAddress = customerAddress;
		this.customerContactNumber = customerContactNumber;
		this.customerNumber++;
		this.customerID = customerNumber;
		this.password = password;
		
	}
	//Constructors
	
	//Setters and getters
	public void setCustomerID(int ID)
	{
		this.customerID = ID;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCustomerID()
	{
		return customerID;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerContactNumber() {
		return customerContactNumber;
	}

	public void setCustomerContactNumber(String customerContactNumber) {
		this.customerContactNumber = customerContactNumber;
	}
	
	//Setters and getters

	
}
