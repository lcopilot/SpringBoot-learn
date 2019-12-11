package top.lhylxl.task;

import java.io.File;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;

@SpringBootTest
class SpringbootAdvanced04TaskApplicationTests {

	@Autowired
	JavaMailSenderImpl mailSender;

	/**
	 * 简单邮件
	 */
	@Test
	void contextLoads() {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setSubject("通知");
		mailMessage.setText("开会");
		mailMessage.setFrom("liuxianliangli@foxmail.com");
		mailMessage.setTo("15367885410@163.com");
		mailSender.send(mailMessage);
	}

	@Test
	public void test02() throws MessagingException {
		//1.创建一个复杂的消息邮件
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage,true);
		messageHelper.setSubject("通知");
		messageHelper.setText("<b style='color:red'>asdiodjiiasdj</b>",true);  //设置为html
		messageHelper.setFrom("liuxianliangli@foxmail.com");
		messageHelper.setTo("15367885410@163.com");

		//发送附件
		messageHelper.addAttachment("1.jpg", new File("D:/images (1).png"));
		messageHelper.addAttachment("2.jpg", new File("D:/images (1).png"));
		mailSender.send(mimeMessage);
	}


}
