package labproject7.writtenworks;

//WrittenWork.java: Superclass

public class WrittenWork {

 private String title;
 private String author;
 private int    year;


 // constructors:
 public WrittenWork(String title, String author, int year) {

     setTitle( title );
     setAuthor( author );
     setYear( year );
 }

 public WrittenWork() {
 }


 // accessor methods:
 public String getTitle() {
     return title;
 }

 public String getAuthor() {
     return author;
 }

 public int getyear() {
     return year;
 }

 public void setTitle(String title) {
     this.title = title;
 }

 public void setAuthor(String author) {
     this.author = author;
 }

 public void setYear(int year) {
     this.year = year;
 }

 public String toString() {
	 
	 return "Title: " + this.title + "\nAuthor: " + this.author + "\nYear: " + this.year;
 }
}

