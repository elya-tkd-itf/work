package num1;

import java.util.Scanner;

/**
 * Задание 2.
 * Класс Фрукты, который наследуется от класса Супермаркет
 */
public class Fruit extends Supermarket {
    private int storageTime, storageTemperature;

    /**
     * Конструктор класса
     * @param nameotdela - название отдела
     * @param name - название товара
     * @param cuntry - страна-производитель
     * @param productCode - код продукта
     * @param retailPrice - розничная цена
     * @param storageTime - время хранения
     * @param storageTemperature - температура хранения
     */
    public Fruit(String nameotdela, String name, String cuntry, int productCode, int retailPrice, int storageTime, int storageTemperature) {
        super(nameotdela, name, cuntry, productCode, retailPrice);
        this.storageTemperature = storageTemperature;
        this.storageTime = storageTime;
    }

    /**
     * Задание 4.
     * Конструктор
     */
    public Fruit(){
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print storageTime:"); storageTime = scanner.nextInt();
        System.out.println("Print storageTemperature:"); storageTemperature = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "storageTime=" + storageTime +
                ", storageTemperature=" + storageTemperature +
                '}';
    }

    public int getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(int storageTime) {
        this.storageTime = storageTime;
    }

    public int getStorageTemperature() {
        return storageTemperature;
    }

    public void setStorageTemperature(int storageTemperature) {
        this.storageTemperature = storageTemperature;
    }
}
