package labproject6.persons;

public class Faculty extends Employee{

	//Instance variable rank
	private String rank;
	
	//no-arg constructor
	public Faculty() {
		
		super();
		this.rank = "";
	}
	
	//constructor
	public Faculty(String name, String number, double salary, String rank) {
		
		super(name, number, salary);
		this.rank = rank;
	}

	//getters and setters 
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	//return string of Employee + rank
	public String toString() {
		
		String s = super.toString();
		return s + "\nRank: " + this.rank;
	}
	
	
}
