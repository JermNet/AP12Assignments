package Book;

public class Book {

    private String author;
    private String title;
    private int numOfPages;

    public Book(String a, String t, int p) {
        author = a;
        title = t;
        if (p > 0) {
            numOfPages = p;
        } else {
            numOfPages = 1;
        }
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setNumOfPages(int p) {
        if (p > 0) {
            numOfPages = p;
        }
    }

    public String toString() {
        return title + " by: " + author + " (" + numOfPages + ")";
    }
}
