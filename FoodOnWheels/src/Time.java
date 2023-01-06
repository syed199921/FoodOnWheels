
public class Time {

	//Attributes
	private int hours;
	private int minutes;
	private String amORpm;
	//Attributes
	
	//COnstructors
	public Time() {
		
		this.hours = -1;
		this.minutes = -1;
		this.amORpm = "";
	}
	
	public Time(int hours, int minutes, String amORpm) {
		this.hours = hours;
		this.minutes = minutes;
		this.amORpm  = amORpm;
	}
	//COnstructors
	
	//Setters and getters
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int getHours() {
		return this.hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public String getAmORpm() {
		return amORpm;
	}

	public void setAmORpm(String amORpm) {
		this.amORpm = amORpm;
	}
	
	
	
	//Setters and getters
	
	//Display time
	public void displayTime()
	{
		System.out.println(this.hours+":"+this.minutes+" "+this.amORpm.toUpperCase() );
	}
	//Display time
	
	public static void main(String [] args) {
		Time currentTime = new Time(3, 49, "pm");
		System.out.print("Current Time: ");
		currentTime.displayTime();
	}
	
}
