package Calculator_OOP;

public class CalculationDemo {
    public static void main(String[] args) {
        Calculation c1 = new Calculation(10,15);
        int sum = c1.sum();
        System.out.println("suma este egal " + sum);

        c1 = new Calculation(2, 3);
        System.out.println("suma2 este egala " + c1.sum());
    }
}
