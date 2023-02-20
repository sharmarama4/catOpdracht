package AnimalType;
/*Implementeer de UML-diagram*/
public abstract class Animal {

    private static int AnimalCount=0;
    private char size;
    private String  color;
    private char coat;
    private double weight;

    public Animal() {
    }

    public Animal(char size, String color, char coat, double weight) {
        this.size = size;
        this.color = color;
        this.coat = coat;
        this.weight = weight;
    }

    {
        AnimalCount++;
    }

    public static int getAnimalCount() {
        return AnimalCount;
    }

    public static void setAnimalCount(int animalCount) {
        AnimalCount = animalCount;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void makeNoise(String sound){
        System.out.println(sound);
    }
    public void eat(){
        System.out.println();
    }
    public void sleep(){
        System.out.println();
    }
    public boolean isAlive(){
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", coat=" + coat +
                ", weight=" + weight +
                '}';
    }
}