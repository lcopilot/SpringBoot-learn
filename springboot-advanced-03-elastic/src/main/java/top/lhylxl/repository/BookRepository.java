package top.lhylxl.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import top.lhylxl.Bean.Book;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/10
 * @time: 14:19
 * @description:
 */
public interface BookRepository extends ElasticsearchRepository<Book,Integer> {

}
