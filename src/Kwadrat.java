import static java.lang.Math.pow;

public class Kwadrat {

    public Kwadrat(int bok) {
        this.bok = bok;
    }
    private int bok;


    public int getObwod() {
        return 4*bok;
    }

    public double getPole() {
        return pow(bok, 2);
    }
}
