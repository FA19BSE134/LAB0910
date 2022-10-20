import java.util.ArrayList;

public class OrganizationAgeIterator {

    ArrayList<Employee> employees;
    public OrganizationAgeIterator(ArrayList<Employee> orgToWorkOn){
        this.employees=orgToWorkOn;
        First();
    }
    int iteratorIndex=0;
    public void Next() {
        if (!isDone()) {
            iteratorIndex++;
            while (employees.get(iteratorIndex).Age < 36) {
                if (!isDone()) {
                    iteratorIndex++;
                }
            }
        }
    }
    public  void  First(){
        iteratorIndex =0;
        while (employees.get(iteratorIndex).Age<36)
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
