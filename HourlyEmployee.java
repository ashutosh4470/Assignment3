class HourlyEmployee extends Employee {
    float salary;

    HourlyEmployee() {
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public float computeGrossPay(float regularHours, float hourlyRate) {
        return regularHours * hourlyRate;
    }

    public float computeNetPay(float grossPay, float taxRate) {
        return grossPay * (1 - taxRate);
    }
}