package constructor;

public class Employee {
    String name;
    String position;
    int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String info(int i){
        return "Name: " + name + " Position: " + position + " Salary: " + salary + " Salary in " + i + " month: " + salary * i;
    }
}
