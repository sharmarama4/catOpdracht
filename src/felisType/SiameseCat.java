package felisType;

public class SiameseCat extends Felis{
    public SiameseCat(int shlterNo,int badgeNo) {
        super(shlterNo,badgeNo);
    }

    public SiameseCat(char size, String color, char coat, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, color, coat, weight, name, age, shelterNo, badgeNo);
    }

    @Override
    public String toString() {
        return "SiameseCat{} " + super.toString();
    }
}
