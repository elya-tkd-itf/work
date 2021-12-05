package v_4;

import java.util.List;

public abstract class Edition {
    public List<String> authors;
    public String name;
    public int pages;
    public Edition(String name, int pages, List<String> authors){
        this.name = name;
        this.pages = pages;
        this.authors = authors;
    }
    public abstract void read();
}
