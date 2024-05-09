package net.mrloic.learn.tasks.five;

import java.time.LocalDate;

public class Credited extends Client {
    private double creditAmount;
    private double interestRate;
    private double debtAmount;

    public Credited(String surname, LocalDate openDate, double creditAmount, double interestRate, double debtAmount) {
        super(surname, openDate);
        this.creditAmount = creditAmount;
        this.interestRate = interestRate;
        this.debtAmount = debtAmount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Заёмщик: " + super.surname + ", Дата открытия: " + super.openDate +
                ", Сумма кредита: " + creditAmount + ", Процентная ставка: " + interestRate +
                ", Сумма долга: " + debtAmount);
    }
}
