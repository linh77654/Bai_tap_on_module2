package ss7_abs;

import java.time.LocalDate;

public abstract class Book {
    private String name;
    private String publishingCompany;
    private int publishingYear;

    public Book() {
    }

    public Book(String name, String publishingCompany, int publishingYear) {
        this.name = name;
        this.publishingCompany = publishingCompany;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return
                ", name='" + name + '\'' +
                        ", publishingCompany='" + publishingCompany + '\'' +
                        ", publishingYear=" + publishingYear +
                        '}';
    }

    public void display() {

    }
}
