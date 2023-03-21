//В калькулятор добавьте возможность отменить последнюю операцию.

package Seminars.Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        // LinkedList <Integer> list1 = new LinkedList<>();
        // int result;

        LinkedList<Integer> list = new LinkedList<>();
        

        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.print ("Enter a number a: ");
        int a = scanner.nextInt();
        int result = a;
        
        while (true){

        
        System.out.print ("Enter a character: ");
        String ch  = scanner.next();
        System.out.print ("Enter a number b: ");
        int b = scanner.nextInt();
        

        if (ch.startsWith("+")){
            result = result+b;
            list.add(result);
            System.out.println(result);
        }
        else if (ch.startsWith("-")){
            result = result-b;
            list.add(result);
            System.out.println(result);
        }
        else if (ch.startsWith("*")){
            result = result*b;
            list.add(result);
            System.out.println(result);
        }
        else if (ch.startsWith("/")){
            result = result/b;
            list.add(result);
            System.out.println(result);
        }

        else if (ch.startsWith("cancel")){
            list.removeLast();
            result = list.getLast();
            
        }

        System.out.println(list);

    }
}
}

        
        


       
