
public class Person {

	//Attributes
	private String name;
	private Date dateOfBirth;
	private String CNIC;
	//Attributes
	
	//Constructors
	public Person()
	{
		this.name = "";
		this.dateOfBirth = new Date();
		this.CNIC = "";
	}
	
	public Person(String name, Date dateOfBirth, String CNIC)
	{
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.CNIC = CNIC;
	}
	//Constructors
	
	//Setters and getters
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCNIC() {
		return CNIC;
	}

	public void setCNIC(String cNIC) {
		CNIC = cNIC;
	}
	
	//Setters and getters
}
