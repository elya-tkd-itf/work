package num1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        Supermarket supermarket1 = new Supermarket("milk", "kefir", "Russia", 1657, 45);
        System.out.println(supermarket1);
        System.out.println();

        //Задание 2
        Toys toy1 = new Toys("board games", "fluxx", "Russia", "game", 1749, 2800, 12);
        System.out.println(toy1);
        System.out.println();

        Supermarkets supermarkets = new Supermarkets(new ArrayList<>());
        supermarkets.add(new Fruit("fruits", "banana", "USA", 1890, 120, 10, 25));
        supermarkets.add(new Toys("board games", "uno", "Russia", "game", 1949, 800, 6));
        supermarkets.show();
        System.out.println();

        //Задание 3
        supermarkets.add(toy1);
        supermarkets.add(supermarket1);

        System.out.println("Sort by country:");
        supermarkets.sortByCountry();
        supermarkets.show();
        System.out.println();

        System.out.println("Sort by price:");
        supermarkets.sortByPrice();
        supermarkets.show();
        System.out.println();

        //Задание 4
        Supermarkets collection = new Supermarkets(new ArrayList<>());
        boolean exit = false;
        while (!exit){
            showMenu();
            int ans = (new Scanner(System.in)).nextInt();
            switch (ans){
                case 1: collection.show(); break;
                case 2: collection.sortByCountry(); break;
                case 3: collection.sortByPrice(); break;
                case 4: collection.add(new Toys()); break;
                case 5: collection.add(new Fruit()); break;
                case 6: collection.add(new DimensionalGoods()); break;
                case 7: exit = true; break;
                default:
                    System.out.println("Print 1, 2, 3... or 7:");
            }
        }
    }

    private static void showMenu(){
        System.out.println("1 - show collection");
        System.out.println("2 - sort collection by country");
        System.out.println("3 - sort collection by price");
        System.out.println("4 - add new toy");
        System.out.println("5 - add new fruit");
        System.out.println("6 - add new dimensional good");
        System.out.println("7 - exit");
    }
}
