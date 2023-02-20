package felisType;
//ctrl+alt+s(setting of intellij)
public class TurkishVanCat extends Felis{
    private String nickName;


    public TurkishVanCat(char size, String color, char coat, double weight, String name, int age, int shelterNo, int badgeNo, String nickName) {
        super(size, color, coat, weight, name, age, shelterNo, badgeNo);
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "TurkishVanCat{" +
                "nickName='" + nickName + '\'' +
                "} " + super.toString();
    }
}
