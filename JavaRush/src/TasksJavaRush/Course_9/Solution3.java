package TasksJavaRush.Course_9;

import java.io.IOException;

/*
Написать пять методов, которые вызывают друг друга.
Метод должен вернуть номер строки кода, из которого вызвали этот метод.
Воспользуйся функцией: element.getLineNumber().
 */
public class Solution3 {
    public void javaRush() throws IOException {
        method1();
    }

    public static int method1() {
        method2();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        method3();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
