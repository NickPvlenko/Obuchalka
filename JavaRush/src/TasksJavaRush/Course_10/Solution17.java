package TasksJavaRush.Course_10;

import java.util.ArrayList;
import java.util.Scanner;

/*
Создать список целых чисел.
Ввести с клавиатуры 20 целых чисел.
Создать метод по безопасному извлечению чисел из списка:
int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
Метод должен возвращать элемент списка (list) по его индексу (index).
Если в процессе получения элемента возникло исключение, его нужно перехватить, и метод должен вернуть defaultValue.
 */
public class Solution17 {
    public void javaRush() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int x = sc.nextInt();
            list.add(x);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        int result = 0;
        try {
           result = list.get(index);
        } catch (Exception e) {
          return defaultValue;
        }
        return result;
    }
}
