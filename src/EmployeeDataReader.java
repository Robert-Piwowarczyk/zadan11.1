import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployeeDataReader {
    static Employee[] readFile(String fileName) throws FileNotFoundException {
        final int linesNumber = countLines(fileName);
        Employee[] employees = new Employee[linesNumber];
        try (Scanner scanner = new Scanner(new File(fileName))) {
            for (
                    int i = 0;
                    i < linesNumber; i++) {
                String csvLine = scanner.nextLine();
                employees[i] = createEmployeeFromCsv(csvLine);
            }
            return employees;
        }
    }
    private static Employee createEmployeeFromCsv(String csvLine) {
        String[] word = csvLine.split(";");
        String firstName = word[0];
        String lastName = word[1];
        int pesel = Integer.parseInt(word[2]);
        String section = word[3];
        double salary = Double.parseDouble(word[4]);
        return new Employee(firstName, lastName, pesel, section, salary);
    }

    private static int countLines(String fileName) throws FileNotFoundException {
        int lines = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lines++;
            }
        }
        return lines;
    }
}






