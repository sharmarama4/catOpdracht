package felisType;

public class NorwegianForestCat extends Felis{


    public NorwegianForestCat(char size, String color, char coat, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, color, coat, weight, name, age, shelterNo, badgeNo);
    }

    public void miauwInNorwegian(){
        System.out.println("Norwegian");
    }

    @Override
    public String toString() {
        return "NorwegianForestCat{} " + super.toString();
    }
}
