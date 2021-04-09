import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Book books[] = new Book[10];
        books[0] = new ProgrammingBook("01","baotoandeptrai","baophong",100000,
                "java","deptrai");
          books[1] = new ProgrammingBook("01","baotoandeptrai1","baophong",800000,
                "java","deptrai");
          books[2] = new ProgrammingBook("01","baotoandeptrai2","baophong",100000,
                "java","deptrai");
          books[3] = new ProgrammingBook("01","baotoandeptrai3","baophong",900000,
                "java","deptrai");
          books[4] = new ProgrammingBook("01","baotoandeptrai4","baophong",100000,
                "java","deptrai");
          books[5] = new FictionBook("01","baotoandeptrai","baophong",100000,"sachiep");
         books[6] = new FictionBook("01","baotoandeptrai","baophong",10000,"sachiep"
               );
         books[7] = new FictionBook("01","baotoandeptrai","baophong",10000,"sachiep"
               );
         books[8] = new FictionBook("01","baotoandeptrai","baophong",10000,"sachiep"
                );
         books[9] = new FictionBook("01","baotoandeptrai","baophong",100000,"sachiep"
               );
        ManagerBook toan = new ManagerBook();
        ManagerBook.setBooks(books);
        System.out.println("so sach co ngon ngu java la"+toan.countBookByLanguage("java"));
        System.out.println("tong tien la"+toan.getSumMoneyBook());
        System.out.println("sach duoi gia monny la"+toan.searchBookByPrice(60000));
    }

}
