package ss7_abs;

public class MainBook {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new NaturalBook("Nature 1", "Publisher 1", 2021, 500);
        books[1] = new NaturalBook("Nature 2", "Publisher 2", 2020, 300);
        books[2] = new SocialBook("Social 1", "Publisher 3", 2019, "Author 1");
        books[3] = new SocialBook("Social 2", "Publisher 4", 2018, "Author 2");
        books[4] = new NaturalBook("Nature 3", "Publisher 5", 2022, 200);

        for (Book book : books) {
            if (book instanceof NaturalBook) {
                ((NaturalBook) book).display();
            } else if (book instanceof SocialBook) {
                ((SocialBook) book).display();
            }
        }
    }
}


