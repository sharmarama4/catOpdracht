package felisType;

import AnimalType.Animal;

import java.util.Objects;

public abstract class Felis extends Animal {
    private static int VaccinationCount;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;

//if the shelter no and badge no are not bigger than 999 and smaller than -999
    public Felis(char size, String color, char coat, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, color, coat, weight);
        this.name = name;
        this.age = age;
        if (badgeNo > 999|| badgeNo<-999) {
            this.badgeNo = 999;
        }else {
            this.badgeNo=Math.abs(badgeNo);
        }
        if(shelterNo > 999 || shelterNo<-999) {
            this.shelterNo = 999;
        }else{
            this.shelterNo=Math.abs(shelterNo);
        }

    }

    public Felis(int shelterNo, int badgeNo) {
        this.shelterNo = shelterNo;
        this.badgeNo = badgeNo;
    }


/* Maak een vorm van controle bij de setters voor shelterNo en BadgeNo. Zorg ervoor dat de getallen
    niet groter dan 999 zijn, en dat ze niet negatief zijn!*/

    public int getBadgeNo() {
        return badgeNo;
    }

    public void setBadgeNo(int badgeNo) {
        if (badgeNo > 999|| badgeNo<-999) {
            this.badgeNo = 999;
       }else {
            this.badgeNo=Math.abs(badgeNo);
        }

    }

    public int getShelterNo() {

        return shelterNo;
    }

    public void setShelterNo(int shelterNo) {
        if(shelterNo > 999 || shelterNo<-999) {
            this.shelterNo = 999;
        }else{
            this.shelterNo=Math.abs(shelterNo);
        }

    }
//you hve to count only for live cats
    {
        if(isAlive()){
            VaccinationCount++;
        }

}

   /* {
        if(!(this instanceof AndreanMountainCat)){
            VaccinationCount++;
        }
    }*/



    public void miauw() {
        System.out.println("Miauw");
    }
    public void miauw(int miauw) {
        System.out.println("Miauw"+ miauw);
    }

    public static int getVaccinationCount() {
        return VaccinationCount;
    }

    public static void setVaccinationCount(int vaccinationCount) {
        VaccinationCount = vaccinationCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ) return false;
        Felis felis = (Felis) o;
        return shelterNo == felis.shelterNo && badgeNo == felis.badgeNo ;
    }

    @Override
    public int hashCode() {
        return Objects.hash( shelterNo, badgeNo);
    }

    @Override
    public String toString() {
        return "Felis{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", shelterNo=" + shelterNo +
                ", badgeNo=" + badgeNo +
                "} " + super.toString();
    }
}

