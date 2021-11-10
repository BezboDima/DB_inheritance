package labproject6.persons;

public class Staff extends Employee{

	//instance variable title
	private String title;
	
	//no-arg constructor
	public Staff() {
		
		super();
		this.title = "";
	}
	
	//constructor
	public Staff(String name, String number, double salary, String title) {
		
		super(name, number, salary);
		this.title = title;
	}

	//getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	//return string of Employee + title
	public String toString() {
		
		String s = super.toString();
		return s + "\nTitle: "  + this.title;
	}
	
	
}
