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
