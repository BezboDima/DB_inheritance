package labproject6.persons;

public class Student extends Person {

	//asign a number to final
	public static final int FRESHMAN = 1;         
	public static final int SOPHOMORE = 2;         
	public static final int JUNIOR = 3;         
	public static final int SENIOR = 4;         
	public static final int SUPERSENIOR = 5;
	
	//Instance variable year
	private int year;
	
	//no-arg constructor
	Student(){
		
		super();
		this.year = FRESHMAN;
	}
	
	//constructor
	Student(String name, int year){
		
		super(name);
		setYear(year);
	}
	
	//set year (only in range of 1-5)
	public void setYear(int year) {
		
		if (year == FRESHMAN) {
			
			this.year = FRESHMAN ;
		}
		else if (year == SOPHOMORE) {
			
			this.year = SOPHOMORE ;
		}
		else if (year == JUNIOR) {
			
			this.year = JUNIOR;
		}
		else if (year == SENIOR) {
			
			this.year = SENIOR;
		}
		else if (year == SUPERSENIOR) {
			
			this.year = SUPERSENIOR;
		}
		else {
			
			System.out.println("Invalid year, year was set to FRESHMAN");
			this.year = FRESHMAN ;
		}
	}
		
	public int getYear() {
		return this.year;
	}
	
	//return string of Person + Year
	public String toString() {
		
		String s = super.toString();
		return s + "\nYear: " + this.year;
	}
		
}

