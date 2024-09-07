import java.util.Scanner;

class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3]; 

        System.out.println("Enter 3 numbers:");
        for (int i = 0; i < 3; i++) { 
            a[i] = sc.nextInt();
        }

        // Find the greatest number using conditional statements
        int greatest = a[0];

        if (a[1] > greatest) {
            greatest = a[1];
        }
        if (a[2] > greatest) {
            greatest = a[2];
        }

        System.out.println("The greatest number is: " + greatest);
    }
}
