
import java.util.Scanner;

public class Products {
    static Scanner sc = new Scanner(System.in);
    private static String listProducts = "Добавленные товары:";
    private static double summ = 0.00;
    static String inputName;
    static double price;

    public static void addProducts() {
        do {
            System.out.println("Введите название товара");
            if (sc.hasNextLine()) {
                inputName = sc.nextLine();
                inputName = inputName.trim();
            }
            if (inputName.equalsIgnoreCase("Завершить")) {
                break;
            } else if (inputName.length() == 0) continue;
            else {
                listProducts += "\n" + inputName;
            }
            while (true) {
                System.out.println("Введите стоимость товара цифрой");
                try {
                    if (sc.hasNextLine()) {
                        String inputLine = sc.nextLine().trim();
                        double price = Double.parseDouble(inputLine);
                        if (price < 0) {
                            System.out.println("Неправильная стоимость товара");
                        } else {
                            summ += (double) price;
                            break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

            }
            System.out.println("Товар успешно добавлен!");
            System.out.println("Введите \"Завершить\" для завершения или любой другой символ для продолжения");
            inputName = sc.nextLine();
            inputName = inputName.trim();
            if (inputName.equalsIgnoreCase("Завершить")) break;
        } while (true);
    }

    public static String getListProducts() {
        return listProducts;
    }

    public static double getSumm() {
        return summ;
    }


}
