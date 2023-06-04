import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countFriends = CountFriends.inputCountFriends();
        Products.addProducts();
        double countMoney = Products.getSumm();
        double manyForOne = CountFriends.calculate(countFriends, countMoney);

        System.out.println(Products.getListProducts());
        System.out.println("Каждый должен заплатить по: " + String.format("%.2f", manyForOne).replace(",", ".") + " " + CountFriends.ruble(manyForOne));
        sc.close();
    }
}