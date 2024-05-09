package net.mrloic.learn.tasks.five;

import java.time.LocalDate;

public abstract class Client implements Comparable<Client> {
    protected String surname;
    protected LocalDate openDate;

    public Client(String surname, LocalDate openDate) {
        this.surname = surname;
        this.openDate = openDate;
    }

    public abstract void displayInfo();

    public boolean matchesCriteria(LocalDate startDate) {
        return openDate.compareTo(startDate) >= 0;
    }

    @Override
    public int compareTo(Client other) {
        return this.openDate.compareTo(other.openDate);
    }
}
