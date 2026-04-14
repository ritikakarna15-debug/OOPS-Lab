// Grandparent Class
class Addition {
    int add(int a, int b) {
        return a + b;
    }
}

// Parent Class
class Subtraction extends Addition {
    int subtract(int a, int b) {
        return a - b;
    }
}

// Child Class
class Multiplication extends Subtraction {
    int multiply(int a, int b) {
        return a * b;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        
        Multiplication m = new Multiplication();
        
        System.out.println("Addition: " + m.add(10, 5));
        System.out.println("Subtraction: " + m.subtract(10, 5));
        System.out.println("Multiplication: " + m.multiply(10, 5));
    }
}