//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//Отсортировать по убыванию популярности Имени.
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

package Seminars.Seminar_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ex_2 {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();

        names.put("Иванов", "Иван");
        names.put("Петрова", "Светлана");
        names.put("Белова", "Кристина");
        names.put("Мусина", "Анна");
        names.put("Крутова", "Анна");
        names.put("Юрин", "Иван");
        names.put("Лыков", "Петр");
        names.put("Чернов", "Павел");
        names.put("Чернышов", "Петр");
        names.put("Федорова", "Мария");
        names.put("Светлова", "Марина");
        names.put("Савина", "Мария");
        names.put("Рыкова", "Мария");
        names.put("Лугова", "Марина");
        names.put("Владимирова", "Анна");
        names.put("Мечников", "Иван");
        names.put("Петин", "Петр");
        names.put("Ежов", "Иван");

        HashMap<String, Integer> countNames = new HashMap<>();
        ArrayList<String> name = new ArrayList<>();

        for (Map.Entry<String, String> item : names.entrySet()) {

            name.add(item.getValue());

        }

        for (int i = 0; i < name.size(); i++) {
            String temp = name.get(i);

            if (!countNames.containsKey(temp)) {
                countNames.put(temp, 1);
            } else {
                countNames.put(temp, countNames.get(temp) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : countNames.entrySet()) {
            System.out.println("Имя = " + entry.getKey() + ", Повторений = " + entry.getValue());
            

            }

        }

    }

