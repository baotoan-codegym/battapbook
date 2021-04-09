public class ManagerBook {
public static Book books[];

    public static Book[] getBooks() {
        return books;
    }

    public static void setBooks(Book[] books) {
        ManagerBook.books = books;
    }


    public ManagerBook() {
    }

    public int getSumMoneyBook() {
        int sum = 0;
        for (Book o : books
        ) {
            sum += o.getPrice();
        }
        return sum;
    }
    public int countBookByLanguage(String language){
        int count = 0;
        for (Book o: books) {
            if (o instanceof ProgrammingBook){
                if (((ProgrammingBook) o).getLaguage() == language) count++;
            }

        }
        return count;
    }

    public int searchBookByPrice(int monney) {
//        Book[] books = new Book[10];
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPrice() < monney) {
                count++;
            }
        }
        return count;
    }
}
