// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package Seminars.Seminar_3;

import java.util.ArrayList;
import java.util.Random;

public class Ex_1 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(10);
        Random rnd = new Random();
        for (int i = 0; i < 10; i++ ){
            list.add(rnd.nextInt(1, 10));
        }
        System.out.println(list);
        for (int j = 0; j < list.size(); j++){
            if (list.get(j) % 2 == 0){
                list.remove(j);
                j--;
            }
        }
        System.out.println(list);
        
    }
    
}
