package cond;

public class If5 {

    public static void main(String[] args) {

/*      int itemPrice = 10000;
        int age = 10;

        if (itemPrice >= 10000) {
            itemPrice -= 1000;
        }
        if (age <= 10) {
            itemPrice -= 1000;
        }

        System.out.println(itemPrice); */

        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }
        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이, 1000원 할인");
        }
        price -= discount;
        System.out.println("총 할인 금액: " + discount + "원");
        System.out.println("가격: " + price + "원");
    }
}
