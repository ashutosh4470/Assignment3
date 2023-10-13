

/*Write java program to implement Inheritance with following example:
Person will have name and age as data members. Teacher and employee will 
inherit data members in the super class and 
create its own method myProfession() to display their profession.
 Then create objects of Teacher, Permanent, and 
 Contract employee to display their profession.
 */

class Person{
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Teacher extends Person{

    public void myProfession()
    {
        System.out.println("I am Teacher..");
    }
}

class Employee extends Person{

    public void myProfession()
    {
        System.out.println("I am Employee..");
    }
}

class PermanentEmployee extends Employee{

    public void myProfession()
    {
        System.out.println("I am Permanent Employee..");
    }
}

class ContractEmployee extends Employee{

    public void myProfession()
    {
        System.out.println("I am Contract  Employee..");
    }

}

public class A2_2 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        PermanentEmployee pEmployee = new PermanentEmployee();
        ContractEmployee cEmployee = new ContractEmployee();

        t.setName("Ashutosh");
        t.setAge(23);

        t.myProfession();
        pEmployee.myProfession();
        cEmployee.myProfession();
    }
}
