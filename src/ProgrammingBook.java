public class ProgrammingBook extends Book{
    String laguage,framework;
    public ProgrammingBook(){
    }

    public ProgrammingBook(String bookCode, String name, String author, int price, String laguage, String framework) {
        super(bookCode, name, author, price);
        this.laguage = laguage;
        this.framework = framework;
    }
    public String getLaguage() {
        return laguage;
    }

    public void setLaguage(String laguage) {
        this.laguage = laguage;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

}
