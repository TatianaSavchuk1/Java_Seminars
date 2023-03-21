// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package Seminars.Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");

        System.out.println(list1);

        Object element = 7;

        enqueue(list1, element);
        dequeue(list1);
        first(list1);
    }

    static void enqueue(LinkedList list1, Object element) {

        list1.addLast(element);
        System.out.println(list1);
    }

    static void dequeue(LinkedList list1) {

        Object element = list1.pollFirst();
        System.out.println(element);
        System.out.println(list1);
    }

    static void first(LinkedList list1) {

        Object element = list1.peekFirst();
        System.out.println(element);
        System.out.println(list1);
    }

}
