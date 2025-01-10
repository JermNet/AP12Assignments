package Book;

import java.util.ArrayList;

public class Genre {

    private boolean fiction;
    private String genreType;
    private ArrayList<Book> books = new ArrayList<>();

    public Genre(boolean f, String g, ArrayList<Book> b) {
        fiction = f;
        genreType = g;
        books = b;
    }

    public Genre(boolean f, String g) {
        fiction = f;
        genreType = g;
    }

    public boolean getFiction() {
        return fiction;
    }

    public String getGenreType() {
        return genreType;
    }

    public void setFiction(boolean f) {
        fiction = f;
    }

    public void setGenreType(String g) {
        genreType = g;
    }

    public void addBook(String author, String title, int numOfPages) {
        books.add(new Book(author, title, numOfPages));
    }

    public void removeBook(int index) {
        if ((index + 1) > books.size()) {

        } else {
            books.remove(index);
        }
    }

    public Book getBook(int index) {
        if ((index + 1) > books.size()) {
            index = 0;
        }
        return books.get(index);
    }

    public void setBook(int index, String author, String title, int numOfPages) {
        if ((index + 1) > books.size()) {
            index = 0;
        }
        books.set(index, new Book(author, title, numOfPages));
    }

    public void sortByPageLowToHigh() {
        for (int index = 0; index < books.size() - 1; index++) {
            int minIndex = index;
            for (int i = index; i < books.size(); i++) {
                if (books.get(i).getNumOfPages() > books.get(minIndex).getNumOfPages()) {
                    minIndex = i;
                }
                Book temp = books.get(i);
                books.set(i, books.get(minIndex));
                books.set(minIndex, temp);
            }
        }
    }

    public void sortByPageHighToLow() {
        for (int index = 0; index < books.size() - 1; index++) {
            int maxIndex = index;
            for (int i = index; i < books.size(); i++) {
                if (books.get(i).getNumOfPages() < books.get(maxIndex).getNumOfPages()) {
                    maxIndex = i;
                }
                Book temp = books.get(i);
                books.set(i, books.get(maxIndex));
                books.set(maxIndex, temp);
            }
        }
    }

    public void sortByAuthorAToZ() {
        for (int index = 0; index < books.size() - 1; index++) {
            int minIndex = index;
            for (int i = index; i < books.size(); i++) {
                if (books.get(i).getAuthor().compareTo(books.get(minIndex).getAuthor()) > -1) {
                    minIndex = i;
                }
                Book temp = books.get(i);
                books.set(i, books.get(minIndex));
                books.set(minIndex, temp);
            }
        }
    }

    public void sortByAuthorZToA() {
        for (int index = 0; index < books.size() - 1; index++) {
            int maxIndex = index;
            for (int i = index; i < books.size(); i++) {
                if (books.get(i).getAuthor().compareTo(books.get(maxIndex).getAuthor()) <= -1) {
                    maxIndex = i;
                }
                Book temp = books.get(i);
                books.set(i, books.get(maxIndex));
                books.set(maxIndex, temp);
            }
        }
    }

    public void sortByTitleAToZ() {
        for (int index = 0; index < books.size() - 1; index++) {
            int minIndex = index;
            for (int i = index; i < books.size(); i++) {
                if (books.get(i).getTitle().compareTo(books.get(minIndex).getTitle()) > -1) {
                    minIndex = i;
                }
                Book temp = books.get(i);
                books.set(i, books.get(minIndex));
                books.set(minIndex, temp);
            }
        }
    }

    public void sortByTitleZToA() {
        for (int index = 0; index < books.size() - 1; index++) {
            int maxIndex = index;
            for (int i = index; i < books.size(); i++) {
                if (books.get(i).getTitle().compareTo(books.get(maxIndex).getTitle()) <= -1) {
                    maxIndex = i;
                }
                Book temp = books.get(i);
                books.set(i, books.get(maxIndex));
                books.set(maxIndex, temp);
            }
        }
    }

    public String toString() {
        return books.toString();
    }

}