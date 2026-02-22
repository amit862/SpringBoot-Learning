package com.codingamit.amit.module1;

import com.codingamit.amit.module1.impl.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1Application implements CommandLineRunner {

  //  @Autowired
//    final NotificationService notificationServiceObj; //Field dependency injection
//
//    public Module1Application(
//            @Qualifier("smsNotif") NotificationService notificationServiceObj) {
//        this.notificationServiceObj = notificationServiceObj; //constructor Dependency Injection (Preffered)
//    }
    @Autowired
    Map<String, NotificationService> notificationServiceMap = new HashMap<>();

    public static void main(String[] args) {
        SpringApplication.run(Module1Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
      //  NotificationService notificationServiceObj = new EmailNotificationService();

      //  notificationServiceObj.send("hello");

        for(var notificationService: notificationServiceMap.entrySet()) {
            System.out.println(notificationService.getKey());
            notificationService.getValue().send("Hello");
        }
    }
}
