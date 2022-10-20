import java.util.ArrayList;

public class OrganizationSalaryGreaterIterator {

    ArrayList<Employee> employees;
    public OrganizationSalaryGreaterIterator(ArrayList<Employee> orgToWorkOn){
        this.employees=orgToWorkOn;
        First();
    }
    int iteratorIndex=0;
    public void Next() {
        if (!isDone()) {
            iteratorIndex++;
            while (employees.get(iteratorIndex).salary > 50000) {
                if (!isDone()) {
                    iteratorIndex++;
                }
            }
        }
    }
    public  void  First(){
        iteratorIndex =0;
        while (employees.get(iteratorIndex).salary>50000)
        {iteratorIndex++;}}
    public boolean isDone(){
        if(iteratorIndex<employees.size()-1){
            return false;}
        else {return  true;}


    }

    public  Employee currentItem(){
        return employees.get(iteratorIndex);
    }
}
