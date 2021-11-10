package labproject6.persons;

public class Person {
	
	//Instance variable name
	private String name;
	
	//no-arg constructor
	Person(){
		
		this.name = "";
	}
	
	//arg constructor
	Person(String name){
		
		this.name = name;
	}
	
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//return name of the class and "name" to string
	public String toString() {
		
		return getClass() + "\nName: " + this.name;
	}
	
	
}
