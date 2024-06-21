import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner; // Note: Do not change this line.
    public static void manageGrades() {
        GradeSystem my_system = new GradeSystem();
        boolean flag = true;
        while(flag){
            my_system.printOptions();
            switch(scanner.nextInt()){
                case 1:
                    my_system.addStudent();
                    break;
                case 2:
                    my_system.displayAll();
                    break;
                case 3:
                    my_system.calculateAverage();
                    break;
                case 4:
                    my_system.topStudent();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public static void main(String[] args) throws IOException {
        String path = args[0];
        scanner = new Scanner(new File(path));
        int numberOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfTests; i++)
        {
            System.out.println("Test number " + i + " starts.");
            try {
                manageGrades();
            } catch(Exception e){
                System.out.println("Exception " + e);
            }
            System.out.println("Test number " + i + " ended.");
            System.out.println("-----------------------------------------------");
        }
        System.out.println("All tests have ended.");
    }
}
