package v_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    ForeinLanguageTextbook foreinLanguageTextbook = new ForeinLanguageTextbook("EnjoyEnglish", 398,
                Arrays.asList("Кэрри Мертан"), "English", "C1");
	    StudentBook studentBook = new StudentBook("Алгбра и геометрия", 245,
                Arrays.asList("София Ротшильд"), "Math");
	    Dictionary dictionary = new Dictionary("Английско-финский словарь", 600,
                Arrays.asList("Мария Феромонова", "Марина Филина"), "Английский", "Финский");
	    Book book = new Book("Адвокат", 278, Arrays.asList("Джон Гришем"));
	    Magazine magazine = new Magazine("Антенна", 36, Arrays.asList("Моська"));
	    ElectronicResource electronicResource = new ElectronicResource("C++ vs Java", 2,
                Arrays.asList("Михаил Шпак"), "https://qna.habr.com/q/80210");
        List<Edition> editions = new ArrayList<>();
        editions.add(foreinLanguageTextbook); editions.add(studentBook); editions.add(dictionary);
        editions.add(book); editions.add(magazine); editions.add(electronicResource);
        for (Edition edition : editions){
            edition.read();
            System.out.println(edition);
        }
    }
}
