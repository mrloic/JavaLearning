package net.mrloic.learn.tasks.five;

import java.time.LocalDate;

public class Depositor extends Client {
    private double depositAmount;
    private double interestRate;

    public Depositor(String surname, LocalDate openDate, double depositAmount, double interestRate) {
        super(surname, openDate);
        this.depositAmount = depositAmount;
        this.interestRate = interestRate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Вкладчик: " + super.surname + ", Дата открытия: " + super.openDate +
                ", Сумма депозита: " + depositAmount + ", Процентная ставка: " + interestRate);
    }
}
