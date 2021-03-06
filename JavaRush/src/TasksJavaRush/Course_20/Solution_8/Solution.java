package TasksJavaRush.Course_20.Solution_8;

import java.io.*;

/**
 * Два десериализованных объекта singleton и singleton1 имеют разные ссылки в памяти,
 * а должны иметь одинаковые.
 * В класс Singleton добавь один метод (погуглите),
 * чтобы после десериализации ссылки на объекты были равны.
 * Метод main не участвует в тестировании.
 */
public class Solution {
    public static void javaRush() throws IOException, ClassNotFoundException {
        Singleton instance = Singleton.getInstance();

        ByteArrayOutputStream byteArrayOutputStream = serializeSingletonInstance(instance);

        Singleton singleton = deserializeSingletonInstance(byteArrayOutputStream);
        Singleton singleton1 = deserializeSingletonInstance(byteArrayOutputStream);

        System.out.println("Проверка ourInstance : " + singleton.getInstance());
        System.out.println("Проверка ourInstance : " + singleton1.getInstance());
        System.out.println("=========================================================");
        System.out.println("Проверка singleton : " + singleton);
        System.out.println("Проверка singleton1 : " + singleton1);
    }
    public static ByteArrayOutputStream serializeSingletonInstance(Singleton instance) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);
        oos.writeObject(instance);
        oos.close();

        return byteArrayOutputStream;
    }

    public static Singleton deserializeSingletonInstance(ByteArrayOutputStream byteArrayOutputStream) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

        ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream);
        Singleton singleton = (Singleton) ois.readObject();
        ois.close();

        return singleton;
    }

    public static class Singleton implements Serializable {
        private static Singleton ourInstance;

        public static Singleton getInstance() {
            if (ourInstance == null) {
                ourInstance = new Singleton();
            }
            return ourInstance;
        }

        /**
         * тут нужно добавить этот метод readResolve()
         *
         * readObject() это метод класса ObjectInputStream.
         * Когда вы считываете объект в момент десериализации,
         * метод readObject проверяет, не имеет ли десериализируемый класс метод readResolve.
         * Если такой метод есть, то этот readResolve запускается и возвращает тот же объект.
         *
         * загружая из источника синглтон без readResolve с возвратом нужного экземпляра,
         * мы получаем нестатическую копию объекта в обход конструктора или метода getInsance,
         * которые не дают создавать копии.
         */

        private Object readResolve()  {
            return ourInstance;
        }

        private Singleton() {
        }
    }
}
