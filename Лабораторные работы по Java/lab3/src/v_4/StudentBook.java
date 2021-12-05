package v_4;

import java.util.List;

public class StudentBook extends Book{
    public String lesson;
    public StudentBook(String name, int pages, List<String> authors, String lesson){
        super(name, pages, authors);
        this.lesson = lesson;
    }
    @Override
    public void read() {
        System.out.println("Читаю учебник");
    }
    @Override
    public String toString(){
        return super.toString()+" по предмету "+lesson;
    }
}
