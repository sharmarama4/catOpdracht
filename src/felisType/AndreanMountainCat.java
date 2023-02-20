package felisType;

public class AndreanMountainCat extends Felis {


    public AndreanMountainCat(char size, String color, char coat, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, color, coat, weight, name, age, shelterNo, badgeNo);
    }

    public boolean isAlive() {
        return false;
    }

      public void miauw(String customSound) {
          System.out.println("custom sound"+customSound);
    }

    @Override
    public String toString() {
        return "AndreanMountainCat{} " + super.toString();
    }
}
