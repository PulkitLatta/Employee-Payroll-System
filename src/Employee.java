abstract class Employee {

    private String employeeName;
    private int employeeID;


   public  Employee(String employeeName ,int employeeID) {
       this.employeeName =employeeName;
        this.employeeID = employeeID;
    }
    public String getname(){
       return employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }
    public abstract double calculateSalery();

    @Override
    public String toString() {
        return "Employee [Name= " +employeeName+" ID= "+ employeeID + " Salery= "+calculateSalery() +" ]";
    }

}
