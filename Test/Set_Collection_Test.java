import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Set_Collection_Test{

    private List<Course_Collection_Test> Course_to_Select;

    public List<Course_Collection_Test> getCourse_to_Select() {
        return this.Course_to_Select;
    }

    private void setID(List<Course_Collection_Test> Course_to_Select){
        this.Course_to_Select=Course_to_Select;
    }

    public Set_Collection_Test (){
        this.Course_to_Select=new ArrayList<Course_Collection_Test>();
    }
}
