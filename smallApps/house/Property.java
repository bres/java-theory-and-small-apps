package smallApps.house;

public abstract class Property {
    private int id;
    protected double assessedValue;
    protected int area;

    public Property(int id, double assessedValue, int area) {
        this.id = id;
        this.assessedValue = assessedValue;
        this.area = area;
    }

    //other methods
    public abstract double calculateIncome();

    //toString

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                '}';
    }
}
