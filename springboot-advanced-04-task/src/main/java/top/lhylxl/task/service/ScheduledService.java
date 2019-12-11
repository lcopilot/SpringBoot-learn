package top.lhylxl.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/10
 * @time: 17:04
 * @description:
 */
@Service
public class ScheduledService {

//	@Scheduled(cron = "0-4 * * * * MON-FRT")
//	@Scheduled(cron = "")
//	@Scheduled(cron = "6-9 * * * * 2")
	public void hello(){
		System.out.println("hello...");
	}

}
