package TasksJavaRush.Course_15.Solution_31;

/*
Исправь класс Hrivna так, чтоб избежать возникновения ошибки StackOverflowError.
 */
public class Solution {
    public void javaRush() throws Exception {
        System.out.println(new Hrivna().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    //add your code below - добавь код ниже
    public static class Hrivna extends Money {
        private double amount = 123d;

        @Override
        public Object getAmount() {
            return amount;
        }

        public Hrivna getMoney() {
            return this;
        }
    }
}
