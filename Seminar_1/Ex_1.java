// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

package Seminars.Seminar_1;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.print ("Enter a number: ");
        int n = scanner.nextInt();
        int triangle = 0;
        int factorial = 1;
        for(int i = 1; i < n+1; i++){
            triangle += i;
            factorial = factorial * i; 
           
        }
        System.out.println(triangle);
        
        System.out.println(factorial);
        
        } 
    
}
