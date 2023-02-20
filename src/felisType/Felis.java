public class Felis extends Animal{
    private static int VaccinatationCount;

    public Felis(char size, String color, double weight) {
        super(size, color, weight);
    }
    static {
        VaccinatationCount++;
    }
}
