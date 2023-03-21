//Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

package Seminars.Seminar_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex_1 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");

        System.out.println(list1);

        System.out.println(reversedList(list1, list2));
    }

    static LinkedList reversedList(LinkedList list1, LinkedList list2) {

        while (!list1.isEmpty()) {
            list2.add(list1.pollLast());
        }

        return list2;
    }

}
