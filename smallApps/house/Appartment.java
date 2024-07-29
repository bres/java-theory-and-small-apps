package smallApps.house;

public class Appartment extends Property{

    public Appartment(int id, double assessedValue, int area) {
        super(id, assessedValue, area);
    }

    @Override
    public double calculateIncome() {
        return 0;
    }
}
