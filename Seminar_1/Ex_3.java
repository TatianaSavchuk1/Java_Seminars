// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package Seminars.Seminar_1;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.print ("Enter a number a: ");
        int a = scanner.nextInt();
        System.out.print ("Enter a character: ");
        String ch = scanner.next();
        System.out.print ("Enter a number b: ");
        int b = scanner.nextInt();

        System.out.print(a + " " + ch + " " + b + " = ");

        switch(ch){
            case "+":
            System.out.print(a+b);
            break;
            case "-":
            System.out.print(a-b);
            break;
            case "*":
            System.out.print(a*b);
            break;
            case "/":
            System.out.print(a/b);
            break;


        
    } 
}
}
        
    
    

