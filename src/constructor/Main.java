package constructor;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jack", "Programmer", 10000);
        System.out.println(employee.info(12));
    }
}
