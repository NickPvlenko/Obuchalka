package TasksJavaRush.Course_15.Solution_14;

import java.util.HashMap;
import java.util.Map;

/*
В статическом блоке инициализировать labels 5 различными парами ключ-значение.
 */
public class Solution {
    public static Map<Double, String> labels = new HashMap<>();
    static
    {
        labels.put(1.5, "");
        labels.put(1.6, "");
        labels.put(1.7, "");
        labels.put(1.8, "");
        labels.put(1.9, "");
    }
    public void javaRush() throws Exception {

        System.out.println(labels);
    }
}
