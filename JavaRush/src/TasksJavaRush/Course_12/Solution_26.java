package TasksJavaRush.Course_12;

/*
1. Внутри класса Solution создай интерфейс public interface CanFly(летать) с методом void fly().
2. Внутри класса Solution создай интерфейс public interface CanClimb(лазить по деревьям) с методом void climb().
3. Внутри класса Solution создай интерфейс public interface CanRun(бегать) с методом void run().
4. Подумай логически, какие именно интерфейсы нужно добавить для каждого класса.
5. Добавь интерфейсы классам Cat(кот), Dog(собака), Tiger(тигр), Duck(Утка).
 */
public class Solution_26 {
    public void javaRush() {
        //
    }

    public class Cat implements CanClimb, CanRun{
        @Override
        public void climb() {
        }
        @Override
        public void run() {
        }
    }

    public class Dog implements CanRun {
        @Override
        public void run() {
        }
    }

    public class Tiger extends Cat  {
        @Override
        public void climb() {
        }
        @Override
        public void run() {
        }
    }

    public class Duck implements CanFly, CanRun {
        @Override
        public void fly() {
        }
        @Override
        public void run() {
        }
    }

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }

}
