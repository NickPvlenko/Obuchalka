package com.ZadachiJavaRush.Course_4;
import java.util.Scanner;
/*
Ввести с клавиатуры три числа а, b, c - стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.

Подсказка:
Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
то треугольника с такими сторонами не существует.
 */
public class Solution15 {
    public void javaRush() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a<(b+c) && b<(a+c) && c<(a+b))
            System.out.println("Треугольник существует.");
        else
        System.out.println("Треугольник не существует.");
    }
}