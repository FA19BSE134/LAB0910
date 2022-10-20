public class Employee {
    double salary;
    int ID=0;
    String Name="";
    int Age=0;
    String Department="";

    public Employee(int id, String nam, int age, String dep, double salary)
    {
        this.ID= id;
        this.Name=nam;
        this.Age=age;
        this.Department=dep;
        this.salary=salary;
    }
}
