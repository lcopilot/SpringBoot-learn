package top.lhylxl.springboot.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import top.lhylxl.springboot.entity.User;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/5
 * @time: 17:50
 * @description:
 */

/**
 * 继承JpaRepository来完成对数据库的操作
 */
public interface UserRepository extends JpaRepository<User,Integer>{


}
