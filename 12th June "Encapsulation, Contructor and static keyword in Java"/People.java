public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        People people = new People("John", 25);
        System.out.println("Name: " + people.getName()); // Output: Name: John
        System.out.println("Age: " + people.getAge()); // Output: Age: 25
    }
}
