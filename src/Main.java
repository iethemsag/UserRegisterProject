import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        String second_name;
        String lastname;
        int age;


        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Second Name: ");
        second_name = scanner.nextLine();
        System.out.print("Last Name: ");
        lastname = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();

        System.out.println("\tInformation\t" + "\n* Name: " + name + " \n* Second Name: " + second_name + " \n* Last Name: " + lastname + " \n* Age: " + age + "\n********************");
        System.out.println("LOG: saved in the register...");
    }
}