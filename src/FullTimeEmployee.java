public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String Name, int ID, double monthlySalary){
        super(Name, ID);
        this.monthlySalary=monthlySalary;
    }
    @Override
    public double calculateSalery() {
        return monthlySalary ;
    }
}
