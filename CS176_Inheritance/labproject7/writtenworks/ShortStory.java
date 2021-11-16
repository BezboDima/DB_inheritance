package labproject7.writtenworks;

public class ShortStory extends WrittenWork{

	private String genre;
	private int paragraphs;
	private boolean hasPics;
	
	public ShortStory(String title, String author, int year, String genre, int paragraphs, boolean hasPics) {
		 super(title, author, year);
	     setGenre( genre );
	     setParagraphs( paragraphs );
	     setHasPics( hasPics );
	 }

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getParagraphs() {
		return paragraphs;
	}

	public void setParagraphs(int paragraphs) {
		this.paragraphs = paragraphs;
	}

	public boolean isHasPics() {
		return hasPics;
	}

	public void setHasPics(boolean hasPics) {
		this.hasPics = hasPics;
	}
	
	public String toString() {
		
		String s = super.toString();
		return s + "\nGenre: " + this.genre + "\nParagraphs: " + this.paragraphs + "\nHas Pictures? " + this.hasPics;
	}
}
