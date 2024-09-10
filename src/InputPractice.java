import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String stringInput = kb.next();
        System.out.println(stringInput);

        System.out.print("Enter an integer: ");
        int intInput = kb.nextInt();
        System.out.println(intInput);

        System.out.print("Enter a double: ");
        double doubleInput = kb.nextDouble();
        System.out.println(doubleInput);

        System.out.print("Enter a float: ");
        float floatInput = kb.nextFloat();
        System.out.println(floatInput);

        System.out.print("Enter a string, integer, double, and float on the same line and separated by a space: ");
        String strInput2 = kb.next();
        int intInput2 = kb.nextInt();
        double doubleInput2 = kb.nextDouble();
        float floatInput2 = kb.nextFloat();
        System.out.println(strInput2);
        System.out.println(intInput2);
        System.out.println(doubleInput2);
        System.out.println(floatInput2);

        System.out.println();
        System.out.println("Inputs from input.txt will now appear below");

        Scanner file = new Scanner(new File("input.txt"));
        file.nextLine();

        String line = file.nextLine();
        System.out.println(line);

        int int1 = file.nextInt();
        int int2 = file.nextInt();
        System.out.println(int1 + int2);

        double pi = file.nextDouble();
        System.out.println(pi);

        file.close();
        kb.close();
    }
}