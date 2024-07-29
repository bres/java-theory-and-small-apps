package smallApps.house;

public class Parking extends Property{
    private int carCapacity;

    public Parking(int id, double assessedValue, int area,int carCapacity) {
        super(id, assessedValue, area);
        this.carCapacity=carCapacity;
    }

    @Override
    public double calculateIncome() {
        return assessedValue*area*0.004+10*carCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "-parking";
    }
}
