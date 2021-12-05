package v_4;

import java.util.List;

public class Dictionary extends Book {
    public String from_lang, to_lang;
    public Dictionary(String name, int pages, List<String> authors, String from_lang, String to_lang){
        super(name, pages, authors);
        this.from_lang = from_lang;
        this.to_lang = to_lang;
    }
    @Override
    public void read() {
        System.out.println("Читаю словарь");
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Словарь с ").append(from_lang).append(" на ").append(to_lang).append(" ").append(name)
                .append(", ").append(pages).append(" страниц");
        for (String author : authors)
            stringBuilder.append(", ").append(author);
        return stringBuilder.toString();
    }
}
