public class BookExercise {

    String title;
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    String author;
    int price;
    public void detailsOfTheBook() {
        System.out.println(getAuthor() + getTitle() + getPrice());
    }
    public BookExercise(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] args) {
        BookExercise Book = new BookExercise("HARRY", "Elena", 100000);
        Book.detailsOfTheBook();
    }
}
