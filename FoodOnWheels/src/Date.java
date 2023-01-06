
public class Date {

	//Attributes
	private int day;
	private int month;
	private int year;
	
	//Attributes
	
	//Constructors
	public Date()
	{
		this.day=-1;
		this.month = -1;
		this.year=-1;
	}
	
	public Date(int day, int month, int year)
	{
		
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	//Constructors
	
	//Setters and getter
	 public int getDay()
	 {
		 return this.day;
	 }
	 public void setDay(int day)
	 {
		 this.day = day;
	 }

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	 
	//Setters and getter
	
	//Display the date
	 public void displayDate()
	 {
		 System.out.println(this.day+"/"+this.month+"/"+year);
	 }
	//Display the date
}
