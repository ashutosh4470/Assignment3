public class Payroll  
{
    private Employee[] employee = new Employee[3];

    //getter
    public Employee[] getEmployees()
    {
        return employee;
    }

    public void paySalary(){
        System.out.println("Paying salary");
    }

}
