public class Coordinates {
    private double x, y;

    public boolean isInsideCircle() {
        return (this.x * this.x + this.y * this.y) < 1;
    }

    public boolean isThirdQuarter() {
        return this.y < 0;
    }

    public boolean isInsideAbs() {
        return (this.x > 0) && (this.y < 0) && (this.y > -this.x);
    }

    public boolean isInsideParable() {
        return this.y > this.x * this.x;
    }

    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
