// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package Seminars.Seminar_2;

import java.io.*;
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("students.txt");
        Scanner scan = new Scanner(fr);
        int i = 1;

        StringBuilder a = new StringBuilder();

        while (scan.hasNextLine()) {
          
       System.out.println(i + " Студент " + scan.nextLine());
            i++;

        }

        fr.close();

    }

}
