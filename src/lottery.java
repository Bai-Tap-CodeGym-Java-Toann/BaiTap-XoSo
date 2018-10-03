import sun.misc.Regexp;

import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {
        int lotteryNumber = (int) Math.round(Math.random() * 99);
        String lottery = String.valueOf(lotteryNumber);
        if (lotteryNumber < 10) {
            lottery = "0" + lottery;
        }
        Scanner sc = new Scanner(System.in);

        System.out.println("cho đoán 2 số đấy, trúng hộ :)");
        System.out.print("số thứ nhất:");
        String num1 = sc.nextLine();
        System.out.print("số thứ hai: ");
        String num2 = sc.nextLine();


        while (!(num1.matches("^[0-9]{2}$") &&
                num2.matches("^[0-9]{2}$"))) {
            System.out.println("Số không hợp lệ, nhập lại: ");
            System.out.print("số thứ nhất:");
            num1 = sc.nextLine();
            System.out.print("số thứ hai: ");
            num2 = sc.nextLine();
        }

        if (num1.equals(lottery) ||
                (num2.equals(lottery))) {
            System.out.println("Trúng giải độc đắc 10000$");
        } else if ((num1.equals(reveser(lottery))) ||
                (num2.equals(reveser(lottery)))) {
            System.out.println("Trúng giải nhì 3000$");
        } else if ((isAnyMatchedChar(num1, lottery)) ||
                (isAnyMatchedChar(num2, lottery))) {
            System.out.println("Trúng giải ba 1000$");
        } else {
            System.out.println("trượt rồi hjhj");
        }

    }

    static String reveser(String word) {
        String[] wordRay = word.split("");
        String revesered = "";
        for (int i = wordRay.length - 1; i >= 0; i--) {
            revesered += wordRay[i];
        }
        return revesered;
    }

    static boolean isAnyMatchedChar(String string1, String string2) {
        String[] find = string1.split("");
        for (String x : find) {
            System.out.println(x);
            if (string2.contains(x)) {
                return true;
            }
        }
        return false;
    }
}
