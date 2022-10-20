import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Organization Or1 = new Organization();
        Scanner sc = new Scanner(System.in);

        Or1.Employees.add(new Employee(1, "Adil", 34, "Taxation", 78000.56));
        Or1.Employees.add(new Employee(2, "Rashid", 35, "Management", 38000.56));
        Or1.Employees.add(new Employee(3, "kashif", 36, "ObBoarding", 48000.56));
        Or1.Employees.add(new Employee(3, "mehran", 16, "ObBoarding", 48000.56));
        Or1.Employees.add(new Employee(3, "sultan", 30, "ObBoarding", 48000.56));

        Or1.Employees.add(new Employee(4, "altaf", 37, "Marketing", 28000.56));
        Or1.Employees.add(new Employee(5, "haider", 38, "Taxation", 98000.56));
        Or1.Employees.add(new Employee(6, "majid", 39, "Management", 68000.56));
        Or1.Employees.add(new Employee(7, "sarfaraz", 40, "Taxation", 58000.56));
        Or1.Employees.add(new Employee(8, "babar", 23, "ObBoarding", 18000.56));
        Or1.Employees.add(new Employee(9, "najam", 19, "Marketing", 88000.56));

        System.out.println("Enter 1 for Age<36, 2 for Salary>50000, & 3 for Salary<50,000 : ");
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Age < 36");
                //testing Age Iterator
                OrganizationAgeIterator ageIterator=Or1.GetAgeIterator();
                System.out.println("++++++++++++++++++++++");
                while(!ageIterator.isDone()){
                    System.out.println(Or1.Employees.get(ageIterator.iteratorIndex).Name);
                    ageIterator.Next();
                }
                break;
            case 2:
                System.out.println("Salary is greater than 50,000");
                OrganizationSalaryGreaterIterator OSGI = Or1.getSalaryGreaterIterator();
                while (!OSGI.isDone()){
                    System.out.println(Or1.Employees.get(OSGI.iteratorIndex).Name);
                    OSGI.Next();
                }
                break;
            case 3:
                System.out.println("Salary is lesser than 50,000");
                OrganizationSalaryLesserIterator OSLI = Or1.getSalaryLesserIterator();
                while (!OSLI.isDone()){
                    System.out.println(Or1.Employees.get(OSLI.iteratorIndex).Name);
                    OSLI.Next();
                }
                break;
            default:
                break;
        }

    }
}