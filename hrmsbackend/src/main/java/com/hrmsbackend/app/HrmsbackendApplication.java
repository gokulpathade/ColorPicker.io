package com.hrmsbackend.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//
//import com.hrmsbackend.app.service.BirthdayWishService;



@SpringBootApplication
//@EnableScheduling

public class HrmsbackendApplication {
	
//	
//    private final BirthdayWishService birthdayWishService;
//
//    public HrmsbackendApplication(BirthdayWishService birthdayWishService) {
//        this.birthdayWishService = birthdayWishService;
//    }


	public static void main(String[] args) {
		SpringApplication.run(HrmsbackendApplication.class, args);
		
	}
//	
//	  @Scheduled (cron = "0 0 8 * * *") // Schedule to run every day at 8 AM
//	    public void sendBirthdayWishes() {
//	        birthdayWishService.sendBirthdayWish();
//	    }
//	

}
