package v_4;

import java.util.List;

public class Magazine extends Edition {
    public Magazine(String name, int pages, List<String> authors){
        super(name, pages, authors);
    }
    @Override
    public void read() {
        System.out.println("Читаю журнал");
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Журнал ").append(name).append(", ").append(pages).append(" страниц");
        for (String author : authors)
            stringBuilder.append(", ").append(author);
        return stringBuilder.toString();
    }
}
