package labproject7.writtenworks;

public class TeatWrittenWorks {

	public static void main(String[] args) {
		
		WrittenWork l984 = new WrittenWork("1984", "George Orwell", 1948);
		Novel CnP = new Novel ("Crime and Punishment", "Dostoevsky", 1866, "Psychological fiction", 39);
		ShortStory cthulhu = new ShortStory ("Call of Cthulhu", "H.P. Lovecraft", 1926 , "Horror", 27, false);

		System.out.println(l984 + "\n");
		System.out.println(CnP + "\n");
		System.out.println(cthulhu + "\n");
	}

}
