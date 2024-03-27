package Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Author {
@Id
private int aid;
private String authorname;
@OneToMany(mappedBy="author")
private List<Book> bookname;
public int getAid() {
	return aid;
}
@Override
public String toString() {
	return "Author [aid=" + aid + ", authorname=" + authorname + ", bookname=" + bookname + "]";
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAuthorname() {
	return authorname;
}
public void setAuthorname(String authorname) {
	this.authorname = authorname;
}
public List<Book> getBookname() {
	return bookname;
}
public void setBookname(List<Book> bookname) {
	this.bookname = bookname;
}
}
