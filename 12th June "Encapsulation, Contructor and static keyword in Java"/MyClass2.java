public class MyClass2 {
    private String name;
    private int age;

    static {
        System.out.println("Static block executed");
    }

    public MyClass2() {
        System.out.println("Default constructor called");
    }

    public MyClass2(String name) {
        this.name = name;
        System.out.println("Constructor with name called");
    }

    public MyClass2(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with name and age called");
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        MyClass2 obj1 = new MyClass2();
        obj1.printDetails();
        System.out.println();

        MyClass2 obj2 = new MyClass2("John");
        obj2.printDetails();
        System.out.println();

        MyClass2 obj3 = new MyClass2("Jane", 25);
        obj3.printDetails();
    }
}
