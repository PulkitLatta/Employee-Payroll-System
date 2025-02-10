import java.util.ArrayList;

public class PayRollSystem {
    private ArrayList<Employee> employeeList;
    public PayRollSystem(){
        employeeList=new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(int id){
        Employee removeEmployeeId = null;
        for(Employee employee: employeeList){
            if(employee.getEmployeeID()==id){
                removeEmployeeId= employee;
                break;
            }
        }
        if(removeEmployeeId != null) employeeList.remove(removeEmployeeId);
    }
    public void displayEmployee(){
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }


}
