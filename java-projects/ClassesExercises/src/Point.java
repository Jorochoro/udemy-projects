import java.io.PipedOutputStream;

public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        return Math.pow(Math.pow(Math.abs(x-0), 2) + Math.pow(Math.abs(y-0), 2), .5);
    }

    public double distance (int x, int y) {
        return Math.pow(Math.pow(Math.abs(x-this.x), 2) + Math.pow(Math.abs(y-this.y), 2), .5);
    }

    public double distance (Point p) {
        return Math.pow(Math.pow(Math.abs(p.x-this.x), 2) + Math.pow(Math.abs(p.y-this.y), 2), .5);
    }
}
