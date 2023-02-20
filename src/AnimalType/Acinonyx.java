package AnimalType;

public class Acinonyx extends Animal {
private double speed;

    public Acinonyx(char size, String color, char coat, double weight) {
        super(size, color, coat, weight);
    }

    public void run(double distance){
        System.out.println("Distance"+distance);
    }
    public void kiauuww(){
        System.out.println("kiauuww");
    }

    @Override
    public String toString() {
        return "Acinonyx{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
