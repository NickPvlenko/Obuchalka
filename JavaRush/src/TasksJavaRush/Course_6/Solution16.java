package TasksJavaRush.Course_6;

/*
Расставьте минимальное количество static-ов, чтобы код начал работать, и программа успешно завершилась.
 */
public class Solution16 {
    public static int step;

    public static void javaRush(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        new Solution16().method3();
    }

    public  void method3() {
        method4();
    }

    public  void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace())
            System.out.println(element);
        if (step > 1)
            return;
        javaRush(null);
    }
}
