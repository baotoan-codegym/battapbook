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
    public Book[] sapxep(){
        Book teamp;
       for (int i=0;i<books.length;i++){
           for (int j=i+1;j<books.length-i;j++){
               if (books[i].getPrice()<books[j].getPrice()){
           teamp = books[i];
                   books[i]=books[j];
                   books[j]=teamp;

               }
           }
       }
       return books;
    }
    public void display(){
        for (Book a: books
             ) {
            System.out.println(a.name);
        }
    }

}
