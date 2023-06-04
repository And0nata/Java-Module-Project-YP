import static java.lang.String.format;

import java.util.Scanner;

public class Products {
    static Scanner sc=new Scanner(System.in);
    private static String listProducts="Добавленные товары:";
    private static double summ=0.00;
    static String inputName;
    static double price;

    public static void addProducts() {
        do {
            System.out.println("Введите название товара");
            inputName = sc.nextLine();
            inputName = inputName.trim();
            if (inputName.equalsIgnoreCase("Завершить")) {break;}
            else {listProducts += "\n" + inputName;}
            while(true) {
            System.out.println("Введите стоимость товара");
                String stringPrice = sc.nextLine();
                price = Double.parseDouble(stringPrice);
                if (price < 0) {
                                System.out.println("Неправильная стоимость товара");
                                continue;
                } else {summ += (double) price;
                    break;} }
            System.out.println("Товар успешно добавлен!");
            System.out.println("Введите \"Завершить\" для завершения или любой другой символ для продолжения");
            inputName = sc.nextLine();
            inputName = inputName.trim();
            if (inputName.equalsIgnoreCase("Завершить")) break;
            else continue;
        } while (true);
    }

    public static String getListProducts () {
        return listProducts;
    }

    public static double getSumm () {
        return summ;
    }


}
