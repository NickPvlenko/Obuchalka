package TasksJavaRush.Course_14.Solution_17;

public class Hrivna extends Money {
    public  Hrivna(double amount) {
      super(amount);
    }
@Override
    public String getCurrencyName(){
        return "UAH";
    }
}
