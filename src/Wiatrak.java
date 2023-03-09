public class Wiatrak {

     static final int SLOW = 1;
     static final int MEDIUM = 2;
     static final int FAST = 3;

    private int speed;
    private boolean isOn;
    private double radius;
    private String color;

    public Wiatrak() {
        this.speed = MEDIUM;
        this.isOn = true;
        this.radius = 5;
        this.color = "Zielony";
    }


    public Wiatrak(int speed, boolean isOn, double radius, String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }

    public String getInformation() {
        return "Prędkość " + this.speed + ", Włączony? " + this.isOn + ", Promień: " + this.radius + ", Kolor: " + this.color;
    }
}
