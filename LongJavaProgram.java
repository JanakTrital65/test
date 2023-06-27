import java.util.*;

public class LongJavaProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to the Long Java Program!");

        // Variables
        int number = 10;
        // Conditional statements
        if (number > 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is less than or equal to 5");
        }

        // Loops
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }

        int count = 0;
        while (count < 3) {
            System.out.println("While loop iteration " + count);
            count++;
        }

        // Arrays and collections
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array length: " + numbers.length);

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // Object-oriented programming
        Person person = new Person("John", 25);
        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());

        // Exception handling
        try {
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // File I/O
        // ... (File reading or writing operations)

        // Recursion
        int factorialResult = factorial(5);
        System.out.println("Factorial of 5: " + factorialResult);

        // Multithreading
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: " + i);
            }
        });

        thread1.start();
        thread2.start();

        // Networking
        // ... (Networking operations)

        // External libraries
        // ... (Integration with external libraries)

        System.out.println("End of the Long Java Program!");
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
