package labproject6.persons;

public class Employee extends Person{

	//Instance variable officeNumber and salary
	private String officeNumber;
	private double salary;
	
	//no-arg constructor
	public Employee() {
		
		super();
		this.officeNumber = "";
		this.salary = 0.0;
	}
	
	//constructor
	public Employee(String name, String number, double salary) {
		
		super(name);
		this.officeNumber = number;
		this.salary = salary;
	}

	//getters and setters
	public String getOfficeNumber() {
		return this.officeNumber;
	}

	public void setOfficeNumber(String number) {
		this.officeNumber = number;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//return string of Person + Office Number and Salary
	public String toString() {
		
		String s = super.toString();
		return s + "\nOffice Number: " + this.officeNumber + "\nSalary: " + this.salary;
	}
}
