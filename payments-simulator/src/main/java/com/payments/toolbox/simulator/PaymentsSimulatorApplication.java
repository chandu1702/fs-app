package com.payments.toolbox.simulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main class for the Payments Simulator Application.
 * This class is responsible for bootstrapping the Spring Boot application.
 */
@SpringBootApplication
public class PaymentsSimulatorApplication {

    /**
     * The main method which serves as the entry point for the Spring Boot application.
     *
     * @param args Command line arguments passed to the application.
     */
    public static void main(String[] args) {
        // Print a greeting message to the console
        System.out.println("Hello");

        // Launch the Spring Boot application
        SpringApplication.run(PaymentsSimulatorApplication.class, args);
    }

}