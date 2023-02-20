public class Animal {

    private static int AnimalCount=0;
    private char size;
    private String  color;
    private double weight;

    public Animal(char size, String color, double weight) {
        this.size = size;
        this.color = color;
        this.weight = weight;
    }
    static{
        AnimalCount++;
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

}