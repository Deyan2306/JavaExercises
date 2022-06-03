package firstStepsInCodingLab;
import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projectsNuber = Integer.parseInt(scanner.nextLine());
        int totalHours = projectsNuber * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, totalHours, projectsNuber);
}
