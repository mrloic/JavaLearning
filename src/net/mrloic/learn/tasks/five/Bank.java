package net.mrloic.learn.tasks.five;

import java.util.Arrays;
import java.time.LocalDate;

public class Bank {
    public static void clients() {
        int n = 3; // Number of clients
        Client[] clients = new Client[n];
        clients[0] = new Depositor("Орыжкин", LocalDate.of(2024, 2, 25), 5000, 5.0);
        clients[1] = new Credited("Звездочётов", LocalDate.of(2022, 2, 2), 10000, 7.5, 7500);
        clients[2] = new Organization("Monster Corp.", LocalDate.of(2024, 5, 9), 123456, 100000);

        // Sort clients array by open date
        Arrays.sort(clients);

        // Display all clients
        for (Client client : clients) {
            client.displayInfo();
        }

        // Search for clients who started after a certain date
        LocalDate startDate = LocalDate.now();
        ; // Use a specific date here
        System.out.println("\nКлиенты, которые начали работать после " + startDate + ":");
        for (Client client : clients) {
            if (client.matchesCriteria(startDate)) {
                client.displayInfo();
            }
        }
    }
}
