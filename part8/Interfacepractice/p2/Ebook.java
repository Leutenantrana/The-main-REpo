package part8.Interfacepractice.p2;
import java.util.ArrayList;

public class Ebook implements Readable {
    private int pageNumber;
    private ArrayList<String> pages;
    private String name;

    public Ebook(String namString, ArrayList<String> pages){
        this.name = name;
        this.pages = pages;
       
    }
    public String getName() {
        return this.name;
    }

    public int pages() {
        return this.pages.size();
    }
    public String read() {
        String page = this.pages.get(this.pageNumber);
        nextPage();
        return page;
    }

    private void nextPage() {
        this.pageNumber = this.pageNumber + 1;
        if(this.pageNumber % this.pages.size() == 0) {
            this.pageNumber = 0;
        }
    }
    
}
