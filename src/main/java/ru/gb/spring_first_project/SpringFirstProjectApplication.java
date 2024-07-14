package ru.gb.spring_first_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.gb.spring_first_project.core.EmailSender;
import ru.gb.spring_first_project.hw.TicketGenerator;

@SpringBootApplication
public class SpringFirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringFirstProjectApplication.class, args);

		//EmailSender emailSender = context.getBean(EmailSender.class);
		//emailSender.sendEmail("test", "test letter", "test@test.ru");

		TicketGenerator generator = context.getBean(TicketGenerator.class);
		generator.createNewTicket();
		generator.createNewTicket();

	}

}
