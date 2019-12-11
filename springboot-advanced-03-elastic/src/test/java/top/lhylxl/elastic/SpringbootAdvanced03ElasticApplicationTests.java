package top.lhylxl.elastic;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.lhylxl.Bean.Book;
import top.lhylxl.repository.BookRepository;


@SpringBootTest
class SpringbootAdvanced03ElasticApplicationTests {

	@Autowired
	BookRepository bookRepository;

	@Test
	public void test02(){
		Book book = new Book();
		bookRepository.index(book);
	}

	@Test
	void contextLoads() {
	}

}
