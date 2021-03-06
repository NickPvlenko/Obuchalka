package TasksJavaRush.Course_3;
/*
Амиго, сегодня наша задача наполнить корабельный бассейн.
Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются в метод getVolume.
Метод должен вернуть количество литров воды, которое нужно для наполнения бассейна.

Пример:
Метод getVolume вызывается с параметрами 25, 5, 2.

Пример вывода:
250000
 */
public class Solution10 {
    public void javaRush(){
        System.out.println(getVolume(25, 5, 2));
    }
    public long getVolume(int a, int b, int c) {
        return (a*b*c)*1000;
    }
}
