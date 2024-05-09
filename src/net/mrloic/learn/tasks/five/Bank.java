package net.mrloic.learn.tasks.five;
/*
Вариант 8
1. Создать абстрактный класс TelephoneDirectory с функциями,
позволяющими вывести на экран информацию о записях в телефонном
справочнике, а также определить соответствие записи критерию поиска.
2. В абстрактном классе TelephoneDirectory реализовать метод
CompareTo так, чтобы можно было отсортировать базу данных справочника
по номеру телефона.
3. Создать производные классы: Persona (фамилия, адрес, номер
телефона), Organization (название, адрес, телефон, факс, контактное лицо),
Friend (фамилия, адрес, номер телефона, дата рождения).
4. В методе Main() cоздать массив из n записей, вывести полную
информацию из базы на экран, отсортировав массив данных справочника по
номеру телефона, а также организовать поиск в базе по фамилии.
*/

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
