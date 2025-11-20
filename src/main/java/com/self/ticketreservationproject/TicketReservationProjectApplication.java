package com.self.ticketreservationproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class TicketReservationProjectApplication {

  public static void main(String[] args) {
    SpringApplication.run(TicketReservationProjectApplication.class, args);
  }

}
