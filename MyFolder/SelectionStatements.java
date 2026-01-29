
public class SelectionStatements {
    public static void main(String[] args) {
        int num = 2;

        // if-else
        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println(num + " is Zero");
        }

        // Switch case
        switch (num) {
            case 1:
                System.out.println("Number is One");
                break;
            case 2:
                System.out.println("Number is Two");
                break;
            default:
                System.out.println("Number is something else");
        }

        // Jumping example
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue; // skip 3
            if (i == 5) break;    // stop at 5
            System.out.println("i = " + i);
        }
    }
}
