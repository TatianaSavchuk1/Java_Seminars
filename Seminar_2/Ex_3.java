// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение). Без встр. функций

package Seminars.Seminar_2;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.print("Enter word: ");
        String a = scanner.next();
        System.out.print(isPalindrom(a));
    }

    public static boolean isPalindrom(String a) {
        a = a.toLowerCase();
        a = a.replace(" ", "");
        int size = a.length();
        for (int i = 0; i < size / 2; i++)
            if (a.charAt(i) != a.charAt(size - i - 1))
                return false;
        return true;

    }
}
