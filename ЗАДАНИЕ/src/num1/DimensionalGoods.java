package num1;

import java.util.Scanner;

/**
 * Задание 2.
 * Класс Габаритный товар, который наследуется от класса Супермаркет
 */
public class DimensionalGoods extends Supermarket {
    private int height, width, length;

    /**
     * Конструктор класса
     * @param nameotdela - название отдела
     * @param name - название товара
     * @param cuntry - страна-производитель
     * @param productCode - код продукта
     * @param retailPrice - розничная цена
     * @param height - высота товара
     * @param width - ширина товара
     * @param length - длина товара
     */
    public DimensionalGoods(String nameotdela, String name, String cuntry, int productCode, int retailPrice, int height, int width, int length) {
        super(nameotdela, name, cuntry, productCode, retailPrice);
        this.height = height;
        this.length = length;
        this.width = width;
    }

    /**
     * Задание 4.
     * Конструктор
     */
    public DimensionalGoods(){
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print height:"); height = scanner.nextInt();
        System.out.println("Print length:"); length = scanner.nextInt();
        System.out.println("Print width:"); width = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "DimensionalGoods{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
