package felisType;

public class PersianCat extends Felis {

    public PersianCat(int shelterNo, int badgeNo) {
        super(shelterNo, badgeNo);
    }

    public PersianCat(char size, String color, char coat, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, color, coat, weight, name, age, shelterNo, badgeNo);
    }

    @Override
    public void miauw() {
        super.miauw();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "PersianCat{} " + super.toString();
    }
}
