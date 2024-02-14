package com.example.atmdispenser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtmDispenserApplication {

    public static void main(String[] args) {
        // Chain of responsibility design pattern is used here
        SpringApplication.run(AtmDispenserApplication.class, args);
        ATMDispenser atmDispenser = new TwoThousandNotes(new HundredNotes(new TenNotes(null)));

        try {
            System.out.println("total number of notes " +
            atmDispenser.dispense(7198));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
