package v_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyTask {
    public static void doTask(){
        System.out.print("Введите количество чесел > ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            System.out.print("Введите число "+(i+1)+" > ");
            int zn = scanner.nextInt();
            list.add(zn);
        }
        System.out.println("Результирующая последовательность:");
        List<Integer> new_list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            int el = 0;
            for (int j = 0; j <= i; j++) el += list.get(j) + j + 1;
            new_list.add(el);
            System.out.println(el);
        }
    }
}
