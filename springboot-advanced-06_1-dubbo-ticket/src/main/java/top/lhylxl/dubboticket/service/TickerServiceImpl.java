package top.lhylxl.dubboticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/11
 * @time: 14:42
 * @description:
 */

@Component
@Service  //将服务发布出去
public class TickerServiceImpl implements TicketService {

	@Override
	public String getTick() {
		return "hello world";
	}
}
