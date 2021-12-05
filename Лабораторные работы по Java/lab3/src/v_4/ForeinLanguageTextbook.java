package v_4;

import java.util.List;

public class ForeinLanguageTextbook extends StudentBook {
    public String level;
    public ForeinLanguageTextbook(String name, int pages, List<String> authors, String lesson, String level){
        super(name, pages, authors, lesson);
        this.level = level;
    }
    @Override
    public void read() {
        System.out.println("Читаю учебник по иностранному языку");
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Учебник по иностранному языку ").append(name).append(" уровня ").append(level)
                .append(", ").append(pages).append(" страниц");
        for (String author : authors)
            stringBuilder.append(", ").append(author);
        return stringBuilder.toString();
    }
}
