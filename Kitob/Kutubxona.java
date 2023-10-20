package Kitob;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Kutubxona {

    public static void main(String[] args) {
        while (true) {

            System.out.println("Muqaddima: Kitob qidirish dasturimizga hush kelibsiz ");
            int kitobqidirish = (new Scanner(System.in)).nextInt();
            if (kitobqidirish == 10) {
                System.out.println("""
                        1. Til tanlash
                        2. Kitob tanlash
                        3. Chek chiqarish
                         
                        """);
            } else {
                System.out.println("Menimchakitob qr kodini xato kiritdingiz!");
            }


        }
    }
    public static menu
}
