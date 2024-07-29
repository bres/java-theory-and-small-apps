package smallApps.point;

public class Point2d extends Point{
    protected int y;
    // default constructor
    public Point2d() {
        super();
        this.y = 0;
    }
    //overloaded constructor
    public Point2d(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void showPoint() {
        super.showPoint();
        System.out.print(" y="+y);
    }
}
