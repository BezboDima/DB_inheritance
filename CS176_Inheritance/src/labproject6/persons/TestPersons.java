package labproject6.persons;

public class TestPersons {

	public static void main(String[] args) {
		
		Person pete = new Person();
		pete.setName("Pete");
		System.out.println(pete + "\n");
		
		Student stan = new Student();
		stan.setName("Stan");
		stan.setYear(Student.SUPERSENIOR);
		System.out.println(stan + "\n");
		
		Employee anne = new Employee();
		anne.setName("Anne");
		anne.setOfficeNumber("E153");
		anne.setSalary(50000);
		System.out.println(anne + "\n");
		
		Faculty coddington = new Faculty();
		coddington.setName("Codd");
		coddington.setRank("Associate");
		coddington.setOfficeNumber("BH202");
		coddington.setSalary(70000);
		System.out.println(coddington + "\n");
		
		Staff starr = new Staff();
		starr.setName("Starr");
		starr.setTitle("Grounds Keeper");
		starr.setOfficeNumber("SH102");
		starr.setSalary(40000);
		System.out.println(starr);
	}
}
