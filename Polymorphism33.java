class Animal {
    void makeSound(String volume) { }
}
class Dog extends Animal {
    @Override
    void makeSound(String volume) { } // Error: lowercase 's' in makesound
}
class ElectronicDevice {
    void start() {
        System.out.println("Device started");
    }
}

class Fan extends ElectronicDevice {
    void start() {
        System.out.println("Fan is rotating");
    }
}

class LED extends ElectronicDevice {
    void start() {
        System.out.println("LED is glowing");
    }
}

class Motor extends ElectronicDevice {
    void start() {
        System.out.println("Motor is running");
    }
}

public class Polymorphism33 {
    public static void main(String[] args) {
        ElectronicDevice device;

        device = new Fan();
        device.start();

        device = new LED();
        device.start();

        device = new Motor();
        device.start();
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class OverloadingDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
    }
}