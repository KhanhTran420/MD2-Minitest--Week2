public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook(){

    }

    public ProgrammingBook(String language, String framework, String bookCode, String name, int price, String author){
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}
