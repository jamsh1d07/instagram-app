package uz.pdp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.mail.MessagingException;

@SpringBootApplication
@EnableScheduling
public class InstagramAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(InstagramAppApplication.class, args);
    }


}
