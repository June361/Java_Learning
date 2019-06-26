import java.util.ArrayList;
import java.util.List;

public class List_Generics{

    private List<Course_Collection_Test> Course;

    public List<Course_Collection_Test> getCourse() {
        return this.Course;
    }

    public void setCourse(List<Course_Collection_Test> Course){
        this.Course=Course;
    }

    public List_Generics (){
        this.Course=new ArrayList<Course_Collection_Test>();
    }
}
