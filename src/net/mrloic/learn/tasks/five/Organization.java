package net.mrloic.learn.tasks.five;

import java.time.LocalDate;

public class Organization extends Client {
    private String orgName;
    private int accountNumber;
    private double accountBalance;

    public Organization(String orgName, LocalDate openDate, int accountNumber, double accountBalance) {
        super("", openDate); // Using empty string for surname
        this.orgName = orgName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    @Override
    public void displayInfo() {
        System.out.println("Организация: " + orgName + ", Дата открытия: " + super.openDate +
                ", Номер счета: " + accountNumber + ", Баланс счета: " + accountBalance);
    }
}
