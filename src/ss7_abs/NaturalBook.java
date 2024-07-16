package ss7_abs;

import java.time.LocalDate;

public class NaturalBook extends Book implements IBook {
    private int numberOfPublications;

    public NaturalBook() {
    }

    public NaturalBook(String name, String publishingCompany, int publishingYear, int numberOfPublications) {
        super(name, publishingCompany, publishingYear);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    @Override
    public String toString() {
        return
                ", numberOfPublications='" + numberOfPublications + '\'' +
                '}';
    }

    @Override
    public void display() {
        System.out.println("Natural Book - Name: " + super.getName() + ", Publisher: " + super.getPublishingCompany() +
                ", Year: " + super.getPublishingYear() + ", Number of Copies: " + getNumberOfPublications());

    }
}
