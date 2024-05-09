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
