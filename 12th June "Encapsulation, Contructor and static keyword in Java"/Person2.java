public class Person2 {
    private String name;
    private int age;

    public Person2() {
        // Default constructor
    }

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

    public static void main(String[] args) {
        Person2 person = new Person2();
        person.setName("John");
        person.setAge(25);
        System.out.println("Name: " + person.getName()); // Output: Name: John
        System.out.println("Age: " + person.getAge()); // Output: Age: 25
    }
}
