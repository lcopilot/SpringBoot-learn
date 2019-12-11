package top.lhylxl.amqp.bean;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/9
 * @time: 16:37
 * @description:
 */
public class Book {

	private String bookName;
	private String author;

	@Override
	public String toString() {
		return "Book{" +
				"bookName='" + bookName + '\'' +
				", author='" + author + '\'' +
				'}';
	}

	public Book() {
	}

	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
