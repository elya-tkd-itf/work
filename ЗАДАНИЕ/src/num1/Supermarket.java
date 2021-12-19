package num1;

import java.util.Scanner;

/**
 * Задание 1.
 * Класс Супермаркет
 */
public class Supermarket {
    private String nameotdela, name, cuntry, namesource;
    private int productCode, retailPrice;

    /**
     * Конструктор класса
     * @param nameotdela - название отдела
     * @param name - название товара
     * @param cuntry - страна-производитель
     * @param productCode - код продукта
     * @param retailPrice - розничная цена
     */
    public Supermarket(String nameotdela, String name, String cuntry, int productCode, int retailPrice) {
        this.nameotdela = nameotdela;
        this.name = name;
        this.cuntry = cuntry;
        this.productCode = productCode;
        this.retailPrice = retailPrice;
    }

    /**
     * Задание 4.
     * Конструктор
     */
    public Supermarket(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print nameotdela:"); nameotdela = scanner.next();
        System.out.println("Print name:"); name = scanner.next();
        System.out.println("Print cuntry:"); cuntry = scanner.next();
        System.out.println("Print productCode:"); productCode = scanner.nextInt();
        System.out.println("Print retailPrice:"); retailPrice = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                "nameotdela='" + nameotdela + '\'' +
                ", name='" + name + '\'' +
                ", cuntry='" + cuntry + '\'' +
                ", namesource='" + namesource + '\'' +
                ", productCode=" + productCode +
                ", retailPrice=" + retailPrice +
                '}';
    }

    public String getNameotdela() {
        return nameotdela;
    }

    public void setNameotdela(String nameotdela) {
        this.nameotdela = nameotdela;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuntry() {
        return cuntry;
    }

    public void setCuntry(String cuntry) {
        this.cuntry = cuntry;
    }

    public String getNamesource() {
        return namesource;
    }

    public void setNamesource(String namesource) {
        this.namesource = namesource;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }
}
