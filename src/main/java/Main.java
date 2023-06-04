import static java.lang.String.format;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
        Products.addProducts();
        double countMoney = Products.getSumm();
        int countFriends = CountFriends.inputCountFriends(countMoney);
        double manyForOne = CountFriends.calculate(countFriends, countMoney);

        System.out.println(Products.getListProducts());
        System.out.println("Каждый должен заплатить по: "+ String.format("%.2f", manyForOne).replace(",", ".") +" "+ CountFriends.ruble(manyForOne));
        } catch (Exception e) {
            System.out.println("Ошибка: "+e.getMessage());
        }


    }

}