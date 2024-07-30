package laptopfilter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class laptopfilter {

    public static void console_clean() {
        System.out.print("\033[H\033[J");
    }

    public static void main(String[] args) {
        laptop l1 = new laptop("laptop_1", 512, "Windows", "green", 1080);
        laptop l2 = new laptop("laptop_2", 1024, "Windows", "black", 1440);
        laptop l3 = new laptop("laptop_3", 1024, "MacOS", "red", 1080);
        laptop l4 = new laptop("laptop_4", 512, "Windows", "white", 4096);
        laptop l5 = new laptop("laptop_5", 256, "Linux", "black", 1080);
        var catalog = new HashSet<>(Arrays.asList(l1, l2, l3, l4, l5));
        System.out.println("Введите критерий выбора:");
        System.out.println("по модели: введите \"1\"");
        System.out.println("по объему памяти:введите \"2\"");
        System.out.println("по операционной системе:введите \"3\"");
        System.out.println("по цвету:введите \"4\"");
        System.out.println("по разрешению экрана:введите \"5\"");
        int filter_category;
        Scanner Filter_Category = new Scanner(System.in);
        filter_category = Integer.parseInt(Filter_Category.nextLine());
        String filter_value;
        switch (filter_category) {
            case 1:
                System.out.println("Введите название");
                Scanner Filter_Value1 = new Scanner(System.in);
                filter_value = Filter_Value1.nextLine();
                for (laptop a : catalog) {
                    if (a.model == filter_value) {
                        System.out.println(a);
                    }
                }
                Filter_Value1.close();
                break;

            case 2:
                System.out.println("Введите желаемый объем");
                Scanner Filter_Value2 = new Scanner(System.in);
                filter_value = Filter_Value2.nextLine();
                for (laptop a : catalog) {
                    if (a.memory_value >= Integer.parseInt(filter_value)) {
                        System.out.println(a);
                    }
                }
                Filter_Value2.close();

                break;

            case 3:
                System.out.println("Введите название операционной системы");
                Scanner Filter_Value3 = new Scanner(System.in);
                filter_value = Filter_Value3.nextLine();
                for (laptop a : catalog) {
                    if (a.os == filter_value) {
                        System.out.println(a);
                    }
                }
                Filter_Value3.close();
                break;

            case 4:
                System.out.println("Введите цвет");
                Scanner Filter_Value4 = new Scanner(System.in);
                filter_value = Filter_Value4.nextLine();
                for (laptop a : catalog) {
                    if (a.color == filter_value) {
                        System.out.println(a);
                    }
                }
                Filter_Value4.close();
                break;

            case 5:
                System.out.println("Введите желаемое разрешение");
                Scanner Filter_Value5 = new Scanner(System.in);
                filter_value = Filter_Value5.nextLine();
                for (laptop a : catalog) {
                    if (a.screen_res >= Integer.parseInt(filter_value)) {
                        System.out.println(a);
                    }
                }
                Filter_Value5.close();
                break;

            default:
                break;
        }
        Filter_Category.close();
    }
}