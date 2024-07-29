package smallApps.point;

public class Point3d extends Point2d{
    protected int z;

    public Point3d() {
    }

    public Point3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public void showPoint() {
        super.showPoint();
        System.out.print(" z="+z);
    }
}
