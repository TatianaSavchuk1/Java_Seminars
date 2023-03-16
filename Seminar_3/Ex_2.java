//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package Seminars.Seminar_3;

import java.util.ArrayList;
import java.util.Random;

public class Ex_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(1, 10));
        }
        System.out.println(list);

        int maximum = getMaximum(list);
        int minimum = getMinimum(list);
        int medium = getMedium(list);

        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(medium);
    }

    static int getMaximum(ArrayList<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++)
            if (max < list.get(i))
                max = list.get(i);
        return max;

    }

    static int getMinimum(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++)
            if (min > list.get(i))
                min = list.get(i);
        return min;

    }

    static int getMedium(ArrayList<Integer> list) {

        int sum = 0;
        int med = 0;
        for (int i = 0; i < list.size(); i++) {

            sum = sum + list.get(i);

        }
        med = sum / list.size();
        return med;
    }
}
