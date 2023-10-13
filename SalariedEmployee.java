class SalariedEmployee extends Employee {

    float salary;

    SalariedEmployee() {
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public float computeGrossPay() {
        return salary;
    }

    public float computeNetPay(float taxRate) {
        return salary * (1 - taxRate);
    }
}
