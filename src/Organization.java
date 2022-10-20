import java.util.ArrayList;

public class Organization {
    public ArrayList<Employee> Employees=new ArrayList<>();
    public OrganizationAgeIterator GetAgeIterator(){
        return new OrganizationAgeIterator(this.Employees);
    }
    public OrganizationSalaryGreaterIterator getSalaryGreaterIterator(){
        return new OrganizationSalaryGreaterIterator(this.Employees);
    }
    public OrganizationSalaryLesserIterator getSalaryLesserIterator(){
        return new OrganizationSalaryLesserIterator(this.Employees);
    }
}
