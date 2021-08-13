package removeduplicates;/*
Написать программу, которая удаляет из коллекции целых чисел все дубликаты, если они есть.
Коллекцию из 100 элементов заполнить случайными числами (граница - 20).
Вывести обе коллекции на экран и количество удалённых дубликатов (при желании - решить несколькими способами и сравнить какой из них быстрее)
 */


import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> myNewArrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) { // Заполнение коллекции последовательностью чисел от 0 до 100
            int a = 1; // Начальное значение диапазона - "от"
            int b = 20; // Конечное значение диапазона - "до"
            int random_number = a + (int) (Math.random() * b); // Генерация случайного числа
            myNewArrayList.add(random_number);
        }
        System.out.println(myNewArrayList);

        List<Integer> deDupIntegerList = new ArrayList<>(new LinkedHashSet<>(myNewArrayList));
        System.out.println("---------------------");
        System.out.println("Длина нового списка (без дубликатов) --> " + deDupIntegerList.size());
        System.out.println("---------------------");
        for (int j = 0; j < deDupIntegerList.size(); j++) {

        }
        System.out.println(deDupIntegerList);

    }
}
