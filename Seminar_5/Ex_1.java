// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 
//1) Добавление номера
// 2) Вывод всего

package Seminars.Seminar_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");

        HashMap<String, String> data = new HashMap<>();
        TreeSet<String> result = new TreeSet<>();

        while (true) {
            System.out.println("What action to take 1 or 2? : ");
            int action = scanner.nextInt();

            if (action == 1) {
                System.out.println("Add a surname: ");
                String surname = scanner.next();
                System.out.println("Enter a phone number: ");
                String phone = scanner.next();

                
                data.put(surname, phone);
       
            }

            else if (action == 2) {
                System.out.println(data);

            }
        }
    }
}
        
