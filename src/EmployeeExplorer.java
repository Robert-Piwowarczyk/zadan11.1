import java.io.FileNotFoundException;

public class EmployeeExplorer {
    public static void main(String[] args) {
        final String EmployeersCompany = "EmployeersCompany.csv";
        try {
            Employee[] employees = EmployeeDataReader.readFile(EmployeersCompany);
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku o nazwie " + EmployeersCompany);
        }
    }
    private static void averagePayout(Employee[] employees, double salary) {
        double totalSalary = 0;
        double employeesSalary = 0;
        for (Employee employee : employees) {
            if (salary == employee.getSalary())
                totalSalary += employee.getSalary();
            employeesSalary++;
        }
        if (totalSalary > 0) {
            double averagePayout = totalSalary / employeesSalary;
            System.out.println("Srednia wypłata: " + averagePayout);
        }
    }
    private static void lowestPayment(Employee[] employees, double salary) {
        double lowestSalary = 0;
        for (Employee employee : employees) {
            if (salary < salary)
                salary = lowestSalary;
            System.out.println("Najmniejsza wypłata:" + lowestSalary);
        }
    }
    private static void largestPayment(Employee[] employees, double salary) {
        double largestSalary = 0;
        for (Employee employee : employees) {
            if (salary > salary)
                salary = largestSalary;
            System.out.println("Najmniejsza wypłata:" + largestSalary);
        }
    }
    private static void numberEmployeesSectionIt(Employee[] employees, String section) {
        String numberEmployeesSectionIt = null;
        for (Employee employee : employees) {
            if (section.equals(employee.getSection())) ;
            numberEmployeesSectionIt += employee.getSection();
            System.out.println("Liczba pracowników we wskazanym dziale:"
                    + numberEmployeesSectionIt);
        }
    }
}