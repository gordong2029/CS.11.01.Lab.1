import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        int young = 7 + (age/2);

        System.out.println(age + " year olds should only date someone that is " + young);
        scanner.close();


    }
}
