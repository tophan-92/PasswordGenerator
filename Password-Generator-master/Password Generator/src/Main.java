import java.util.Scanner;

public class Main {

    public static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Generator generator = new Generator(keyboard); //new object created
        generator.mainLoop();  // loop to generate new password
        keyboard.close();  // close board 
        // new changes
    }
}
