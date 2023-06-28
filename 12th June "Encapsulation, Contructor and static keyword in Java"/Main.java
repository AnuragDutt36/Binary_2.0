class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("John");
        person.setAge(30);

        String name = person.getName();
        int age = person.getAge();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
