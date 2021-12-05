package v_4;

import java.util.List;

public class ElectronicResource extends Edition {
    public String url;
    public ElectronicResource(String name, int pages, List<String> authors, String url){
        super(name, pages, authors);
        this.url = url;
    }
    @Override
    public void read() {
        System.out.println("Читаю электронный ресурс");
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Электронный ресурс ").append(name).append(", ").append(pages)
                .append(" страниц, ").append(url);
        for (String author : authors)
            stringBuilder.append(", ").append(author);
        return stringBuilder.toString();
    }
}
