package TasksJavaRush.Course_8;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/*
Есть коллекция Map<String, Object> (реализация HashMap), туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
Sim - 5
 */
public class Solution6 {
    public void javaRush() throws IOException {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        for (var x : map.entrySet()){
            String key = x.getKey();
            Object value = x.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
