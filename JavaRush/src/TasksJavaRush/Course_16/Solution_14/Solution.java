package TasksJavaRush.Course_16.Solution_14;
/*
1. Разберись, что делает программа.
2. Реализуй логику метода printCountdown так, чтобы программа каждые полсекунды выводила объект из переменной list.
Выводить нужно в обратном порядке - от переданного в Countdown индекса до нуля.
Пример:
Передан индекс 3

Пример вывода в консоль:
Строка 2
Строка 1
Строка 0
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static volatile List<String> list = new ArrayList<>(5);

    static {
        for (int i = 0; i < 5; i++) {
            list.add("Строка " + i);
        }
    }

    public void javaRush() throws Exception {
        Thread t = new Thread(new Countdown(3), "Countdown");
        t.start();
    }

    public static class Countdown implements Runnable {
        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        public void run() {
            try {
                while (countFrom > 0) {
                    printCountdown();
                }
            } catch (InterruptedException e) {
            }
        }

        public void printCountdown() throws InterruptedException {
            Thread.sleep(500);
            countFrom--;
            System.out.println(list.get(countFrom));
        }
    }
}
