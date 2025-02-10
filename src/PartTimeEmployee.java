public class PartTimeEmployee extends Employee{
    private int hours;
    private int hoursRate;

    public PartTimeEmployee(String name, int id, int hours, int hoursRate) {
        super(name, id);
        this.hours = hours;
        this.hoursRate = hoursRate;
    }

    @Override
    public double calculateSalery() {
        return hours*hoursRate;
    }
}
