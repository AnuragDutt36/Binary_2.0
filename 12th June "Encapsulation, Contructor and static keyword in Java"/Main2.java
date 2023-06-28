class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public void updateAge(int age) {
        this.age = age;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 30);
        employee.printDetails();

        employee.updateAge(35);
        employee.printDetails();
    }
}
