package top.lhylxl.Bean;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/10
 * @time: 14:20
 * @description:
 */
@Document(indexName = "lhylxl",type = "book")
public class Book {

	private Integer id;
	private String bookName;
	private String author;

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", bookName='" + bookName + '\'' +
				", author='" + author + '\'' +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
