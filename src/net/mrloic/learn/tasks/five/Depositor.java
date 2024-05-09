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
