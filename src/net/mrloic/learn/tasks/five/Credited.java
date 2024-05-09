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
