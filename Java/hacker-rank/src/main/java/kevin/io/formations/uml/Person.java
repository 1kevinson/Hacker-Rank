package kevin.io.formations.uml;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String address;
    private int age;

    public String getName() throws Exception {
        if (!isNameLengthCorrect()) throw new Exception("Name Length is not correct");

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNameLengthCorrect() {
        return this.name.trim().length() >= 5;
    }

}

class Schedule {

    private final String name;
    private List<Meeting> scheduledMeeting;

    public Schedule(String name) {
        this.name = name;
    }

    public void addMeetingInSchedule(Meeting newMeeting) {
        this.scheduledMeeting.add(newMeeting);
    }
}

class Meeting {

    private final String description;
    private final LocalDate dateStart;
    private final LocalDate dateEnd;

    Meeting(String description, LocalDate dateStart, LocalDate dateEnd) {
        this.description = description;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }
}

class BankAccount {

    protected String owner;
    protected BigDecimal balance;

    protected BigDecimal deposit(BigDecimal amount) {
        return this.balance.add(amount);
    }

    protected BigDecimal withDrawal(BigDecimal amount) {
        if (this.balance.compareTo(amount) < 0) return BigDecimal.ZERO;

        return this.balance.subtract(amount);
    }
}

class CheckingAccount extends BankAccount {

    private BigDecimal insufficientFundsFee;
}

class SavingAccount extends BankAccount {

    private BigDecimal annualInterest;

}

class Airplane {

    private String model;
    private List<Passenger> passengers = new ArrayList<>();
}

class Passenger {

    private String passengerId;
    private String name;
}

/* class Library {

    private String address;
    private int numberOfBooks;
    private List<Book> books = new ArrayList<>();

    public void addBook(Book newBook) {
        this.books.add(newBook);
        numberOfBooks = this.numberOfBooks + 1;
        newBook.setLibrary(this);
    }

    public void removeBook(Book newBook) {
        this.books.remove(newBook);
        numberOfBooks = this.numberOfBooks - 1;
    }
} */

/*class Book {

    private String title;
    private String author;
    private Library library;

    public void setLibrary(Library library) {
        this.library = library;
    }
}*/


class Book {

    private String title;
    private String author;
    private final Chapter chapter;

    Book(Chapter chapter) {
        this.chapter = chapter;
    }
}

class Chapter {

    private String title;
    private final Page page;

    Chapter(Page page) {
        this.page = page;
    }
}
/**/
class Page {

    private final int number;

    Page(int number) {
        this.number = number;
    }
}

interface Printer {

    void print();
}

class LaserPrinter implements Printer {

    @Override
    public void print() {
        // Print with laser printer
    }
}

class classPrinter implements Printer {

    @Override
    public void print() {
        // Print with simple printer
    }
}

class Account {

    private LocalDate creationDate;
    private String status;
    private AccountType accountType;
}

enum AccountType {

    ADMIN,
    USER,
    CLIENT,
    OWNER
}

class Box<T> {

    private T item;

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

