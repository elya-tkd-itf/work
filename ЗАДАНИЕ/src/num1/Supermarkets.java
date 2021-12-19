package num1;

import java.util.List;

/**
 * Задание 2.
 * Класс Супермаркеты
 */
public class Supermarkets {
    private List<Supermarket> supermarkets;

    /**
     * Конструктор класса
     * @param supermarkets - список всех супермаркетов
     */
    public Supermarkets(List<Supermarket> supermarkets) {
        this.supermarkets = supermarkets;
    }

    /**
     * Данный метод добавляет новый супермаркет
     * @param supermarket в список супермаркетов
     */
    public void add(Supermarket supermarket){
        supermarkets.add(supermarket);
    }

    /**
     * Данный метод выводит все супермаркеты
     */
    public void show(){
        for (Supermarket supermarket : supermarkets){
            System.out.println(supermarket);
        }
    }

    private int compareByCountry(Supermarket o1, Supermarket o2) {
        return o1.getCuntry().compareTo(o2.getCuntry());
    }

    /**
     * Задание 3.
     * Метод, сортирующий список супермаркетов по стране
     */
    public void sortByCountry(){
        supermarkets.sort(this::compareByCountry);
    }

    private int compareByPrice(Supermarket o1, Supermarket o2) {
        return o1.getRetailPrice() - o2.getRetailPrice();
    }

    /**
     * Задание 3.
     * Метод, сортирующий список супермаркетов по цене
     */
    public void sortByPrice(){
        supermarkets.sort(this::compareByPrice);
    }
}
