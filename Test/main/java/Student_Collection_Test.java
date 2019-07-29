import java.util.HashSet;
import java.util.Set;

public class Student_Collection_Test{

    private String ID;
    private String Name;

    public Set<Course_Collection_Test> courses;


    public String getID() {
        return this.ID;
    }

    private void setID(String ID){
        this.ID=ID;
    }

    public String getName() {
        return this.Name;
    }

    private void setName(String Name){
        this.Name=Name;
    }

    public Set getCourses() {
        return this.courses;
    }

    private void setCourses(Set courses){
        this.courses=courses;
    }

    public Student_Collection_Test (String ID,String Name){
        this.ID=ID;
        this.Name=Name;
        this.courses=new HashSet();
    }
}
