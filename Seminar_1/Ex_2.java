// Вывести все простые числа от 1 до 1000

package Seminars.Seminar_1;

public class Ex_2 {
    public static void main(String[] args) {
        
        int max = 1000;
      
        for (int i = 1; i < max; i++) {
           int k = 0;
            for (int j = 1; j < i+1; j++) {
                if (i % j == 0) {
                    k++;
                }
            }
            if (k == 2) {
                System.out.print(i + " ");
            }
        }
        
    }
}
