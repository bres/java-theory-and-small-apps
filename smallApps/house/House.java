package smallApps.house;

public class House extends Property{
    private int yardArea;

    public House(int id, double assessedValue, int area, int yardArea) {
        super(id, assessedValue, area);
        this.yardArea = yardArea;
    }

    @Override
    public double calculateIncome() {
        return assessedValue*0.006*(area+yardArea/4);
    }

    @Override
    public String toString() {
        return super.toString() + "-house";
    }
}
