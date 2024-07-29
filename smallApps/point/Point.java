package smallApps.point;

public class Point {
    protected int x;
    private int y;

    public Point() {
        this.x=0;
        this.y=0;
    }

    public Point(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void showPoint() {
        System.out.print("\n x=" +x);
    }

}
