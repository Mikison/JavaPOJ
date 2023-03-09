import static java.lang.Math.pow;

public class MyCircle {

    private double prominen;

    public MyCircle(double prominen) {
        this.prominen = prominen;
    }

    public double obwodCircle() {
        return 2*Math.PI * this.prominen;
    }

    public double poleCircle() {
        return Math.PI * pow(this.prominen, 2);
    }

    public double srednicaCircle() {
        return 2*this.prominen;
    }
}
