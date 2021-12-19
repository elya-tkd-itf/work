package num1;

import java.util.Scanner;

/**
 * Задание 2.
 * Класс Игрушки, который наследуется от класса Супермаркет
 */
public class Toys extends Supermarket {
    private int ageGroup;
    private String type;

    /**
     * Конструктор класса
     * @param nameotdela - название отдела
     * @param name - название товара
     * @param cuntry - страна-производитель
     * @param type - тип игрушки
     * @param productCode - код продукта
     * @param retailPrice - розничная цена
     * @param ageGroup - возрастная группа
     */
    public Toys(String nameotdela, String name, String cuntry, String type, int productCode, int retailPrice, int ageGroup) {
        super(nameotdela, name, cuntry, productCode, retailPrice);
        this.ageGroup = ageGroup;
        this.type = type;
    }

    /**
     * Задание 4.
     * Конструктор
     */
    public Toys(){
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print type:"); type = scanner.next();
        System.out.println("Print ageGroup:"); ageGroup = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Toys{" +
                "ageGroup=" + ageGroup +
                ", type='" + type + '\'' +
                '}';
    }

    public int getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
