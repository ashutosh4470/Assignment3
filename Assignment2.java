import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        HourlyEmployee hEmployee = new HourlyEmployee();
        SalariedEmployee sEmployee = new SalariedEmployee();
        hEmployee.setSsn(1000);
        hEmployee.setFirstName("Ashutosh");
        hEmployee.setLastName("Mahale");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hours: ");
        float regularHours = sc.nextFloat();

        System.out.print("Enter Hourly Rate: ");
        float hourlyRate = sc.nextFloat();

        float grossPay = hEmployee.computeGrossPay(regularHours, hourlyRate);
        System.out.println(hEmployee.getFirstName() + "'s Gross Pay: " + grossPay);

        float taxRate = 0.2f; // Assuming a tax rate of 20%
        float netPay = hEmployee.computeNetPay(grossPay, taxRate);
        System.out.println(hEmployee.getFirstName() + "'s Net Pay: " + netPay);
       
        System.out.println("---------------------------------------");
        sEmployee.setSsn(123344);
        sEmployee.setFirstName("Ashutosh");
        sEmployee.setLastName("Mahale");
        sEmployee.setSalary(50000);
        grossPay = sEmployee.computeGrossPay();
        System.out.println(sEmployee.getFirstName() + "'s Gross Pay : " + grossPay);

        netPay = sEmployee.computeNetPay(taxRate);
        System.out.println(sEmployee.getFirstName() + "'s NetPay : " + netPay);
    }
}
