import java.util.Scanner;

public class CountFriends {

    static int countFriends = 0;
    static Scanner sc = new Scanner(System.in);

    //Функция ввода количества человек
    public static int inputCountFriends(double countMoney) {
        do {
            System.out.println("На скольких человек необходимо разделить счёт?");
            try {
                if (sc.hasNextLine()) {
                    String inputLine = sc.nextLine();
                    inputLine = inputLine.trim();
                    countFriends = Integer.parseInt(inputLine);
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
            switch (countFriends) {
                case 0:
                    System.out.println("Введено некорректное количество человек.\n Введите еще раз!)");
                    break;
                case 1:
                    System.out.println("Нечего делить в счете оплачиваемым одним человеком.\n Введите еще раз!)");
                    break;
                default:
                    if (countFriends > countMoney * 100)
                        System.out.println("Счет слишком маленький для такой большой компании.\n Введите еще раз!)");
                    else if (countFriends < 0)
                        System.out.println("Кхм... Попробуем еще раз!");
                    else return countFriends;
            }

        }
        while (true);
    }

    public static double calculate(int countFriends, double countMoney) {
        return countMoney / countFriends;
    }

    public static String ruble(double manyForOne) {
        int value = (int) manyForOne;
        if ((value % 100 / 10) % 10 == 1 || value % 10 == 0 || value % 10 >= 5) return "рублей";
        else if (value % 10 == 1) return "рубль";
        else if (value % 10 > 1 && value % 10 < 5) return "рубля";
        else return "ошибка";
    }
}
