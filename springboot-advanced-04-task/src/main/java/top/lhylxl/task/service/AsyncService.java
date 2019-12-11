package top.lhylxl.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/10
 * @time: 16:05
 * @description:
 */
@Service
public class AsyncService {

	//告诉spring这是异步方法
	@Async
	public void hello(){
		try {
			Thread.sleep(3000);
			System.out.println("数据处理中...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
