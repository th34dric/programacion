import java.util.Scanner;

public class BucleDoWhile {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String PASSWORD = "contraseña";

        String pass = "";

        do {
            System.out.println("Introduce una contraseña valida");
            pass = sc.nextLine();
        } while (!PASSWORD.equals(pass));
    }
}
