// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

package Seminars.Seminar_2;

import java.io.File;
import java.io.FileWriter;

public class Ex_1 {

    public static void main(String[] args) {

        String file_name = "1.txt";
        File file = new File(file_name);
        try {
            FileWriter writer = new FileWriter(file, false);

            int[] sortArr = { 2, 3, 1, 7, 4, 6, 5 };
            int temp;

            for (int i = 0; i < sortArr.length - 1; i++) {
                for (int j = 0; j < sortArr.length - i - 1; j++) {
                    if (sortArr[j + 1] < sortArr[j]) {
                        temp = sortArr[j];
                        sortArr[j] = sortArr[j + 1];
                        sortArr[j + 1] = temp;

                    }
                    writer.write(sortArr[j]);
                    writer.write("\n");
                }

            }
            for (int a = 0; a < sortArr.length; a++) {
                System.out.print(sortArr[a] + " ");
                writer.write(sortArr[a]);
            }

            writer.close();
            System.out.println("good job!");
        } catch (Exception e) {
            System.out.println("something went wrong!");
        }

    }
}
