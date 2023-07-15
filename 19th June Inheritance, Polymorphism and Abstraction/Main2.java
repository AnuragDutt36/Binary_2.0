abstract class Animal {
    abstract void makeSound();
    
    final void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }

    // Uncommenting the following code will result in a compilation error.
    // void sleep() {
    //     System.out.println("Cat is sleeping.");
    // }
}

public class Main2 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound();  // Output: "Meow!"
        cat.sleep();      // Output: "Animal is sleeping."
    }
}
