package ie.gmit.studentmanagerpackage;

import java.util.Scanner;

/**
 * The Menu class provides a console-based menu interface
 * for the Student Manager application.
 */
public class Menu {

    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Starts the main menu loop.
     */
    public void start() {
        System.out.println("Welcome to the Student Manager Application");
        System.out.println("-------------------------------------------");
        // TODO: Implement menu options
        System.out.println("Menu is under construction.");
        scanner.close();
    }
}
