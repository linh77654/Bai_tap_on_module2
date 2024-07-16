package ss7_abs;

import java.time.LocalDate;

public class SocialBook extends Book implements IBook {
    private String theWriterName;

    public SocialBook() {
    }

    public SocialBook(String name, String publishingCompany, int publishingYear, String theWriterName) {
        super(name, publishingCompany, publishingYear);
        this.theWriterName = theWriterName;
    }

    public String getTheWriterName() {
        return theWriterName;
    }

    public void setTheWriterName(String theWriterName) {
        this.theWriterName = theWriterName;
    }

    @Override
    public String toString() {
        return
                ", theWriterName='" + theWriterName + '\'' +
                        '}';
    }

    @Override
    public void display() {
        System.out.println("Natural Book - Name: " + super.getName() + ", Publisher: " + super.getPublishingCompany() +
                ", Year: " + super.getPublishingYear() + ", Number of Copies: " + getTheWriterName());
    }
}
