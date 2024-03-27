package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
@Id
private int bookid;
private String bookname;
private String bookgenre;
@ManyToOne
private Author author;
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
@Override
public String toString() {
	return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookgenre=" + bookgenre + ", author=" + author
			+ "]";
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getBookgenre() {
	return bookgenre;
}

public Book(int bookid, String bookname, String bookgenre) {
	super();
	this.bookid = bookid;
	this.bookname = bookname;
	this.bookgenre = bookgenre;

}
public void setBookgenre(String bookgenre) {
	this.bookgenre = bookgenre;
}
}
