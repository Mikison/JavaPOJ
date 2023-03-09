public class Punkt {

    private int x;
    private int y;


    public Punkt() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double calculateDistanceBetweenPointsWithHypot(double x1, double y1) {
        double ac = Math.abs(this.y - y1);
        double cb = Math.abs(this.x - x1);

        return Math.hypot(ac, cb);
    }

    public double calculateDistanceBetweenPointsWithHypot(Punkt punkt2) {
        double ac = Math.abs(this.y - punkt2.y);
        double cb = Math.abs(this.x - punkt2.x);

        return Math.hypot(ac, cb);
    }


}
