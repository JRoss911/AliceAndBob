import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
public class Main {

    public static void main(String[] args) {
        identity();

    }

    public static String identity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Alice = "Alice";
        String Bob = "Bob";
        String identity = scanner.nextLine();

        if (identity.equals(Alice)) {
            System.out.println("Hello " + Alice + "!");

        } else if (identity.equals(Bob)) {
            System.out.println("Hello " + Bob + "!");

        } else {
            System.out.println("Hello Bob!");
        }
        return identity;
    }
}




        // Create conditional to check name against Alice and Bob

        // Print greeting to screen if Alice or Bob are true

        // Print "You are neither Alice nor Bob." otherwise




        //String name = scanner.nextLine();
//        String Alice = "Alice";
//        String Bob = "Bob";
//
//        public static identity;
//
//        if (identity = Alice);







        // call the compute() method on that new object

   /*public static void compute() {
        // Get input string of name from user
        String name = userName();
        String name1 = userName();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Print name: ");
        String name2 = scanner.nextLine();


        /*


        Public static String userName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print name: "); */