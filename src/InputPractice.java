import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner kb = new Scanner(System.in);

        String stringInput = kb.next();
        System.out.println(stringInput);

        int intInput = kb.nextInt();
        System.out.println(intInput);

        double doubleInput = kb.nextDouble();
        System.out.println(doubleInput);

        float floatInput = kb.nextFloat();
        System.out.println(floatInput);

        String strInput2 = kb.next();
        int intInput2 = kb.nextInt();
        double doubleInput2 = kb.nextDouble();
        float floatInput2 = kb.nextFloat();
        System.out.println(strInput2);
        System.out.println(intInput2);
        System.out.println(doubleInput2);
        System.out.println(floatInput2);

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