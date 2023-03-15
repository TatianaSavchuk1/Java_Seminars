package Seminars.Seminar_2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex_4 {

    public static void main(String[] args) {
        String file_name = "2.txt";
        File file = new File(file_name);
        try {
            FileWriter writer = new FileWriter(file, true);

            Scanner scanner = new Scanner(System.in, "Cp866");
            System.out.print("Enter a number a: ");
            int a = scanner.nextInt();
            System.out.print("Enter a character: ");
            String ch = scanner.next();
            System.out.print("Enter a number b: ");
            int b = scanner.nextInt();

            System.out.print(a + " " + ch + " " + b + " = ");

            switch (ch) {
                case "+":
                    int p = a + b;
                    System.out.print(a + b);
                    writer.write(a + " " + ch + " " + b + " = " + p);
                    writer.write("\n");
                    break;
                case "-":
                    int d = a - b;
                    System.out.print(a - b);
                    writer.write(a + " " + ch + " " + b + " = " + d);
                    writer.write("\n");
                    break;
                case "*":
                    int m = a * b;
                    System.out.print(a * b);
                    writer.write(a + " " + ch + " " + b + " = " + m);
                    writer.write("\n");
                    ;
                    break;
                case "/":
                    int s = a / b;
                    System.out.print(a / b);
                    writer.write(a + " " + ch + " " + b + " = " + s);
                    writer.write("\n");
                    break;

            }
            writer.close();
            System.out.println("good job!");
        } catch (Exception e) {
            System.out.println("something went wrong!");
        }
    }
}
