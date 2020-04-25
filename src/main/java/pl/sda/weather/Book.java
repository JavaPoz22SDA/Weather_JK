package pl.sda.weather;

public class Book {

    private String author;
    private String title;
    private String pages;

    public Book (String author, String title, String pages) {

        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle(){
        return title;
    }

    public String getPages(){
        return pages;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setPages(String pages){
        this.pages = pages;
    }
}
