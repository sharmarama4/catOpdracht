package application;

import AnimalType.Animal;
import felisType.*;

public class CatApp {
    public static void main(String[] args) {
       /* Zorg ervoor dat alle katten een persoonlijke toString() methode hebben. Het ras moet erin zitten.
                Maak dan minstens 7 katten die erven van Felis. Stop ze in een array en print de contents van de
        toString() methode af.
        Let op als je de katten maakt, gebruik enkel de subklassen!
                PersianCat pc = new PerscianCat() //OK
        Felis pc = new PerscianCat() //NIET Ok*/

        PersianCat cat1=new PersianCat( 's', "white",'A',15.3,"Bella",23,454,356);
        PersianCat cat2=new PersianCat( 's',"white",'B',15.3,"Charlie",23,454,-356);
        AndreanMountainCat cat3=new AndreanMountainCat('m',"black",'C',15.8,"Kitty",41,543,548);
        AndreanMountainCat cat4=new AndreanMountainCat('l',"blue",'B',15.8,"Lily",41,-543,548);
        NorwegianForestCat cat5=new NorwegianForestCat('s',"green",'D',23.6,"Oliver",45,9,4576);
        SiameseCat cat6=new SiameseCat('l',"red",'E',2.32,"Max",5,-3654,2354);
        TurkishVanCat cat7=new TurkishVanCat('m',"purple",'A',5.60,"Milo",4,-254,45,"simba");
        PersianCat cat8=new PersianCat( 's', "white",'A',15.3,"Bella",23,-454,3556);
        AndreanMountainCat cat9=new AndreanMountainCat('l',"blue",'B',15.8,"Lily",41,5543,-548);

        Felis[] types =new Felis[]{cat1,cat2,cat3,cat4,cat5,cat6,cat7,cat8,cat9};
        for(Felis felis:types){
            System.out.println(felis);
        }
     PersianCat pc=new PersianCat(333,543);
        SiameseCat sc=new SiameseCat(333,543);
        System.out.println("Is the cat same = " +pc.equals(sc));
       /* Je kunt zien dat de Felis en Animal klasse een static int variabele als ‘counter’ hebben.
                a.) zorg ervoor dat je het aantal animals en katten kunt opvragen via een static method (1)
        b.) De AndeanMountainCat is uitgestorven, en dus kan niet meer gevaccineerd worden. Zorg eroor
        dat de isAlive() methode false terug geeft.
        En als je zo een kat in je collection hebt, dan zorg je ervoor dat die niet wordt bij geteld bij de Felis
        static int. Het is niet belangrijk om hetzelfde te doen bij de Animal static animalCount. (2*/

        System.out.println("The total number of created animal are = "+Animal.getAnimalCount());
        System.out.println("The total number of vaccinated cats are = " +Felis.getVaccinationCount());
    }
}
